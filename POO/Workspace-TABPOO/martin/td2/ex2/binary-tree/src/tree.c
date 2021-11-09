#include "tree.h"
#include <stdlib.h>
#include <stdio.h>
#include <errno.h>
#include <assert.h>

#include "pile.h"
#include "file.h"

#undef MAX
#define MAX(a,b) ((a) > (b) ? (a) : (b))

struct node_st {
    void * value;
    struct node_st * left;
    struct node_st * right;
};

typedef struct node_st node;

t_tree empty_tree() {
    return NULL;
}

t_tree build_tree(void * e, t_tree left, t_tree right) {
    node * n = malloc(sizeof(node));
    if (n == NULL) {
        perror("malloc() in build_tree() failed");
        return NULL;
    }
    n->value = e;
    n->left = left;
    n->right = right;
    return n;
}

t_tree build_leaf(void * e) {
    return build_tree(e, NULL, NULL);
}

t_tree left(t_tree t) {
    errno = 0;
    if (t == NULL) {
        errno = EINVAL;
        return NULL;
    }
    return t->left;
}

t_tree right(t_tree t) {
    errno = 0;
    if (t == NULL) {
        errno = EINVAL;
        return NULL;
    }
    return t->right;
}

int height(t_tree t) {
    if (t == NULL) {
        return 0;
    } else if (left(t) == NULL && right(t) == NULL) {
        return 1;
    } else {
        return MAX(height(t->left), height(t->right)) + 1;
    }
}

int size(t_tree t) {
    if (t == NULL) {
        return 0;
    } else {
        return size(t->left) + size(t->right) + 1;
    }
}

void * root_value(t_tree t) {
    errno = 0;
    if (t == NULL) {
        errno = EINVAL;
        return NULL;
    }
    return t->value;
}

int is_empty(t_tree t) {
    return t == NULL;
}

void destroy_tree(t_tree *t) {
    if (*t != NULL) {
        destroy_tree(&((*t)->left));
        destroy_tree(&((*t)->right));
        free(*t);
        *t=NULL;
    }
}

void display_tree_indent(t_tree t, void (*display_elem)(void*), int indent) {
    int i;
    if (t == NULL) {
        return;
    }
    for (i = 0; i < indent-1; i++) {
        printf("│   ");
    }
    if (indent > 0) {
        printf("├── ");
    }
    display_elem(t->value);
    printf("\n");
    display_tree_indent(t->left, display_elem, indent+1);
    display_tree_indent(t->right, display_elem, indent+1);
}

void display_tree(t_tree t, void (*display_elem)(void*)) {
    display_tree_indent(t, display_elem, 0);
}

/*===== Parcours =====*/
void prefixe(t_tree t,void (*display_elem)(void *)){
    if(t!=NULL){
        display_elem(t->value);
        prefixe(left(t),display_elem);
        prefixe(right(t),display_elem);
    }
}

void infixe(t_tree t,void (*display_elem)(void *)){
    if(t!=NULL){
        infixe(left(t),display_elem);
        display_elem(t->value);
        infixe(right(t),display_elem);
    }
}

void suffixe(t_tree t,void (*display_elem)(void *)){
    if(t!=NULL){
        suffixe(left(t),display_elem);
        suffixe(right(t),display_elem);
        display_elem(t->value);
    }
}

void profondeurPref(t_tree t,void (*display_elem)(void *)){
    t_pile pile;
    t_tree elem = NULL;
    pile = initPile();
    empile(t,pile);    
    while (!(pileVide(pile))){
                elem = depile(pile);
        display_elem(elem->value);
       if (right(elem)!=NULL){
            empile(right(elem),pile);
        }
        if (left(elem)!=NULL){
            empile(left(elem),pile);
       }
    }
}

void largeur(t_tree t,void (*display_elem)(void *)) {
    t_tree elem = NULL;
    t_file file = initFile();
    enfile(t,file);
    while (!(fileVide(file))){
        elem = defile(file);
        display_elem(elem->value);
        if (left(elem)!=NULL){
            enfile(left(elem),file);
        }
        if (right(elem)!=NULL){
            enfile(right(elem),file);
        }
    }
}
