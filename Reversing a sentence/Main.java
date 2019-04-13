#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
int main()
{
  // Type your code here
  char str[100],rev[100];
  int len,i,j,ws,we;
  gets(str);
  len=strlen(str);
  j=0;
  ws=len-1;
  we=len-1;
  while(ws>0)
  {
    if(str[ws]==' ')
    {
      i=ws+1;
      while(i<=we)
      {
        rev[j]=str[i];
        i++;
        j++;
      }
      rev[j++]=' ';
      we=ws-1;
    }
    ws--;
  }
  for(i=0;i<=we;i++)
  {
    rev[j]=str[i];
    j++;
  }
  rev[j]='\0';
  printf("%s",rev);
    return 0;
}