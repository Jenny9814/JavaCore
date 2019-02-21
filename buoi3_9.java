// Nhập 1 mảng n số ngẫu nhiên không trùng nhau
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_9 {
    public static boolean kiemTra(int[] a){
        for(int i = 0;i<a.length;i++){
             for(int j =0;j<i;j++){
                 if(a[i] == a[j]){
                     return false;
                 }
             }
        }
        return true;
    }
    public static void xuatMang(int[] a){
        for(int i = 0;i<a.length;i++){
            if(kiemTra(a) == true){
                 System.out.println(a[i]);
            }
            else{
                System.out.println("Mảng trùng"); break;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        // nhập mảng
        for(int i = 0;i<a.length;i++){
             System.out.println("a[" +(i+1)+"] : ");
             a[i] = sc.nextInt();
        }
        xuatMang(a);
    }
}
