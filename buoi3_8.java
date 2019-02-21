// Mảng
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_8 {
    public static void xuatMang(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
    public static int tong(int[] a){
        int s = 0;
        for(int i = 0;i<a.length;i++){
            s = s+a[i];
        }
        return s;
    }
    public static int demSoK(int[] a, int k){
        int dem = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==k){
                dem++;
            }
        }
        return dem;
    }
    public static int max(int[] a){
        int max  =a[0];
        for(int i = 0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min = a[0];
        for(int i = 0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static boolean kt(int n){
        if(n==1) return false;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void xuatSNT(int[] a){
        for(int i =0;i<a.length;i++){
            if(kt(a[i]) == true){
                System.out.println(a[i] + "\t");
            }
        }
    }
    public static void sapXepGD(int[] a){
        for(int i = 0;i<a.length -1 ;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int t =a[i];
                    a[i] = a[j];
                    a[j]= t;
                }
            }
        }
    }
    public static void sapXepTD(int[] a){
        for(int i = 0;i<a.length -1 ;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t =a[i];
                    a[i] = a[j];
                    a[j]= t;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        // Nhập mảng
        for(int i = 0;i<a.length;i++){
            System.out.println("a[" +(i+1)+"] : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng");
        xuatMang(a);
        System.out.println("Tổng các phần tử của mảng = "+tong(a));
        System.out.print("Nhập k = ");
        int k = sc.nextInt();
        System.out.println("Số lần xuất hiện của k = "+demSoK(a,k));
        System.out.println("Phần tử lớn nhất = " +max(a));
        System.out.println("Phần tử nhỏ nhất = " +min(a));
        System.out.println("Các số nguyên tố :");
        xuatSNT(a);
        System.out.println("Mảng sắp xếp giảm dần: ");
        sapXepGD(a);
        xuatMang(a);
        System.out.println("Mảng sắp xếp tăng dần: ");
        sapXepTD(a);
        xuatMang(a);
    }
}
