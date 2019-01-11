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
public class b1 {
    public static int tong(int n){
        if(n==1){
            return 1;
        }
        else 
            return tong(n-1) + n;
    }
    public static void main(String args[]){
        int n = 4;
        if(n>3 && n<50){
            int s = tong(n);
            System.out.println(s);
        }
        
    }
}
