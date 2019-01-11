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
public class b4 {
    public static double tong(double n){
        if(n==0 || n==1){
            return 0.5;
        }
        else 
            return tong(n-1) + (1/(2*n));
    }
    public static void main(String args[]){
        double n = 10.0;
        if(n>9.0){
            double s = tong(n);
            System.out.println(s);
        }
        
    }
}
