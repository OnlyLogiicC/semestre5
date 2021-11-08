#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>
#include "tab_noir_cond.h"

t_blackboard initbboard(int valeur){
    t_blackboard board;
    board =(t_blackboard) malloc(sizeof(struct blackboard));
    board->val = valeur ;
    board->fresh = 1;
    pthread_mutex_init(&(board->m),0);
    pthread_cond_init(&(board->c),0);
    return board;
}

void ecriture(t_blackboard board, int message){
    pthread_mutex_lock(&(board->m));
    board->val = message;
    board->fresh = 1;
    pthread_cond_broadcast(&(board->c));
    pthread_mutex_unlock(&(board->m));
}

int lecture(t_blackboard board){
    pthread_mutex_lock(&(board->m));
    while(board->fresh == 0){
        pthread_cond_wait(&(board->c),&(board->m));
    }
    board->fresh =0;
    return board->val;
}


void killbboard(t_blackboard board){
    pthread_mutex_destroy(&(board->m));
    pthread_cond_destroy(&(board->c));
    free(board);
}
