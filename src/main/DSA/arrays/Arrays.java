package DSA.arrays;
public class Arrays {
    int count;
    int[] arr;
    public Arrays(int size){
    this.arr = new int[size];
    this.count=0;
    }
    
    public void resize(){
    int temp[] = new int[count*2]; 
            for (int i = 0; i < count; i++) {
                temp[i]=arr[i];
            }
            arr=temp;
    }
    
    public void insert(int item){
        if (count==arr.length) {
            resize();
        }
        arr[count++]=item;
    }
    
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public void removeAt(int index){
        for (int i = index; i < count; i++) {
            arr[i]=arr[i+1];
        }
        count--;
    }
    
    public void insertAt(int index, int item){
        if (index==count) {
            
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    public void bubbleSort(){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public int binarySearch(int target){
    int start = arr[0];
    int end = arr.length;
    while(start<=end){
    int mid = start + (end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        else if (arr[mid]>target) {
            end=mid-1;
        }
        else
            start=mid+1;
    }
    return -1;
    }
    
    public static void main(String[] args) {
       Arrays obj = new Arrays(10);
       obj.insert(7);
       obj.insert(9);
       obj.insert(6);
       obj.insert(10);
       obj.insert(5);
       obj.insert(8);
       obj.insert(3);
       obj.insert(1);
       obj.insert(4);
       obj.insert(2);
       obj.print();
       obj.bubbleSort();
        System.out.println("\n"+obj.binarySearch(7));
//       obj.removeAt(2);
       System.out.println("");
       obj.print();
    }
}
