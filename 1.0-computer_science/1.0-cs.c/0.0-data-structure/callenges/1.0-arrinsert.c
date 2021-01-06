#include <stdio.h>

void inserElement(int arr[], int elem, int idx){
    int size = 0;
    while (arr[size] != '\0') size++;
    for (; size >= 0; size--){
        if (size == idx){
            arr[size] = elem;
            return;
        }else {
            arr[size] = arr[size - 1];
        }
    }
}

int main(void){

    int array[6];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    array[5] = '\0';

    int size = 0;
    while (array[size] != '\0') size++;

    for (int i = 0; i < size; i++ )
        printf("%d ", array[i]);
    printf("\n");

    int idx = 5;
    int elem = 100;

    inserElement(array, elem, idx);

    for (int i = 0; i < size + 1; i++ )
        printf("%d ", array[i]);
    printf("\n");
}
