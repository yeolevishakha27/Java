public class binary_search {
    public static void main(String[] args){
        int numbers [] = {1,2,3,4,5};
        int key = 1; 
        System.out.println("Index for key is:"+ binary(numbers,key));
        }

     public static int binary(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid]<key){
                start = mid +1;
    
            }
            if(numbers[mid]>key){
                end = mid - 1;
            }
        }
        return -1;
     }
}
