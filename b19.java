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
public class b19 {
    public static int kiemTraSNT(int n){
        if(n<2){
            return 0;
        }
        else {
            if(n==2) return 1;
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String args[]){
        int n = 11;
        System.out.println(kiemTraSNT(n));
    }
}
