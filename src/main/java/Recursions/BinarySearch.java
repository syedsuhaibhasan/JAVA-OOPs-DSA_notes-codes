package Recursions;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {40,41,42,43,44,45,46,47};
        int find = 40;
//        int start=arr[0];
//        int end=arr.length-1;
        int ans = search(find,arr,0,arr.length-1);
        System.out.println(ans);
    }
    
    public static int search(int find, int[] arr, int start, int end){
        if (start>end) {
            return -1;
        }
       int mid = start+end-start/2;
        if (arr[mid]==find) {
            return mid;
        }
        if (find<arr[mid]) {
            return search(find,arr,start,mid-1);
        }
        else{
        return search(find,arr,mid+1,end);
        }
    }
}
