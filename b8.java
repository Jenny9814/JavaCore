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
public class b8 {
    public static double tong(double n){
        if(n==0 ){
            return 0.5;
        }
        else 
            return tong(n-1) + (2*n+1)/(2*n+2);
    }
    public static void main(String args[]){
        double n = 6.0;
        if(n>5){
            double s = tong(n);
            System.out.println(s);
        }
        
    }
}
