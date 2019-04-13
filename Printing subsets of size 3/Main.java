#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int arr[10];
  for(int i=0;i<=a-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int j=0;j<=a-2;j++)
  {
    for(int k=j+1;k<=a-1;k++)
    {
      for(int l=k+1;l<=a-1;l++)
      {
        printf("(%d, %d, %d) ",arr[j],arr[k],arr[l]);
      }
    }
    printf("\n");
  }
    return 0;
}