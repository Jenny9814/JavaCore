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
public class b15 {
    public static int giaiThua(int n){
        if(n==1) return 1;
        else return giaiThua(n-1)*n;
    }
    public static int tong(int n){
        if (n==1){
            return 1;
        } return tong(n-1) + giaiThua(n-1)*n;
    }
    public static void main(String[] args) {
       int n = 4;
       int s =tong(n);
       System.out.println(s);
    }
}
