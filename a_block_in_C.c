#include <stdio.h>
int main()
{
 int r,c;

  printf("Enter the desired number of rows and columns");
   scanf("%d%d", &r,&c);
 
   for(int i=1;i<=r;i++)
    {
     printf("\n");

     for(int j=1;j<=c;j++)
      {
       printf(" * ");
      }
     }
  return 0;
 }
