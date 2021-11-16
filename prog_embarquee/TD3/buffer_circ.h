#ifndef BUFFER_CIRC_H
#define BUFFER_CIRC_H


typedef struct buffer_circ_s * buffer_circ_p ;

buffer_circ_p buffer_circ_init(int taille) ;
void buffer_circ_enfiler(buffer_circ_p b, int valeur) ;
int buffer_circ_defiler(buffer_circ_p b) ;
int buffer_circ_est_vide(const buffer_circ_p b) ;
int buffer_circ_est_plein(const buffer_circ_p b) ;
void buffer_circ_supprimer(buffer_circ_p b) ;

#endif