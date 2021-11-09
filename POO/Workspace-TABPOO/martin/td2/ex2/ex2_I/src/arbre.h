#ifndef ARBRE_H_
#define ARBRE_H_

typedef struct arbre * t_arbre ;


t_arbre arbreVide() ;
t_arbre arbreCons(void * e, t_arbre fg, t_arbre fd) ;
int vide(t_arbre a) ;
void * valeur(t_arbre a) ;




#endif