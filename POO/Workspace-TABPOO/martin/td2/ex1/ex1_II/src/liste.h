#ifndef LISTE_H_
#define LISTE_H_

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <errno.h>




typedef struct liste * t_liste ;
typedef struct cell * t_cell ;

t_liste init() ;
t_cell First(t_liste liste) ;
t_cell Last(t_liste liste) ;    
t_cell prev(t_cell position) ;
t_cell next(t_cell position) ;
t_cell insertFirst(t_liste liste, void * elem) ;
t_cell insertLast(t_liste liste, void * elem) ;
t_cell insertBefore(t_liste liste, t_cell position, void * elem) ;
t_cell insertAfter(t_liste liste, t_cell position, void * elem) ;
void * remove_elem(t_liste liste, t_cell position) ;
int size(t_liste liste) ;
int isEmpty(t_liste liste) ;
void* view(t_cell position) ;    
void kill_liste(t_liste liste) ;


#endif