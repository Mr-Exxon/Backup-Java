/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Quicksort_v2;
public class Quicksort_v2 
{

    static void quickSort(int arr[], int low, int high)
    {
    // low = index bawah
    // high = index atas
    // dari array yang akan diurutkan
    int a=low, b=high, c;
    int pivot= arr[low];
    
    // operasi quicksort
    do
    {
    while (arr[a]<pivot) a++;
    while (arr[b]>pivot) b--;
        if (a<=b)
        {
            c=arr[a]; arr[a]=arr[b]; arr[b]=c;//tukar
            a++; b--;
        }
    } 
    while (a<=b);
   
    //mengurutkan bilangan
    if (a<b) quickSort(arr, a, b);
        if (a<b) quickSort(arr, a, b);
    }
    
    public static void main(String[] args) 
    {
        
        int tabInt[]={93,12,67,53,45,14,74,22};
        int a,n=8;
        System.out.print("BEFORE\n");

            for(a=0;a<n;a++)
            {
                System.out.print(tabInt[a]+ "  ,");
            }
                System.out.print("\n");
                quickSort(tabInt,0,n-1);
                System.out.print("\nAFTER\n");

        for(a=0;a<n;a++)
        {
            System.out.print(tabInt[a]+" , ");
        }
    }
}
