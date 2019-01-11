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
public class b14 {
    public static int tong(int n, int x){
        if (n==0){
            return (int) Math.pow(x,2*n+1);
        } return (int) (tong(n-1,x) + Math.pow(x,2*n+1));
    }
    public static void main(String[] args) {
       int n = 3;
       int x = 3;
       int s =tong(n,x);
       System.out.println(s);
    }
}
