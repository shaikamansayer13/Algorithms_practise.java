
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for(int i =0;i<=4-1;i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int [] arr){
        for(int i =0;i<=arr.length - 2;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] <arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr,int j ,int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
