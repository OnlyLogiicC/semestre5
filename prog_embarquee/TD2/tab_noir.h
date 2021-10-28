#ifndef TABLEAU_NOIR_H_
#define TABLEAU_NOIR_H_

#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>

typedef struct blackboard {
    int val ;
    pthread_mutex m ;
    int fresh ;
} t_blackboard ;

t_blackboard initbboard() ;

void killbboard(t_blackboard bboard) ;






#endif