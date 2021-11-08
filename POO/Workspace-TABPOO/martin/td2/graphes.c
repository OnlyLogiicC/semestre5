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

void ajouterSommer(char valeur, graphe *g){
    sommet som ;
    l_sommet s = (l_sommet)malloc(sizeof(struct nso)) ;
    som.valeur = valeur ;
    som.arcs = NULL ;
    s->s = som ;
    s->suivant = NULL ;
    if (*g)==NULL {
        *g
    }

    
}