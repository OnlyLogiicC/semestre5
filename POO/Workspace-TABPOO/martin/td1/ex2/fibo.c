#include <stdio.h>

int main (int argc, char * argv[]) {
    int i, n, fn, fn1, f;
    fn = 0 ;
    fn1 = 1;
    scanf("%d", &n) ;
    if (n==0){ printf("%d\n",fn);}
    
    else if (n==1){printf("%d\n",fn1);}
    else {
       for (i=0 ; i<n-1 ; i=i+1){
           f = fn1 ;
           fn1 = fn1 + fn ;
           fn = f ;
       }
       printf("%d\n",fn1) ;
    }
    return 0 ;
}
