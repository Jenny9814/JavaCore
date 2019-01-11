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
public class b27 {
    public static void soNguyen(int n){
        for(int i = 0;i<n;i++){
            if(i%2!=0){
                if(i!=7 && i!=21 && i!=41){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String args[]){
        int n = 10 ;
        System.out.println("Số nguyên lẻ nhỏ hơn n");
        soNguyen(n);
    }
}
