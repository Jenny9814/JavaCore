/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class b10 {
    public static double tich(int n, double x){
        if(n==1){
            return 1;
        }
        else 
            return Math.pow(x,n);
    }
    public static void main(String args[]){
        int n = 3;
        double x = 3.0;
        double t = tich(n,x);
        System.out.println(t);
    }
}
