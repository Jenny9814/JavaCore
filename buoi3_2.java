/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        Panlyndrome p = new  Panlyndrome(s);
        System.out.println(p.kiemTra(s));
    }
}
