#include "graphes.h"
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <assert.h>

typedef struct so{
    char valeur;
    l_arc arcs;
};
typedef struct nso{
    sommet s;
    l_sommet suivant;
};
typedef struct ar arc{
    char valeur;
    l_sommet s1;
    l_sommet s2;
};
typedef struct nar{
    arc a;
    l_arc suivant;
};

graphe grapheVide(){
    graphe g = NULL ;
    return g ;
}

void ajouterSommet(char valeur, graphe *g){
    sommet som ;
    l_sommet ite ;
    l_sommet psom = (l_sommet)malloc(sizeof(struct nso)) ;
    som.valeur = valeur ;
    som.arcs = NULL ;
    psom->s = som ;
    psom->suivant = NULL ;
    if (*g)==NULL {
        *g = psom ;
    } else {
        ite = (*g)->suivant ;
        while (ite != NULL) {
            ite = ite->suivant ;
        }
        ite->suivant = psom ;
    }
}

void ajouterArc(char valeur, char s1, char s2, graphe *g) {
    
}

    
}