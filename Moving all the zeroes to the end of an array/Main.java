#include<stdio.h>
int main()
{
  //Type your code here
  int i,count=0;
  int a;
  scanf("%d",&a);
  int arr[20];
  for(int j=0;j<=a-1;j++)
  {
    scanf("%d",&arr[j]);
  }
  for(i=0;i<a;i++)
  {
    if(arr[i]>0)
    {
      arr[count++]=arr[i];
    }
  }
  while(count<a)
  {
    arr[count++]=0;
  }
  for(i=0;i<a;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}