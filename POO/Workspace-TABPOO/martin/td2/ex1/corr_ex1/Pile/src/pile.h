#ifndef PILE_H_
#define PILE_H_

#include "deque.h"

typedef struct deque_st *t_pile;

/**
 * Initialise une Pile générique
 * 
 * return : une pile vide
 * */
t_pile initPile();

/**
 * Empile un élément
 * 
 * param elem
 * */
void empile(void * elem, t_pile pile); 

/**
 * Depile un element
 * 
 * return un element
 * */
void * depile(t_pile pile);

/**
 * Test si la pile est vide
 * 
 * return int
 * */
int pileVide(t_pile pile);

/**
 * Supprime la pile en mémoire (vide ou non)
 * */
void deletePile(t_pile *pile);

/**
 * Affiche la pile
 * */
void printPile(const t_pile pile, void (*printElem)(void *));

#endif