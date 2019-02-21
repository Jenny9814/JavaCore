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
public class DK3Ngoi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        String a = (n%2==0) ? "số chẵn" : "số lẻ"; // nếu chia hết cho 2 thì in số chẵn không thì in số lẻ
        System.out.println(a);
    }
}
