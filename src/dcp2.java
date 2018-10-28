import java.util.Arrays;
import java.util.Scanner;

public class dcp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of an array: ");
                int len = sc.nextInt();

            System.out.println("Enter the elements of an array with the length " + len + " : ");
                int[] arr = new int[len];
                for(int i = 0; i < len; i++)
                    arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(dcp2(arr)));
    }

    public static int[] dcp2(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            newArr[i] = 1;

        int temp = 1;

        for(int i = 0; i < arr.length; i++){
            newArr[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for(int i = arr.length-1; i >= 0; i--){
            newArr[i] *= temp;
            temp *= arr[i];
        }

        return newArr;
    }
}
