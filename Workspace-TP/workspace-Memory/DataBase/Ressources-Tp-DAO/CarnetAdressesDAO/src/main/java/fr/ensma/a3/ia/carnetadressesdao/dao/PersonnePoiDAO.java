package fr.ensma.a3.ia.carnetadressesdao.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fr.ensma.a3.ia.carnetadressesdao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

public class PersonnePoiDAO extends AbstractPoiDAO<PersonneEntity> {
	
	private static Logger LOGGER = Logger.getLogger(PersonnePoiDAO.class.getName()) ;

	@Override
	public Optional<PersonneEntity> getById(int id) {
		XSSFWorkbook bdd = openBase() ;
		Sheet tablepers = bdd.getSheet("Personnes") ;
		Iterator<Row> iterator = tablepers.iterator() ;
		iterator.next() ;
		boolean trouve = false ;
		PersonneEntity pers = null ;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			pers = new PersonneEntity() ;
			if (id == (int)ligne.getCell(0).getNumericCellValue()) {
				pers.setIdPers((int)ligne.getCell(0).getNumericCellValue());
				pers.setNomPers(ligne.getCell(1).getStringCellValue());
				pers.setPrenomPers(ligne.getCell(2).getStringCellValue());
				pers.setAdressePers_FK((int)ligne.getCell(3).getNumericCellValue());
				trouve = true ;
			}
		}
		if (trouve) {
			closeBase(bdd) ;
			return Optional.of(pers) ;
		}
		closeBase(bdd);
		return Optional.empty() ;
	}

	@Override
	public Optional<PersonneEntity> getByValue(PersonneEntity elem) {
		List<PersonneEntity> listtemp = getAll();
		for (PersonneEntity pers : listtemp) {
			if (pers.equals(elem)) {
				return Optional.of(pers);
			}
		}
		return Optional.empty();
	}

	@Override
	public List<PersonneEntity> getAll() {
		XSSFWorkbook bdd = openBase();
		Sheet tablepers = bdd.getSheet("Personnes");
		ArrayList<PersonneEntity> listepers = new ArrayList<PersonneEntity>();
		Iterator<Row> iterator = tablepers.iterator();
		iterator.next();
		while (iterator.hasNext()) {
			Row ligne = iterator.next();
			PersonneEntity pers = new PersonneEntity();
			Iterator<Cell> cellIterator = ligne.iterator();
			Cell cellule = cellIterator.next();
			pers.setIdPers((int)cellule.getNumericCellValue());
			pers.setNomPers(ligne.getCell(1).getStringCellValue());
			pers.setPrenomPers(ligne.getCell(2).getStringCellValue());
			pers.setAdressePers_FK((int)ligne.getCell(3).getNumericCellValue());
			listepers.add(pers);
		}
		closeBase(bdd);
		return listepers;
	}

	@Override
	public void create(PersonneEntity elem) {
		if (getByValue(elem).isEmpty()) {
			XSSFWorkbook bdd = openBase();
			Sheet tablepers = bdd.getSheet("Personnes");
			int lrow = tablepers.getLastRowNum();
			int lid = (int) tablepers.getRow(lrow).getCell(0).getNumericCellValue();
			elem.setIdPers(lid + 1);
			Row ligne = tablepers.createRow(lrow + 1);
			Cell cell = ligne.createCell(0);
			cell.setCellValue(elem.getIdPers());
			cell = ligne.createCell(1);
			cell.setCellValue(elem.getNomPers());
			cell = ligne.createCell(2);
			cell.setCellValue(elem.getPrenomPers());
			cell = ligne.createCell(3);
			cell.setCellValue(elem.getAdressePers_FK());
			writeBase(bdd);
			closeBase(bdd);
		} else {
			//TODO : Prévoir une exception ...
			LOGGER.log(Level.INFO,"Element Deja dans la base ...");
		}

	}

	@Override
	public void update(PersonneEntity elem) {
		XSSFWorkbook bdd = openBase();
		Sheet tablepers = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tablepers.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPers() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				ligne.getCell(1).setCellValue(elem.getNomPers());
				ligne.getCell(2).setCellValue(elem.getPrenomPers());
				ligne.getCell(3).setCellValue(elem.getAdressePers_FK());
				writeBase(bdd);
			}
		}
		if (!trouve) {
			//TODO : Prévoir une exception ...
			LOGGER.log(Level.INFO,"Element absent de la base ...");
		}
		closeBase(bdd);

	}

	@Override
	public void delete(PersonneEntity elem) {
		XSSFWorkbook bdd = openBase();
		Sheet tablepers = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tablepers.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPers() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				removeRow(tablepers, ligne.getRowNum());
				writeBase(bdd);
			}
		}
		if (!trouve) {
			//TODO : Prévoir une exception ...
			LOGGER.log(Level.INFO,"Element absent de la base ...");
		}
		closeBase(bdd);

	}


}
