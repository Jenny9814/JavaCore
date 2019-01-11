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
public class b23 {
    public static void main(String args[]){
        System.out.println("giải phương trình f(x) ax+b = 0");
        double a = 2.0,b=1.0;
        double x;
        if(a!=0 && b !=0){
            x = -b/a;
        }
        else if(a!=0 && b ==0){
            x = 0;
        }
        else{
            x= 0;
        }
        System.out.println("x = " +x);
    }
}
