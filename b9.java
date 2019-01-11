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
public class b9 {
    public static double tich(double n){
        if(n==1){
            return 1;
        }
        else 
            return tich(n-1)*n;
    }
    public static void main(String args[]){
        double n = 7.0;
        if(n>6){
            double t = tich(n);
            System.out.println(t);
        }
        
    }
}
