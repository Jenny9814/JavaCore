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
public class b25 {
    public static void main(String args[]){
        int n = 2019;
        if((n%4==0 && n%100!=0)|| n%400 == 0){
            System.out.println("Năm nhuận");
        }
        else{
            System.out.println("Năm không nhuận");
        }
    }
}
