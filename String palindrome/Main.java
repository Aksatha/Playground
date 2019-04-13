#include<stdio.h>
int main()
{
  //Type your code here
  char string1[20];
  int i,len;
  int f=0;
  scanf("%s",string1);
  len=strlen(string1);
  for(i=0;i<len;i++)
  {
    if(string1[i]!=string1[len-i-1])
    {
      f=1;
      break;
    }
  }
  if(f)
  {
    printf("%s is not a palindrome",string1);
  }
  else
  {
    printf("%s is a palindrome",string1);
  }
  
  return 0;
}