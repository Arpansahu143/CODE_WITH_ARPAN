import java.util.Scanner;
class HA2
{
public static void BinarySearch(int arr[], int item, int start, int end)
{
int mid = (start+end)/2;
if(start>end)
System.out.println("Search element not found");
else if(arr[mid] == item)
System.out.println("Search element found");
else if(arr[mid]>item)
BinarySearch(arr, item,start, mid-1);
else
BinarySearch(arr, item, mid+1,end);
}
public static void main(String[] args)
{
int arr[] = {10, 20, 21, 30, 30, 56, 89};
BinarySearch(arr, 300, 0,arr.length-1);
}
}