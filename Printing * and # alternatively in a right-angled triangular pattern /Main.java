#include <stdio.h>
int main(){
	// Type your code here
  int n;
  int k=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(k==0)
      {
        printf("*");
        k=1;
      }
      else
      {
        printf("#");
        k=0;
      }
    }
    printf("\n");
  }
  	return 0;
}