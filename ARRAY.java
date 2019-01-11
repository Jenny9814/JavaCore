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
public class ARRAY {
    public static double tong(int a[]){
        int s = 0 ;
        for(int i = 0;i<a.length;i++){
            s = s + a[i];
        }
        return s;
    }
    public static double tongDuong(int a[]){
        int s = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] > 0 ){
                s = s+ a[i];
            }
        }
        return s;
    }
    public static void soAm(int a[]){
        for(int i = 0;i<a.length;i++){
            if(a[i] < 0){
                System.out.println(a[i]);
            }
        }
    }
    public static int dem(int a[]){
        int dem = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] % 2 != 0){
                dem ++;
            }
        }
        return dem;
    }
    public static void kiemTra(int a[]){
        for(int i = 0;i<a.length;i++){
            if(a[i] % 2 ==0){
                System.out.println("Tồn tại số chẵn"); break;
            }else{
                System.out.println("Không tồn tại số chẵn"); break;
            }
        }
    }
    public static void main(String args[]){
        int[] a = {-1,0,1,3,5};
        System.out.println("Tổng các phần tử trong mảng = "+tong(a));
        System.out.println("Tổng các phần tử dương = " +tongDuong(a));
        soAm(a);
        System.out.println("Đếm số lẻ = "+dem(a));
        kiemTra(a);
    }
}
