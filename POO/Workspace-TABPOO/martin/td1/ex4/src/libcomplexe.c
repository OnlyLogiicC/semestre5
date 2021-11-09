#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "libcomplexe.h"

complex_cart init_cart(float re, float im) {
    complex_cart x ;
    x->re = re ;
    x->im = im ;
    return x ;
}

complex_pol init_pol(float r, float teta) {
    complex_cart x ;
    x->r = re ;
    x->teta = im ;
    return x ;
}

complex_cart add_comp_cart(complex_cart x , complex_cart y) {
    complex_cart res ;
    res->re = x.re + y.re ;
    res->im = x.im + y.im ;
    return res ;
}

complex_cart sous_comp_cart(complex_cart x , complex_cart y) {

}

char* affich_comp_cart(complex_cart x) {
    char re[10] ;
    char 
    sprintf(re, "%f", x.re) ;
    return str[80] ;
}

char* affich_comp_pol(complex_pol x) {
    char str[80] ;
    sprintf(str, "%f*exp(%f)", x.r, x.teta) ;
    return str[80] ;
}