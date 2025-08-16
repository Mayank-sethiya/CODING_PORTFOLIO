#include <stdio.h>
int main(void)
{
	int l,b;
	printf("PLEASE ENTER THE LENGTH AND BREADTH OF THE RECTANGLE OF WHICH PERIMETER IS TO BE FOUND");
	scanf("%d%d",&l,&b);
	int perimetr=2*(l+b);
	printf("THE PERIMETER OF THE GIVEN RECTANGLE WITH LENGTH %d and breadth %d is%d",l,b,perimetr);
	return 0;
	
}
