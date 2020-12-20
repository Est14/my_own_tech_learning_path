#include <stdio.h>


int main(void){

    char array[] = "Esteban Martinez";
    int arraInt[5];

    arraInt[0] = 1;
    arraInt[1] = 2;
    arraInt[2] = 3;
    arraInt[3] = 4;

    printf("%s\n", array);
    int i = 0;
    while (arraInt[i] != '\0'){
        printf("%d ", arraInt[i]);
        i++;
    }

    return (0);
}
