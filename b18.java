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
public class b18 {
     public static void main(String args[]){
        int n = 6;
        int dem = 0, dem2= 0, dem3=0;
        for(int i = 1; i<=n;i++){
            if(n%i == 0 ){
                dem++;
                if(i%2==0){
                    dem2++;
                }
                else if(i%2!=0){
                    dem3++;
                }
            }
        }
        System.out.println("Số lượng các ước số của n : " +dem);
        System.out.println("Số lượng các ước số lẻ của n : " +dem3);
        System.out.println("Số lượng các ước số chẵn của n : " +dem2);
    }
}
