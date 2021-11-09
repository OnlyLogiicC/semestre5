#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <errno.h>

#include "matrice.h"

struct matrice {
    float ** mat ;
    int dim1 ;
    int dim2 ;
} ;

T_matrice create_matrice(const int dim1, const int dim2) {
    int i ;
    T_matrice matrice = (T_matrice)malloc(sizeof(T_matrice)) ;
    if (matrice == NULL) {
        perror("malloc failed") ;
        return matrice ;
    }
    else {
        matrice->dim1 = dim1 ;
        matrice->dim2 = dim2 ;
        matrice->mat = (float **)calloc(dim1, sizeof(float*)) ;
        if (matrice->mat == NULL) {
            perror("malloc failed") ;
            return NULL ;
        }
        else {
            for(i=0; i < dim1; i++){
                matrice->mat[i] = (float *)calloc(dim2, sizeof(float)) ;
                if (matrice->mat[i] == NULL) {
                    perror("malloc failed") ;
                    return NULL ;
                }
            }
        }
    }
    return matrice ;
}

void kill_matrice(T_matrice matrice) {
    int i ;
    for(i=0; i < matrice->dim1; i++){
        free(matrice->mat[i]) ;
        matrice->mat[i] = NULL ;
    }
    free(matrice->mat) ;
    matrice->mat = NULL ;
    free(matrice) ;
    matrice = NULL ;
}

void lecture_matrice(float* x) {
    printf("%f", *x) ;
}

void ecriture_matrice(float* x) {
    printf("Rentrer valeur : ") ;
    scanf("%f", x) ;
}

void parcours_matrice(void (*f)(float* x), T_matrice matrice) {
    int i, j ;
    for (i=0 ; i<matrice->dim1 ; i++){
        for (j=0 ; j<matrice->dim2 ; j++){
            f(&(matrice->mat[i][j])) ;
        }
        printf("\n") ;
    }
}

void saisie_matrice(T_matrice matrice) {
    parcours_matrice(ecriture_matrice, matrice) ;
}

void afficher_matrice(T_matrice matrice) {
    parcours_matrice(lecture_matrice, matrice) ;
}

T_matrice add_matrice(T_matrice mat1, T_matrice mat2) {
    int i, j ;
    T_matrice mat_out ;
    if ((mat1->dim1 != mat2->dim1) || (mat1->dim2 != mat2 ->dim2)) {
        printf("Les deux matrices ne font pas la même taille") ;
        return NULL ;
    }
    mat_out = create_matrice(mat1->dim1, mat1->dim2) ;
    for (i=0 ; i<mat1->dim1 ; i++){
        for (j=0 ; j<mat1->dim2 ; j++){
            mat_out->mat[i][j] = mat1->mat[i][j] + mat2->mat[i][j] ;
        }
    }
    return mat_out ;
}

T_matrice mult_matrice(T_matrice mat1, T_matrice mat2) {
    int i, j, k ;
    T_matrice mat_out ;
    if (mat1->dim2 != mat2->dim1) {
        printf("produit impossible") ;
        return NULL ;
    }
    mat_out = create_matrice(mat1->dim1, mat1->dim2) ;
    for (i=0 ; i<mat1->dim1 ; i++){
        for (j=0 ; j<mat2->dim2 ; j++){
            mat_out->mat[i][j] = 0 ;
            for (k=0 ; k<mat1->dim2 ; k++){
                mat_out->mat[i][j] += (mat1->mat[i][k])*(mat2->mat[k][j]) ;
            }
        }
    }
    return mat_out ;
}