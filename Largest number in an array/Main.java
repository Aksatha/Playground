#include<stdio.h>
int main()
{
        // Get the array size
        int arr_size;
        scanf("%d",&arr_size);
        int arr[10];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        // Get the searching element 1
        int max;
        if(arr[0]>arr[1])
        {
          max=arr[0];
        }
  else
  {
    max=arr[1];
  }
       
        for(int idx = 2; idx <= arr_size - 1; idx++)
        {
            if(max< arr[idx])
            {
                max= arr[idx];
            }
        }
        printf("%d\n",max);
    return 0;
}