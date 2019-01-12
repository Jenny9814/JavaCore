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
public class b1 {

    public static void xuatMang(double[] a){
        for(int i =0;i<a.length;i++){
            System.out.println("\t" +a[i]);
        }
    }
    public static void phanTuAm(double[] a){
        System.out.println("Các phần tử âm");
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.println(a[i]);
            }
        }
    }
    public static void dem(double[] a){
        int dem=0;
        System.out.println("Số lượng các số thực dương");
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                dem++;
            }
        }
        System.out.println(dem);
    }
    public static void max(double[] a){
        double max = a[0];
        System.out.println("Số thực lớn nhất trong mảng");
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public static void min(double[] a){
        double min = a[0];
        System.out.println("Số thực nhỏ nhất trong mảng");
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
    public static void maxAm(double[] a){
        double min = a[0];
        System.out.println("Số thực âm lớn nhất trong mảng: ");
        for(int i = 0;i<a.length;i++){
            if(a[i]<0){
                if(a[i] < min){
                    min = a[i];
                }
            }
        }
        System.out.println(min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        double a[] = new double[n];
        for(int i = 0;i<a.length;i++){
            System.out.println("a["+(i+1)+"] :");
            a[i] = sc.nextDouble();
        }
        xuatMang(a);
        max(a);
        min(a);
        phanTuAm(a);
        dem(a);
        maxAm(a);
    }
}
