#ifndef TABLEAU_NOIR_COND_H_
#define TABLEAU_NOIR_COND_H_

#include <pthread.h>
 

typedef struct blackboard * t_bal1_int  ;

t_bal1_int initbboard(int valeur) ;

void killbboard(t_bal1_int bboard) ;

void envoyer(t_bal1_int board, int message);

int recevoir(t_bal1_int board);



#endif