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
public class buoi3_12 {
    public static void xuatMang(double[] a){
        for(int i =0;i<a.length;i++){
            System.out.println("\t" +a[i]);
        }
    }
    public static void sapXepGD(double[] a){
        for(int i = 0;i<a.length -1 ;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    double t =a[i];
                    a[i] = a[j];
                    a[j]= t;
                }
            }
        }
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
        System.out.println("Mảng sau khi sắp xếp giảm dần: ");
        sapXepGD(a);
        xuatMang(a);
}
}
