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
public class b30 {
    public static double cong(double a, double b){
        return a+b;
    }
    public static double tru(double a,double b){
        return a-b;
    }
    public static double nhan(double a, double b){
        if(a==0 || b==0){
            return 0;
        }
        else return a*b;
    }
    public static double chiaNguyen(double a, double b ){
        if(a==0 || b == 0){
            return 0;
        } else return a/b;
    }
    public static double chiaDu(double a, double b){
        if(a==0 || b == 0){
            return 0;
        } else return a%b;
    }
    public static void main(String args[]){
        double a = 15.0,b=5.0;
        System.out.println("Phép cộng s = " +cong(a,b));
        System.out.println("Phép trừ t = " +tru(a,b));
        System.out.println("Phép nhân n = " +nhan(a,b));
        System.out.println("Phép chia lấy phần nguyên c1 = " +chiaNguyen(a,b));
        System.out.println("Phép chia lấy phần dư c2 = " +chiaDu(a,b));
    }
}
