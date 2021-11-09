#include <stdio.h>
#include <stdlib.h>


int fact(int n) {
    int fact = 1 ;
    int i ;
    for (i=1 ; i<n+1 ; i++) {
        fact *= i ;
    }
    return fact ;
}


int main(int argc, char * argv[]) {
    int facto = atoi(argv[1]) ;
    facto = fact(facto) ;
    printf("%d\n", facto) ;
    return 0 ;
}