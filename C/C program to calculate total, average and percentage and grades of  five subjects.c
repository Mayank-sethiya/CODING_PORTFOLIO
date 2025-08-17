# include <stdio.h>
int main()
{
	char a,b,c,d,e;
	printf("ENTER THE SUBJECTS YOU WANT TO TAKE THE AVERAGE, TOTAL AND PERCENTAGE  \n    ");
	scanf("%s %s %s %s %s ",&a,&b,&c,&d,&e);
	int f,g,h,i,j,x;
	printf ("enter the values of the subjects accordingly");
	scanf(" %d %d %d %d %d %d",&f,&g,&h,&i,&j,&x);
	printf ("THE VALUES OF THE SUBJECTS YOU ENTERED ARE %s=%d  %s=%d  %s=%d  %s=%d  %s=%d,a,f,b,g,c,h,d,i,e,j");
	int total=a+b+c+d+e;
	float average=total/5;
	printf("ENTER THE MAXIMUM NO OF MARKS OF FIVE SUBJECTS ");
	float percent=total/x*100;
	printf("THE TOTAL NUMBER OF MARKS IS %d \n THE AVERAGE IS %f \n THE PERCENTAGE IS %f %",total,average,percent);
	return 0;
	
}

