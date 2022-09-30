#include <stdio.h>
# define PI   3.1415
int main()
{
	int radius;
	
	float d,area,c;
	printf("enter the radius of the circle=");
	scanf("%d",& radius);
	 d=radius*2;
	 printf("the diameter of the circle is = %f",d);
	 c=2*PI*radius;
	 printf("\n the circumference of the circle is= %f",c);
	 area=PI*radius*radius;
	 printf("\n the area of the circle is %f",area);
	 return 0;
}
