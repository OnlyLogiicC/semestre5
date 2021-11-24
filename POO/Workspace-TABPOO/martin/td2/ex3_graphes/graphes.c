#include "graphes.h"
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <assert.h>

typedef struct so {
    char valeur;
    l_arc arcs;
} sommet;
typedef struct nso {
    sommet s;
    l_sommet suivant;
}* l_sommet;
typedef struct ar {
    char valeur;
    l_sommet s1;
    l_sommet s2;
} arc;
typedef struct nar {
    arc a;
    l_arc suivant;
}* l_arc ;

graphe grapheVide(){
    graphe g = NULL ;
    return g ;
}

void ajouterSommet(char valeur, graphe *g){
    sommet som ;
    l_sommet ite = (l_sommet)malloc(sizeof(struct nso)) ;
    l_sommet psom = (l_sommet)malloc(sizeof(struct nso)) ;
    som.valeur = valeur ;
    som.arcs = NULL ;
    psom->s = som ;
    psom->suivant = NULL ;
    if ((*g) == NULL) {
        *g = psom ;
    } else {
        ite = (*g) ;
        while (ite->suivant != NULL) {
            ite = ite->suivant ;
        }
        ite->suivant = psom ;
    }
}

void ajouterArc(char valeur, char s1, char s2, graphe *g) {
    arc arc ;
    l_arc parc = (l_arc)malloc(sizeof(struct nar)) ;
    l_sommet ite1 = (l_sommet)malloc(sizeof(struct nso));
    l_arc ite2 = (l_arc)malloc(sizeof(struct nar)) ;
    l_arc ite3 = (l_arc)malloc(sizeof(struct nar)) ;
    if ((*g) == NULL) {
        perror("impossible d'ajouter un arc à un graphe vide, creez d'abord les sommets") ;
        exit(0) ; }
    arc.valeur = valeur ;
    ite1 = (*g) ;
    while (ite1->s.valeur != s1) {
        ite1 = ite1->suivant ;
        if (ite1 == NULL) {
            perror("le sommet s1 n'existe pas !") ;
            exit(0) ;
        }
    }
    printf("recherche s1 ok \n");
    arc.s1 = ite1 ;
    ite1 = (*g) ;
    while (ite1->s.valeur != s2) {
        ite1 = ite1->suivant ;
        if (ite1 == NULL) {
            perror("le sommet s2 n'existe pas !") ;
            exit(0) ;
        }
    }
    printf("recherche s2 ok \n");
    arc.s2 = ite1 ;
    parc->a = arc ;
    parc->suivant = NULL ;
    if (((arc.s1)->s).arcs == NULL){
        ((arc.s1)->s).arcs = parc ;
    } else {
        ite2 = (((arc.s1)->s).arcs) ;
        while (ite2->suivant != NULL) {
            ite2 = ite2->suivant ;
        }
        ite2->suivant = parc ;
    }
    printf("ajout arc s1 ok\n");
    if (((arc.s2)->s).arcs == NULL){
        ((arc.s2)->s).arcs = parc;    
    } else {
        ite3 = (((arc.s2)->s).arcs);
        while (ite3->suivant != NULL) {
            ite3 = ite3->suivant ;
        }
        ite3->suivant = parc ;
    }
    printf("ajout arc s2 ok\n");
}

void affichergraphe(graphe g) {
    l_sommet ite1 ;
    l_arc ite2 ;
    if (g == NULL) {
        perror("le grpahe est vide") ;
        exit(0) ;
    }
    ite1 = g ;
    while (ite1 != NULL) {
        printf("sommet %c\n", ite1->s.valeur) ;
        ite2 = ite1->s.arcs ;
        while (ite2 != NULL) {
            printf("arc %c = (%c,%c)\n", ite2->a.valeur, (((ite2->a).s1)->s).valeur, (((ite2->a).s2)->s).valeur) ;
            ite2 = ite2->suivant ;
        }
        ite1 = ite1->suivant ;
    }
}
