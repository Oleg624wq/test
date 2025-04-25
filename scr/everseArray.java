import java.util.Arrays;

public class everseArray {
    public static int[] re(int[] arr){
        int[] rev = new int[5];
        for (int i = 0; i == arr.length; i++){
            rev[i] = arr[arr.length-i-1];
        }
        return rev;
    }
    public static void r(int[] arr){       
        int[] rev = new int[5];
        for (int i=0; i< arr.length; i++){
            rev[i] = arr[i];
        }
        for (int i = 0; i < rev.length; i++){
            arr[i] = rev[rev.length-i-1];
        }
    }
    public static void main(String[] args){
        int[] a = {2,3,4,5,6};
        int[] res = re(a);
        r(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res));
    }
}
