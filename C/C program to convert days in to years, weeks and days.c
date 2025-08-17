# include <stdio.h>
int main()
{
	int days,weeks,years;
	printf("ENTER THE DAYS");
		scanf("%d",&days);
		
		//convert days to years, weeks and days
		years=days/365;
		weeks=(days%365)/7;
		days= days-((years*365)+(weeks*7));
		
		printf("YEARS:   %d \n",years);
		printf("weeks:   %d \n",weeks);
		printf("days:    %d \n",days);
		
		return 0;
		
		
		
}
