# include <stdio.h>
int main()
{
	float a,b,c;
	printf("PLEASE ENTER THE LENGTH IN CENTIMETERS (cm)");
	scanf("%f",&a);
	b=a*1/100;
	c=a*1/100000;
	printf("LENGTH IN CENTIMETER IS %fcm  IN METER IS %fm  IN KILOMETERS IS %fkm",a,b,c);
	return 0;
}
