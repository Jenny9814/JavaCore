/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_10 {
    public static void xuatMang(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
    public static int soLe(int[] a){
        int dem = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i] + "\t");
                dem++;
            }
        }
        return dem;
    }
    public static int soChan(int[] a){
        int dem = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i] + "\t");
                dem++;
            }
        }
        return dem;
    }
    public static boolean ktSNT(int n){
        if(n==1) return false;
        for(int i = 2;i< n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void soNT(int[] a, int n){
        for(int i =0;i<a.length;i++){
            if(ktSNT(a[i]) == true){
                System.out.print(a[i] + "\t");
            }
        }
    }
    public static void kSoNT(int[] a, int n){
        for(int i =0;i<a.length;i++){
            if(ktSNT(a[i]) == false){
                System.out.print(a[i] + "\t");
            }
        }
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
        System.out.println("Mảng: ");
        xuatMang(a);
        System.out.println("Các số lẻ của mảng và Tổng cộng có bao nhiêu số lẻ");
        System.out.println(soLe(a));
        System.out.println("Các số chẵn của mảng và Tổng cộng có bao nhiêu số chẵn");
        System.out.println(soChan(a));
        System.out.println("Các số nguyên tố");
        soNT(a,n);
        System.out.println("\n");
        System.out.println("Các số không là nguyên tố");
        kSoNT(a,n);
        
    }
}
