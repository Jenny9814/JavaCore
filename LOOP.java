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
public class LOOP {
    public static void soTN(){
        System.out.println("Số tự nhiên:");
        for(int i = 0;i<100;i++){
            System.out.println(i);
        }
    }
    public static void soChan(){
        System.out.println("Số tự nhiên chẵn");
        for(int i = 0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void soLe(){
        System.out.println("Số tự nhiên lẻ");
        for(int i = 0;i<100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static double tong(int n){
        int s = 0;
        for(int i = 1;i<=n;i++){
            s = s+i;
        }
        return s;
    }
    public static double tich(int n){
        int t = 1;
        for(int i = 1;i<=n;i++){
            t = t*i;
        }
        return t;
    }
    public static double tong2(int n){
        double s2=0.0;
        for(int i = 1;i<=n;i++){
            s2 = s2 + 1/((double) i); 
        }
        return s2;
    }
    public static void main(String args[]){
        soTN();
        soChan();
        soLe();
        System.out.println("Tổng = " +tong(3));
        System.out.println("Tích = " +tich(5));
        System.out.println("Tổng 1/n = " +tong2(3));
    }
}
