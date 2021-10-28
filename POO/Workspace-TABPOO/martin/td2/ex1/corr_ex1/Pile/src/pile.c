#include "pile.h"

t_pile initPile(){
    return init();
}

void empile(void * elem, t_pile pile){
    insertQueue(pile,elem);
}

void * depile(t_pile pile){
    return removeQueue(pile);
}

void deletePile(t_pile *pile){
    deleteDeque(pile);
}

void printPile(const t_pile pile, void (*printElem)(void *)){
    printDeque(pile, printElem);
}

int pileVide(t_pile pile){
    return sizeDeque(pile)==0;
}
