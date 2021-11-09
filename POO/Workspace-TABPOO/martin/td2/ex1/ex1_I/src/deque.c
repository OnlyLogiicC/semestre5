#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <errno.h>

#include "deque.h"


typedef struct cell {
    void* data ;
    struct cell * sup ;
    struct cell * inf ;
} * t_cell ;

struct deque {
    int nbelem ;
    t_cell haut ;
    t_cell bas ;
} ;


t_deque init() {
    t_deque deque ;
    errno = 0 ;
    deque = (t_deque)malloc(sizeof(struct deque)) ;
    if (errno) {
        perror("erreur allocation") ;
        exit errno ;
    }
    deque->nbelem = 0 ;
    deque->haut = NULL ;
    deque->bas = NULL ;
    return deque ;
}

int isEmpty(t_deque deque) {
    if (deque->nbelem == 0) {
        return 1 ;
    }
    return 0 ;
}

void insert_haut(void* e, t_deque deque) {
    t_cell cell = (t_cell)malloc(sizeof(*t_cell)) ;
    cell->data = e ;
    if (isEmpty(deque) == 1) {
        deque->haut = cell ;
        deque->bas = cell ;
    }
    else {
        (*cell).inf = (*deque).haut ;
        deque->haut = cell ;
    }
    deque->nbelem += 1 ;
}

void insert_bas(void* e, t_deque deque) {
    t_cell cell = (t_cell)malloc(sizeof(*t_cell)) ;
    cell->data = e ;
    if (isEmpty(deque) == 1) {
        deque->haut = cell ;
        deque->bas = cell ;
    }
    else {
        (*cell).sup = (*deque).bas ;
        deque->bas = cell ;
    }
    deque->nbelem += 1 ;
}

void* remove_haut(t_deque deque) {
    t_cell cell ;
    void* s ;
    cell = deque->haut ;
    errno = 0 ;
    if (isEmpty(deque)) {
        perror("deque vide\n") ;
        errno = -1 ;
        return 0 ;
    }
    s = cell->data ;
    if (deque->nbelem == 1) {
        free(cell) ;
        deque->haut = NULL ;
        deque->bas = NULL ;
    }
    else {
        deque->haut = (deque->haut)->inf ;
        (deque->haut)->sup = NULL ;
        free(cell) ;
        cell = NULL ;
    }
    deque->nbelem -= 1 ;
    return s ;
}

void* remove_bas(t_deque deque) {
    t_cell cell ;
    void* s ;
    cell = deque->bas ;
    errno = 0 ;
    if (isEmpty(deque)) {
        perror("deque vide\n") ;
        errno = -1 ;
        return 0 ;
    }
    s = cell->data ;
    if (deque->nbelem == 1) {
        free(cell) ;
        deque->haut = NULL ;
        deque->bas = NULL ;
    }
    else {
    deque->bas = (deque->bas)->sup ;
    (deque->bas)->inf = NULL ;
    free(cell) ;
    cell = NULL ;
    }
    deque->nbelem -= 1 ;
    return s ;
}

void* lire_haut(t_deque deque) {
    void* s ;
    errno = 0 ;
    if (isEmpty(deque)) {
        perror("deque vide\n") ;
        errno = -1 ;
        return 0 ;
    }
    s = (deque->haut)->data ;
    return s ;
}

void* lire_bas(t_deque deque) {
    void* s ;
    errno = 0 ;
    if (isEmpty(deque)) {
        perror("deque vide\n") ;
        errno = -1 ;
        return 0 ;
    }
    s = (deque->bas)->data ;
    return s ;
}

void afficher_deque(void (*f)(void*), t_deque deque) {
    int i ;
    t_cell next ;
    next = deque->haut ;
    for (i=0 ; i<deque->nbelem ; i++) {
        f(next->data) ;
        next = next->inf ;
    }
    printf("\n") ;
}

void kill(t_deque *deque) {
    int i, n ;
    n = (*deque)->nbelem ;
    for (i = 0 ; i<n-1 ; i++) {
        remove_bas(*deque) ;
    }
    free(*deque) ;
    *deque = NULL ;
}