#ifndef BAL_OU_H
#define BAL_OU_H

#include "buffer_circ.h"

typedef struct bal_ou_s * bal_ou_p ;

bal_ou_p bal_ou_init() ;
void bal_ou_send(bal_ou_p b, int adr, int val) ;
int bal_ou_receive(bal_ou_p b, int* id) ;

#endif