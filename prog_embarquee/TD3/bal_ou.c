#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>
#include "bal_ou.h"
#include "buffer_circ.h"

struct bal_ou_s {
    buffer_circ bal1 ;
    int bal2, vide2 ;
    buffer_circ bal3 ;
    pthread_mutex_t m ;
    pthread_cond_t c_rcv,c_snd3, c_snd2 ;
} ;

