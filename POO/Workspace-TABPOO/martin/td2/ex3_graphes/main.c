#include "graphes.h"
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <assert.h>

int main(int argc, char* argv[]) {
    
    graphe g = grapheVide() ;
    ajouterSommet('A',&g) ; ajouterSommet('B',&g) ; ajouterSommet('C',&g) ;
    ajouterSommet('D',&g) ;
    ajouterArc('a','A','B',&g) ; printf("a joute\n"); ajouterArc('b','A','B',&g) ; printf("b ajoute \n");
    ajouterArc('c','A','C',&g) ; printf("c ajoute \n"); ajouterArc('d','A','C',&g) ; printf("d ajoute \n");
    ajouterArc('e','A','D',&g) ; printf("e ajoute \n");
    ajouterArc('f','C','D',&g) ; printf("f ajoute \n");
    ajouterArc('g','B','D',&g) ; printf("g ajoute \n");
    affichergraphe(g) ;
    return 0 ;
}