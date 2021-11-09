#include <stdio.h>
#include <stdlib.h>

int fact(int n) {
    int static facto = 1 ;  
    if (n) {
        facto = fact(n-1)*n ;
    }
    else {
        facto = 1 ;
    }
    return facto ;
}

int main(int argc, char * argv[]) {
    int factor = atoi(argv[1]) ;
    factor = fact(factor) ;
    printf("%d\n", factor) ;
    return 0 ;
}