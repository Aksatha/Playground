#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int val=n;
  for(int i=1;i<=n;i++)
  {
    for(int space=val;space>=1;space--)
    {
      printf("%d",space);
    }
    val--;
    printf("\n");
  }
	return 0;
}