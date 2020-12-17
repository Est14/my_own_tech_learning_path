#include <stdio.h>

int search(int arr[], int N, int key){

    for (int i = 0; i < N; i++){

        if (arr[i] == key){
            return (1);
        }
    }

    return (-1);

}


int main(void){

    int N;
    scanf("%d",&N);

    int i, arr[N], key;

    for (i= 0; i < N; i++){
        scanf("%d", &arr[i]);
    }

    scanf("%d", &key);

    printf("%d", search(arr, N, key));

    return (0);
}