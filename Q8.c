# include<stdio.h>
int main()
{
	float temp,f;
	printf("PLEASE ENTER THE TEMPERTURE IN DEGREE CLESIUS");
	scanf("%f",&temp);
	f=temp*9/5+32;
	printf("THE TEMPERATURE IN DEGREE CELSIUS %f IS CONVERTED INTO %f FAHRENHEIT",temp,f);
	return 0;
}
