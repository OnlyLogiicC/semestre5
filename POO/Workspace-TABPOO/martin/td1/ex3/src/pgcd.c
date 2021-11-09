#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int pgcd(int a, int b) {
    int static pg ;
    int min = a ;

    if (abs(a-b)){
        if (b < min){
            min = b;
        }
        pg = pgcd(abs(a-b), min) ;
        return pg ;
    }
    return min ;

}

int main(int argc, char * argv[]) {
    int pgc ;
    int val1 = atoi(argv[1]) ;
    int val2 = atoi(argv[2]) ;
    pgc = pgcd(val1, val2) ;
    printf("%d\n", pgc) ;
    return 0 ;

}