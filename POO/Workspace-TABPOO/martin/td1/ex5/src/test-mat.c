#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <errno.h>

#include "matrice.h"

int main(void) {
    int dim1 = 2 ;
    int dim2 = 2 ;
    T_matrice mat1 = create_matrice(dim1, dim2) ;
    T_matrice mat2 = create_matrice(dim1, dim2) ;
    T_matrice mat_out = create_matrice(dim1, dim2) ;
    saisie_matrice(mat1) ;
    afficher_matrice(mat1) ;
    saisie_matrice(mat2) ;
    afficher_matrice(mat2) ;
    mat_out = mult_matrice(mat1, mat2) ;
    afficher_matrice(mat_out) ;
    kill_matrice(mat1) ;
    kill_matrice(mat2) ;
    kill_matrice(mat_out) ;
    
    return 0 ;
}