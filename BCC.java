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
public class BCC {
    public static void main(String args[]){
        System.out.println("Bảng cửu chương");
        for(int i = 1;i<=9;i++){
            for(int j = 0;j<=10;j++){
                System.out.printf("%d * %d = %d ",i,j,i*j);
            }
            System.out.println("\n");
        }
    }
}
