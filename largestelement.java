public class largestelement {
    public static void main(String[] args){
        // taking an array
        int[] arr={15,5,24,8,1,3,16,10,20};
        //making two pointers one to be compared and other from which it is to be compared
       int i=0;
       int j=i+1;
       // traversing the array
       while(i<arr.length && j<arr.length){
           if(arr[i]<arr[j]){
               i++;
           }
           j++;
       }
       System.out.print("the largest element of array is: "+arr[i]);
        System.out.println();
    }
}
