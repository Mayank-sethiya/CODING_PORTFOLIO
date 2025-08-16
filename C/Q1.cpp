# include <stdio.h>
int main()
{
	int i,b;
	float f;
	double d;
	char c;
	long l;
	short s;
	printf("the value of integer is ");
	scanf("%d",&i);
	printf("\n the value of float is");
	scanf("%f",&f);
	printf("the value of double is =");
	scanf("%lf",&d);
	printf("the value of char is=");
	scanf("%c",&c);
	printf("the value of long is=");
	scanf("%dl",&l);
	printf("the value of short is=");
	scanf("%ds",&s);
	printf("the value of boolean is=");
	scanf("%d",&b);
	if (b>0)
	{
		printf("true");
	}
			
    else
	{
	printf("false");
}
		
	
	return 0;
}

