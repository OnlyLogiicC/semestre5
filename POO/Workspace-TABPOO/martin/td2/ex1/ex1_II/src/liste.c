#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <errno.h>
#include <assert.h>

#include "liste.h"



struct liste {
    int nb ;
    struct cell* first ;
    struct cell* last ;
    struct cell* position  ;
} ;


struct cell {
    void* data ;
    struct cell * next ;
    struct cell * prev ;
} ;


t_liste init() {
    t_liste liste ;
    errno = 0 ;
    liste = (t_liste)malloc(sizeof(struct liste)) ;
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    }
    liste->nb = 0 ;
    return liste ;
}

t_cell First(t_liste liste){
    assert(liste != NULL) ;
    return liste->first ;
}

t_cell Last(t_liste liste){
    assert(liste != NULL) ;
    return liste->last;
}

t_cell prev(t_cell position){
    assert(position != NULL) ;
    return position->prev ;
}

t_cell next(t_cell position){
    assert(position != NULL) ;
    return position->next ;
}

void * replace(t_cell position, void * elem){
    assert(elem != NULL) ;
    assert(position != NULL) ;
    void * tmp = position->data ;
    position->data = elem ;
    return tmp ;
}

t_cell insertFirst(t_liste liste, void * elem){
    t_cell cellule ;
    errno = 0 ;
    assert(elem != NULL) ;
    assert(liste != NULL) ;
    cellule = (t_cell)malloc(sizeof(*t_cell)) ;
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    cellule->next = liste->first ;
    cellule->data = elem ;
    (liste->first)->prev = cellule ;
    liste->nb++ ;
    liste->first = cellule ;
    return cellule ;    
}

t_cell insertLast(t_liste liste, void * elem){
    t_cell cellule ;
    errno = 0 ;
    assert(liste != NULL) ;
    assert(elem != NULL) ;
    cellule = (t_cell)malloc(sizeof(*t_cell)) ;
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    cellule->prev = liste->last ;
    cellule->data = elem ;
    (liste->last)->next = cellule ;
    liste->nb++ ;
    liste->last = cellule ;
    return cellule ;    
}

t_cell insertBefore(t_liste liste, t_cell position, void * elem){
    t_cell cellule ;
    errno = 0 ;
    assert(liste != NULL) ;
    assert(position != NULL) ;
    assert(elem != NULL) ;
    cellule = (t_cell)malloc(sizeof(*t_cell));
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    cellule->next = position ;
    cellule->prev = position->prev ;
    cellule->data = elem ;
    (position->prev)->next = cellule ; 
    position->prev = cellule ;
    liste->nb++ ;
    return cellule ;
}

t_cell insertAfter(t_liste liste, t_cell position, void * elem){
    t_cell cellule ;
    errno = 0 ;
    assert(liste != NULL) ;
    assert(position != NULL) ;
    assert(elem != NULL) ;
    cellule = (t_cell)malloc(sizeof(*t_cell));
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    cellule->prev = position ;
    cellule->next = position->next ;
    cellule->data = elem ;
    (position->next)->prev = cellule ; 
    position->next = cellule ;
    liste->nb++ ;
    return cellule ;
}

void * remove_elem(t_liste liste, t_cell position){
    assert(liste != NULL) ;
    assert(position != NULL) ;
    void * elem = position->data ;
    (position->prev)->next = position->next ;
    (position->next)->prev = position->prev ;
    free(position) ;
    position = NULL ;
    liste->nb--;
}

int size(t_liste liste){
    assert(liste != NULL) ;
    int taille = liste->nb ;
    return taille ;
}

int isEmpty(t_liste liste){
    assert(liste != NULL) ;
    if (liste->nb == 0){
        return 1;
    }
    return(0);
}

void * view(t_cell cell){
    return cell->data ;
}

void kill_liste(t_liste liste) {
    assert(liste != NULL) ;
    free(liste) ;
    liste = NULL ;
}





















