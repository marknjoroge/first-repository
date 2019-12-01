#include <stdio. h>
int main()
{
 int r,c;

 printf("Enter the desired number of rows and columns");
 scanf("%d%d", &r,&c);
 
 for(i=1;i<=r;i++)
 {
   for(j=1;j<=c;j++)
    {
      printf("*");
    }
 }
 return 0;
}
