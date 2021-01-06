#include <stdio.h>


int *  remove_mid(int arr[], int N){

    int i = N / 2; 
    if (i % 2 != 0)
        i--;
    
    for (; i < N -1; i++){
        arr[i] = arr[i+1];
    }
    arr --;

    return arr;
}


int main(void){

    int N;

    scanf("%d",&N);

    int i, arr[N];

    for(i = 0; i < N; i++)
        scanf("%d",&arr[i]);

    remove_mid(arr,N);

    for(i = 0; i < N-1; i++)
        printf("%d ",arr[i]);

    return 0;
}