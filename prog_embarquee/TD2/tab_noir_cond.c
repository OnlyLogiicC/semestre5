#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>
#include "tab_noir_cond.h"

struct blackboard {
    int val ;
    pthread_mutex_t m ;
    pthread_cond_t c;
    int fresh ;
} ;

t_bal1_int initbboard(int valeur){
    t_bal1_int board;
    board =(t_bal1_int) malloc(sizeof(struct blackboard));
    board->val = valeur ;
    board->fresh = 1;
    pthread_mutex_init(&(board->m),0);
    pthread_cond_init(&(board->c),0);
    return board;
}

void envoyer(t_bal1_int board, int message){
    pthread_mutex_lock(&(board->m));
    printf("yo2\n") ;
    board->val = message;
    board->fresh = 1;
    pthread_cond_broadcast(&(board->c));
    pthread_mutex_unlock(&(board->m));
}

int recevoir(t_bal1_int board){
    pthread_mutex_lock(&(board->m));
    while(board->fresh == 0){
        pthread_cond_wait(&(board->c),&(board->m));
    }
    board->fresh =0;
    pthread_mutex_unlock(&(board->m));
    return board->val;
}


void killbboard(t_bal1_int board){
    pthread_mutex_destroy(&(board->m));
    pthread_cond_destroy(&(board->c));
    free(board);
}
