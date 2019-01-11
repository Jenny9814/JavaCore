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
public class b12 {
    public static int luyThua(int n, int x){
        if (n==0){
            return 1;
        } return luyThua(n-1,x)*x;
    }
    public static int tong(int n, int x){
        if (n==1){
            return x;
        } return tong(n-1,x) + luyThua(n-1,x)*x;
    }
    public static void main(String[] args) {
       int n = 3;
       int x = 3;
       int s =tong(n,x);
       System.out.println(s);
    }
}
