#ifndef TABLEAU_NOIR_H_
#define TABLEAU_NOIR_H_

#include <pthread.h>
 

typedef struct blackboard {
    int val ;
    pthread_mutex_t m ;
    int fresh ;
} *t_blackboard  ;

t_blackboard initbboard(int valeur) ;

void killbboard(t_blackboard bboard) ;

void ecriture(t_blackboard board, int message);

int lecture(t_blackboard board);

int lecture2(t_blackboard board, int * message);




#endif