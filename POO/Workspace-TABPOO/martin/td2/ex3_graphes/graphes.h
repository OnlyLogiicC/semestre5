#ifndef GRAPHES_H_
#define GRAPHES_H_


typedef struct so sommet ;
typedef struct ar arc ;
typedef struct nso * l_sommet ;
typedef struct nar * l_arc ;

typedef l_sommet graphe;

graphe grapheVide();
void ajouterSommet(char valeur, graphe *g);
void ajouterArc(char valeur, char s1, char s2, graphe *g);
void affichergraphe(graphe g);

#endif