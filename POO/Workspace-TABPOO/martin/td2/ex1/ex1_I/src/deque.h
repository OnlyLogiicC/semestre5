#ifndef DEQUE_H_
#define DEQUE_H_

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <errno.h>

typedef struct deque * t_deque ;

t_deque init() ; /*creation et allocation mémoire du deque*/
void insert_haut(void* e, t_deque deque) ; /*insert par le haut du deque*/
void insert_bas(void* e, t_deque deque) ; /*insert par le bas du deque*/
void* remove_haut(t_deque deque) ;  /*necessite deque non vide*/
void* remove_bas(t_deque deque) ;  /*idem*/
int isEmpty(t_deque deque) ; /*teste si une deque est vide : 1 -> vide ; 0 sinon */
void* lire_haut(t_deque deque) ; /*necessite deque non vide*/
void* lire_bas(t_deque deque) ; /*necessite deque non vide*/
void afficher_deque(void (*f)(void*), t_deque deque) ;
void kill(t_deque deque) ;

#endif