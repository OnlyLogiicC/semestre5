#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>
#include "buffer_circ.h"


struct buffer_circ_s {
    int debut, fin, vide, taille ;
    int * buffer ;
} ;

buffer_circ_p buffer_circ_init(int taille) {
    buffer_circ_p b ;
    b = malloc(sizeof(struct buffer_circ_s)) ;
    if (!b) {
        perror("erreur allocation memoire\n") ;
        exit errno ;
    }
    b->buffer = malloc(sizeof(int)*b->taille) ;
    if (!b->buffer) {
        perror("erreur allocation memoire\n") ;
        exit errno ;
    }
    b->taille = taille ;
    b->vide = 1 ;
    b->debut = 0 ;
    b->fin = 0 ;
    return b ;
}

void buffer_circ_enfiler(buffer_circ_p b, int valeur) {
    b->buffer[b->fin] = valeur ;
    b->vide = 0 ;
    if (buffer_circ_est_plein(b)) {
        b->debut = (b->debut + 1) % b->taille ;
    }
    b->fin = (b->fin + 1) % b->taille ;
}

int buffer_circ_defiler(buffer_circ_p b) {
    int out ;
    if (buffer_circ_est_vide(b)) {
        perror("buffer vide !") ;
        return NULL ;
    }
    out = b->buffer[b->debut] ;
    b->debut = (b->debut + 1) % taille ;
    if (b->debut == b->fin) {
        b->vide = 1 ;
    }
    return out ;

}

int buffer_circ_est_plein(const buffer_circ_p b) {
    return (!(b->vide) && (b->debut == b->fin)) ;
}

int buffer_circ_est_vide(const buffer_circ_p b) {
    return (b->vide) ;
}

void buffer_circ_supprimer(buffer_circ_p b) {
    free(b->buffer) ;
    b->buffer = NULL ;
    free(b) ;
    b = NULL ;
}