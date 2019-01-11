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
public class b20 {
    public static int kiemTraSCP(int n){
        if(n==1) return 1;
        else{
            for(int i = 1;i<n;i++){
                if(Math.sqrt(n) == i){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(kiemTraSCP(n));
    }
}
