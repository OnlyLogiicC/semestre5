#include <stdio.h>
#include <math.h>

int main (int argc, char * argv[]) {
    float a, b, c, delta, r1, r2 ;

    printf("Entrer les trois reels : \n") ;
    scanf("%f", &a) ;
    scanf("%f", &b) ;
    scanf("%f", &c) ;
    delta = b*b-4*a*c ;
    if (delta > 0){
        r1 = ((-b)- sqrt(delta)) / (2*a) ;
        r2 = ((-b) + sqrt(delta))/(2*a) ;
        printf("Il y a deux racines : \n%f\n%f\n",r1,r2) ;
    }
    else if (delta < 0){
        printf("Il n'y a pas de racines reels") ;
    }
    else {
        r1 = -b/(2*a) ;
        printf("Il y a une seule racine : \n%f\n",r1) ;
    }
    return 0 ;
}