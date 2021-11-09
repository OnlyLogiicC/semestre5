#include <stdio.h>
#include <stdlib.h>

#define taille 10 


int main(int argc, char * argv[]) {
    
    int m, n, i, k, l ;

    
    m = atoi(argv[1]) ;
    n = argc-m-3 ;
    int tab1[taille] ;
    int tab2[taille] ;
    int tab[2*taille] ;
    for (i=0; i<m; i++){
        tab1[i] = atoi(argv[i+2]) ;
        }
    for (i=0; i<n; i++){
        tab2[i] = atoi(argv[i+3+m]) ;
        }

    k = 0 ;
    l = 0 ;
    while (k + l < n + m){
        if (k < m && l < n){
            if (tab1[k] <= tab2[l]) {
                tab[k+l] = tab1[k] ;
                k +=1 ;
            }
            else{
                tab[k+l] = tab2[l] ;
                l +=1 ;
            }
        }
        if (k == m){
            for(i=l ; i < n; i++){
                tab[k+i] = tab2[i] ;
                
            }
            l = n ;
        }
        if (l == n){
            for(i=k ; i < m; i++){
                tab[l+i] = tab1[i] ;
            } 
            k = m ;   
        }
    }
    for (i = 0 ; i < m+n ; i++){
        printf("%d ",tab[i]) ;
    } 
    printf("\n") ;
    return 0 ;
    }


