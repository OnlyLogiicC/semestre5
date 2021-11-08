#ifndef TABLEAU_NOIR_COND_G_H_
#define TABLEAU_NOIR_COND_G_H_

#include <pthread.h>
 

typedef struct blackboard {
    void * val ;
    pthread_mutex_t m ;
    pthread_cond_t c;
    int fresh ;
} *t_blackboard  ;

t_blackboard initbboard(void * valeur) ;

void killbboard(t_blackboard bboard) ;

void ecriture(t_blackboard board, void * message);

void * lecture(t_blackboard board);



#endif