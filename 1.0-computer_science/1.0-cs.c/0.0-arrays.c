#include <stdio.h>
/**
 * main - The enter point
 *
 * Return: 0
 */
const int N = 100;

int main(void)
{
	int numbers[N];

	for (int i = 1; i < N; i++)
	{
		numbers[i] = i;
		if (i != N - 1)
			printf("%d, ", numbers[i]);
		else
			printf("%d\n",numbers[i]);

	}
	return (0);
}


