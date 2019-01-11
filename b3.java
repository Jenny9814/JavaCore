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
public class b3 {
    public static double tong(double n){
        if(n==1){
            return 1;
        }
        else 
            return tong(n-1) + 1/n;
    }
    public static void main(String args[]){
        double n = 7.0;
        if(n>=7.0){
            double s = tong(n);
            System.out.println(s);
        }
        
    }
}
