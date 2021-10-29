#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>
#include "tab_noir.h"


t_blackboard initbboard(int valeur){
    t_blackboard board;
    board =(t_blackboard) malloc(sizeof(struct blackboard));
    board->val = valeur ;
    board->fresh = 1;
    pthread_mutex_init(&(board->m),0);
    return board;
}

void ecriture(t_blackboard board, int message){
    pthread_mutex_lock(&(board->m));
    board->val = message;
    board->fresh = 1;
    pthread_mutex_unlock(&(board->m));
}

int lecture(t_blackboard board){
    pthread_mutex_lock(&(board->m));
    board->fresh =0;
    return board->val;
}

int  lecture2(t_blackboard board, int * message){
    int nouvelle = board->fresh;
    pthread_mutex_lock(&(board->m));
    board->fresh =0;
    * message = board->val;
    return nouvelle ;
}

void killbboard(t_blackboard board){
    pthread_mutex_destroy(&(board->m));
    free(board);
}
