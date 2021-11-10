#include "graphes.h"
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <assert.h>

int main(int argc, char* argv[]) {
    
    graphe g = grapheVide() ;
    ajouterSommet('A',&g) ; ajouterSommet('B',&g) ; ajouterSommet('C',&g) ;
    ajouterSommet('D',&g) ;
    ajouterArc('a','A','B',&g) ; ajouterArc('b','A','B',&g) ;
    ajouterArc('c','A','C',&g) ; ajouterArc('d','A','C',&g) ;
    ajouterArc('e','A','D',&g) ;
    ajouterArc('f','C','D',&g) ;
    ajouterArc('g','B','D',&g) ;
    return 0 ;
}