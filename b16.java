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
public class b16 {
    public static void main(String args[]){
        int n = 6;
        System.out.println("ước số của số nguyên n");
        for(int i = 1; i<=n;i++){
            if(n%i == 0 ){
                System.out.println("\t"+i);
            }
        }
    }
}
