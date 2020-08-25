#include<stdio.h>

int main(){
	int a;
	printf("Enter the Number: ");
	scanf("%d",&a);
	int unit = a % 10;
	printf("Unit Digit is: %d\n", unit);
	return 0;
}
