#ifndef LIBCOMPLEXE_H_
#define LIBCOMPLEXE_H_

#include <stdio.h>
#include <math.h>


typedef struct complex_cart {
    float re ;
    float im ;
} complex_cart ;


typedef struct complex_pol {
    float r ;
    float teta ;
} complex_pol ;

complex_cart init_cart(float re , float im) ;
complex_pol init_pol(float r, float teta) ;


complex_cart add_comp_cart(complex_cart x , complex_cart y) ;
complex_cart sous_comp_cart(complex_cart x , complex_cart y) ;
complex_pol add_comp_pol(complex_pol x , complex_pol y) ;
complex_pol sous_comp_pol(complex_pol x , complex_pol y) ;
complex_cart multi_comp_cart(complex_cart x, complex_cart y) ;
complex_pol multi_comp_pol(complex_pol x, complex_pol y) ;
complex_cart div_comp_cart(complex_cart x, complex_cart y) ;
complex_pol div_comp_pol(complex_pol x, complex_pol y) ;

complex_cart add_comp_cart_reel(complex_cart x, float reel) ;
complex_pol add_comp_pol_reel(complex_pol x, float reel) ;
complex_cart sous_comp_cart_reel(complex_cart x, float reel) ;
complex_pol sous_comp_pol_reel(complex_pol x, float reel) ;
complex_cart multi_comp_cart_reel(complex_cart x, float reel) ;
complex_pol multi_comp_pol_reel(complex_pol x, float reel) ;
complex_cart div_comp_cart_reel(complex_cart x, float reel) ;
complex_pol div_comp_pol_reel(complex_pol x, float reel) ;

char affich_comp_cart(complex_cart x) ;
char affich_comp_pol(complex_pol x) ;




#endif