
package selectionsorting;
import java.util.Scanner;

public class SelectionSorting {

    public static void selectionSorting(int arr[]){
        int min,index,temp=0;
        for(int i=0; i<arr.length; i++){
            min=arr[i];
            index=i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            if(min<arr[i]){
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp; 
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        System.out.println();
        
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
        }
        System.out.println();
        
        selectionSorting(arr);
    }
}
