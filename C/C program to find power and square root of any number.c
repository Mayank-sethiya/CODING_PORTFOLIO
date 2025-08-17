# include <stdio.h>
#include <math.h>
int main()
{
	int a,n;
	printf("ENTER THE NUMBER OF WHICH YOU HAVE TO FIND THE POWER AND SQUARE ROOT ");
	scanf("%d",a);
	printf("ENTER THE POWER OF NUMBER");
	scanf("%d",n);
	int b= pow(a,n);
	int c=sqrt(a);
	printf("THE POWER OF GIVEN NUMBER WILL BE %d AND SQUAARE ROOT WILL BE %d",b,c);
}

