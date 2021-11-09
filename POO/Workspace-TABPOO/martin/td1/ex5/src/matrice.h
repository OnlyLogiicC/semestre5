#ifndef MATRICE_H_
#define MATRICE_H_

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <errno.h>


typedef struct matrice * T_matrice ;

/*typedef struct matrice *T_matrice ;*/

T_matrice create_matrice(int dim1, int dim2) ;
void kill_matrice(T_matrice matrice) ;
void saisie_matrice(T_matrice matrice) ;
void afficher_matrice(T_matrice matrice) ;
T_matrice add_matrice(T_matrice mat1, T_matrice mat2) ;
T_matrice mult_matrice(T_matrice mat1, T_matrice mat2) ;


#endif