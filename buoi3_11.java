
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_11 {
    public static boolean kiemTra(int[] a){
        for(int i = 0;i<a.length-1;i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void xuatMang(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
                System.out.println("a[" +(i+1)+"] :");
                a[i] = sc.nextInt();
        }
        if(kiemTra(a) == false){
            System.out.println("Xin mời nhập lại");
        }
        else{
            System.out.println("Mảng: ");
           xuatMang(a);
        }

    }
}
