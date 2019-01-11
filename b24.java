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
public class b24 {
    public static void main(String args[]){
        System.out.println("giải phương trình ax^2 + bx + c =0");
        double a = 1.0, b = 2.0, c=-3.0;
        double x,x1,x2;
        double denta;
        if(a!=0){
            denta = b*b - 4*a*c;
            if(denta >0){
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                x1 = (-b-Math.sqrt(denta))/(2*b);
                x2 = (-b+Math.sqrt(denta))/(2*b);
                System.out.println("x1 = " +x1 +" "+"x2 =" +x2);
            }
            else if(denta ==0){
                System.out.println("Phương trình có nghiệm kép: ");
                x = -b/2*a;
                System.out.println("x=" +x);
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
