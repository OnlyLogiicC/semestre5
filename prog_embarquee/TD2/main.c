#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <pthread.h>
#include <signal.h>
#include <errno.h>

#include "tab_noir_cond.h"

t_bal1_int blettre ;


void time_add(struct timespec * t1, time_t tv_sec, long tv_nsec) {
    t1->tv_nsec += tv_nsec ;
    t1->tv_sec += tv_sec + (t1->tv_nsec/1000000000) ;
    t1->tv_nsec %= 1000000000 ;

}

void tache1() {
    struct timespec horloge ;
    clock_gettime(CLOCK_MONOTONIC, &horloge) ;
    while (1) {
        time_add(&horloge,1,0) ;
        printf("T1\n") ;
        clock_nanosleep(CLOCK_MONOTONIC, TIMER_ABSTIME, &horloge, 0) ;
    }
}

void watchdog_sig_func(int sig) {}

void * f_watchdog(void* v) {
    struct timespec delai={5,0} ;
    signal(SIGRTMIN,watchdog_sig_func) ;
    sigset_t set, oset ;
    sigemptyset(&set) ;
    sigaddset(&set,SIGRTMIN) ;
    sigprocmask(SIG_UNBLOCK, &set, &oset) ;
    while (1) {
        if (clock_nanosleep(CLOCK_MONOTONIC,0,&delai,NULL)!=EINTR) {
            printf("ALARME!!\n") ;
        }
    }
    return 0 ;
}

void tache2(pthread_t * pthr_wdog) {
    int entier ;
    struct timespec t ;
    while (1) {
        printf("yo\n") ;
        scanf("%d", &entier) ;
        pthread_kill(*pthr_wdog,SIGRTMIN) ;
        clock_gettime(CLOCK_MONOTONIC,&t) ;
        time_add(&t,1,0) ;
        envoyer(blettre,entier) ;
        printf("yo2\n") ;
        clock_nanosleep(CLOCK_MONOTONIC,TIMER_ABSTIME,&t,0) ;
    }
}

void tache3(t_bal1_int blettre) {
    int x ;
    while (1) {
        x = recevoir(blettre) ;
        printf("%d", x) ;
    }
}

void main(int argc, char * argv[]) {

    struct timespec t1 ;
    t_bal1_int blettre = initbboard(0) ;
    /*clock_gettime(CLOCK_REALTIME, &t1) ;
    printf("sec : %d s\n", t1.tv_sec) ;
    printf("nanosec : %d ns\n", t1.tv_nsec) ;
    time_add(&t1, 1, 50) ;
    printf("sec : %d s\n", t1.tv_sec) ;
    printf("nanosec : %d ns\n", t1.tv_nsec) ;*/
    pthread_t T1, T2, T3, thr_wdog ;
    pthread_create(&T1, 0, (void*(*)(void*))tache1,0) ;
    pthread_create(&thr_wdog,0,(void*(*)(void*))f_watchdog,0) ;
    pthread_create(&T2, 0, (void*(*)(void*))tache2,&thr_wdog) ;
    pthread_create(&T3, 0, (void*(*)(void*))tache3,blettre) ;
    pthread_join(T1, NULL) ;

}