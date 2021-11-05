#ifndef TABLEAU_NOIR_COND_H_
#define TABLEAU_NOIR_COND_H_

#include <pthread.h>
 

typedef struct blackboard {
    int val ;
    pthread_mutex_t m ;
    pthread_cond_t c;
    int fresh ;
} *t_blackboard  ;

t_blackboard initbboard(int valeur) ;

void killbboard(t_blackboard bboard) ;

void ecriture(t_blackboard board, int message);

int lecture(t_blackboard board);



#endif