#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <errno.h>

#include "deque.h"

int main(void) {
    int i ;
    t_deque deque ;
    deque = init() ;
    for (i=0 ; i<1 ; i++) {
        insert_haut(i, deque) ;
    }
    afficher_deque(deque) ;
    printf("%d\n", remove_haut(deque)) ;
    kill(deque) ;
    return 0 ;
}