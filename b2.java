/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class b2 {
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
    public static int dem(int[] a){
        int dem=0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2!=0){
                dem++;
            }
        }
        return dem;
    }
    public static boolean phanTuAm(int[] a){
        for(int i = 0;i<a.length;i++){
            if(a[i]<0){
                return true;
            }
        }
        return false;
    }
    public static boolean toanChan(int[] a){
        for(int i = 0;i<a.length;i++){
            if(a[i]%2!=0) return false;
        }
        return true;
    }
    public static void sapXep(int[] a){
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
    public static void sapXepChanTDLeGD(int[] a){
        for(int i = 0;i<a.length -1 ;i++){
                for(int j =i+1;j<a.length;j++){
                    if(a[i]%2==0 && a[j]%2==0){    
                        if(a[i]>a[j]){
                            int t =a[i];
                            a[i] = a[j];
                            a[j]= t;
                        }
                    }
                    else if(a[i]%2!=0 &&a[j]%2!=0){
                        if(a[i]< a[j]){
                            int t =a[i];
                            a[i] = a[j];
                            a[j]= t;
                        }
                    }
                }
        }
    }
    public static boolean soNT(int a[]){
        for(int i = 0;i<a.length;i++){
            if(a[i] == 2 ) return true;
            for(int j =2;j<Math.sqrt(a[i]);j++){
                if(a[i]%j==0){
                    return false;
                }
            }
        }
        return true;
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
    public static int demSNT(int[] a){
        int dem = 0;
        for(int i =0;i<a.length;i++){
            if(kt(a[i]) == true){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("a["+(i+1)+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng số nguyên");
        xuatMang(a);
        System.out.println("Tổng các giá trị trong mảng = " +tong(a));
        System.out.println("Số lượng số lẻ trong mảng = " +dem(a));
        System.out.println("Phần tử âm có hay không? " +phanTuAm(a));
        System.out.println("Mảng có toàn chẵn hay không? " +toanChan(a));
        sapXep(a);
        System.out.println("Mảng sau khi sắp xếp tăng dần");
        xuatMang(a);
        sapXepChanTDLeGD(a);
        System.out.println("Mảng sau khi sắp xếp chẵn tăng dần và lẻ giảm dần");
        xuatMang(a);
        System.out.println("Mảng có tồn tại số nguyên tố không? " +soNT(a));
        System.out.println("Đếm số lượng số nguyên tố:" +demSNT(a));
    }
}
