#ifndef TREE_H_
#define TREE_H_

typedef struct node_st * t_tree;

t_tree empty_tree();

t_tree build_tree(void * e, t_tree left, t_tree right);
t_tree build_leaf(void * e);

int height(t_tree t);
int size(t_tree t);
t_tree right(t_tree t);
t_tree left(t_tree t) ;
void * root_value(t_tree t);
int is_empty(t_tree t);
void destroy_tree(t_tree *t);

void display_tree(t_tree t, void (*display_elem)(void*));

void prefixe(t_tree t,void (*display_elem)(void *));
void infixe(t_tree t,void (*display_elem)(void *));
void suffixe(t_tree t,void (*display_elem)(void *));
void profondeurPref(t_tree t,void (*display_elem)(void *));
void largeur(t_tree t,void (*display_elem)(void *));
#endif