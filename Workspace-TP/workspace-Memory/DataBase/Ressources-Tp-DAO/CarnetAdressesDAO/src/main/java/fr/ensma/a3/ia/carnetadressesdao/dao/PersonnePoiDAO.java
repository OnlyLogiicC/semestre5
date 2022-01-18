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

import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

public class PersonnePoiDAO extends AbstractPoiDAO<PersonneEntity> {

	private static Logger LOGGER = Logger.getLogger(PersonnePoiDAO.class.getName());
	
	@Override
	public Optional<PersonneEntity> getById(int id) {
		XSSFWorkbook bdd = openBase();
		Sheet tableadr = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableadr.iterator();
		iterator.next();
		boolean trouve = false;
		PersonneEntity prs = null;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			prs = new PersonneEntity();
			if (id == (int)ligne.getCell(0).getNumericCellValue()) {
				prs.setIdPers((int)ligne.getCell(0).getNumericCellValue());
				prs.setNom(ligne.getCell(1).getStringCellValue());
				prs.setPrenom(ligne.getCell(2).getStringCellValue());
				prs.setAdressePers_FK((int)ligne.getCell(3).getNumericCellValue());
				trouve = true;
			}
		}
		if (trouve) {
			closeBase(bdd);
			return Optional.of(prs);
		}
		closeBase(bdd);
		return Optional.empty();
	}

	@Override
	public Optional<PersonneEntity> getByValue(PersonneEntity elem) {
		List<PersonneEntity> listtemp = getAll();
		for (PersonneEntity ad : listtemp) {
			if (ad.equals(elem)) {
				return Optional.of(ad);
			}
		}
		return Optional.empty();
	}

	@Override
	public List<PersonneEntity> getAll() {
		XSSFWorkbook bdd = openBase();
		Sheet tableadr = bdd.getSheet("Personnes");
		ArrayList<PersonneEntity> listeadr = new ArrayList<PersonneEntity>();
		Iterator<Row> iterator = tableadr.iterator();
		iterator.next();
		while (iterator.hasNext()) {
			Row ligne = iterator.next();
			PersonneEntity prs = new PersonneEntity();
			Iterator<Cell> cellIterator = ligne.iterator();
			Cell cellule = cellIterator.next();
			prs.setIdPers((int)cellule.getNumericCellValue());
			prs.setNom(ligne.getCell(1).getStringCellValue());
			prs.setPrenom(ligne.getCell(2).getStringCellValue());
			prs.setAdressePers_FK((int)ligne.getCell(3).getNumericCellValue());
			listeadr.add(prs);
		}
		closeBase(bdd);
		return listeadr;
	}

	@Override
	public void create(PersonneEntity elem) {
		if (getByValue(elem).isEmpty()) {
			XSSFWorkbook bdd = openBase();
			Sheet tableprs = bdd.getSheet("Personnes");
			int lrow = tableprs.getLastRowNum();
			int lid = (int) tableprs.getRow(lrow).getCell(0).getNumericCellValue();
			elem.setIdPers(lid + 1);
			Row ligne = tableprs.createRow(lrow + 1);
			Cell cell = ligne.createCell(0);
			cell.setCellValue(elem.getIdPers());
			cell = ligne.createCell(1);
			cell.setCellValue(elem.getNom());
			cell = ligne.createCell(2);
			cell.setCellValue(elem.getPrenom());
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
		Sheet tableprs = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableprs.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPers() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				ligne.getCell(1).setCellValue(elem.getNom());
				ligne.getCell(2).setCellValue(elem.getPrenom());
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
		Sheet tableprs = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableprs.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPers() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				removeRow(tableprs, ligne.getRowNum());
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
