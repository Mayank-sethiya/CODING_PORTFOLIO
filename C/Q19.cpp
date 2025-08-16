#include <stdio.h>
int main()
{
	int a,b,c;
	printf("ENTER THE FIRST DIGIT     ");
	scanf("%d",&a);
	printf("ENTER THE SECOND DIGIT PLEASE      ");
	
	scanf("%d",&b);
	printf ("THE NUMBERS YOU HAVE ENTERED IS a=%d and b=%d",a,b);
	c=a;
	a=b;
	b=c;
	printf("THE NUMBER AFTER SWAPPING digits are   a=%d and b=%d",a,b);
	return 0;
}
