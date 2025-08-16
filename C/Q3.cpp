#include <stdio.h>
int main()
{
	int a,b,add,subt,mult,div,remainder;
	printf("please enter the value of a=");
	scanf("%d",&a);
	printf("please enter the value of b =");
	scanf("%d",&b);
	add= a+b;
	printf("the addition of %d and %d is =%d \n",a,b,add);
	subt=a-b;
	printf("the substraction of %d and %d is=%d \n",a,b,subt);
	mult=a*b;
	printf("the multiplication of %d and %d is= %d\n",a,b,mult);
	div=a/b;
	printf("the division of %d and %d is =%d\n",a,b,div);
	remainder=a%b;
	printf("the remainder of %d and %d is= %d\n",a,b,remainder);
	return 0;
	
}
