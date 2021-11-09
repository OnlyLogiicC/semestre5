#include "tree.h"
#include <stdlib.h>
#include <stdio.h>

void printEntier(void *v){
    printf("%d",*((int *)v));
}

void printEntier2(void *v){
    printf("-%d-",*((int *)v));
}

int main(int argc, char* argv[]) {
    t_tree thetree;
    int val = 2;
    int val1 = 9;
    int valg = 5;
    int vald = 6;
    int val2 = 8;
    int valg2 = 10;
    int vald2 = 15;
    int vald3 = 27;
    thetree = empty_tree();
    thetree = build_tree(&val,
        build_tree(&val1,build_leaf(&valg),
            build_tree(&vald,NULL,build_leaf(&vald3))),
        build_tree(&val2,build_leaf(&valg2),build_leaf(&vald2)));

    display_tree(thetree,printEntier);
    printf("Valeur de la racine : ");
    printEntier(root_value(thetree));printf("\n");  
    printf("Hauteur de l'arbre : %d\n",height(thetree) );
    printf("Taille de l'arbre : %d\n",size(thetree) );
   
    printf("\nParcours prefixe - Rec :\n");
    prefixe(thetree,printEntier2);
    
    printf("\nParcours infixe - Rec :\n");
    infixe(thetree,printEntier2);
    
    printf("\nParcours suffixe - Rec :\n");
    suffixe(thetree,printEntier2);
    printf("\n");
   
    printf("\nParcours profondeur prefixe - ité :\n");
    profondeurPref(thetree,printEntier2);
    
    printf("\nParcours largeur - ité :\n");
    largeur(thetree,printEntier2);
    printf("\n");
  
    destroy_tree(&thetree);
    return 0; 
}