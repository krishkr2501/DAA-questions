public class selectionsort {
    public static void main(String[] args){
        int[] arr= {45,54,7,14,1};
            for(int i=0; i<arr.length-1 ; i++ ){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j]>arr[j+1]){
                        int temp= arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        System.out.println("sorted by bubble");
            for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
           System.out.println();
            for(int i=0; i<arr.length-1; i++){
                int smallest=i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[smallest]> arr[j]){
                        smallest=j;
                    }
                    int temp= arr[smallest];
                    arr[smallest]= arr[i];
                    arr[i]=temp;

            }
        }
        System.out.println("sorting by selection sort:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}