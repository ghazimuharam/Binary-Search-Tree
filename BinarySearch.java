/*
Muhammad Ghazi Muharam
Binary Search Tree Simple implementation with Java
*/
import java.util.Scanner;  // Import the Scanner class

public class bst {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int cari = inp.nextInt();
        int i = 0;
        int bot = 0;
        int mid = arr.length/2;
        int top = arr.length;


        /*
        Searching Algorithm, penggunaan searching mengambil 
        batasan worst case atau sebanyak N data, namun sejatinya 
        dengan penggunaan BST kita tidak akan mencapai N data karena sistem
        pencarian yang bersifat seperti fungsi logritmik
        */
        while(i < arr.length) {
            if(mid == top || mid == bot){ //apabila hasil tidak ditemukan.
                System.out.print(-1);
                break;
            }
            else if(cari == arr[mid]){ //apabila hasil ditemukan.
                System.out.print(mid);
                break;
            }else if(cari < arr[mid]){
                top = mid;
                mid = (bot+mid)/2;
            }else if(cari > arr[mid]){
                bot = mid;
                mid = (mid + top)/2;
            }
            i++;
        }
    }
}