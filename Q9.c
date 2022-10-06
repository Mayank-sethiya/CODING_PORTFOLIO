# include <stdio.h>
int main()
{

	float temp,f;
	printf("PLEASE ENTER THE TEMPERATURE IN FAHRENHEIT");
	scanf("%f",&f);
	temp=(f-32)*5/9;
	printf("THE TEMPERATURE IN FEHRENHEIT %f IS CONVERTED INTO DEGREE CELSIUS %f",f,temp);
	return 0;
	
}
