#include <stdio.h>

void remove_mid(int arr[], int elem){
    int idx = 0;

    while (arr[idx] != elem && arr[idx] != '\0') idx++;
    if ( arr[idx] == '\0')
        return;
    
    for (; arr[idx] != '\0'; idx++){
        arr[idx] = arr[idx+1];
    }

}

int main(void){

    int N = 6;

    int array[N];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    array[5] = '\0';

    int i;

    for(i = 0; i < N-1; i++)
        printf("%d ",array[i]);

    remove_mid(array, 5);
    printf("%c",'\n');
    for(i = 0; i < N-2; i++)
        printf("%d ",array[i]);

    return 0;
}