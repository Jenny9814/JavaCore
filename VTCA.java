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
public class VTCA {
    public static void luong(double thuLao, int gio){
        double tienLuong;
        if(thuLao < 8.0){
            System.out.println("Không tính lương, thông báo sai qui định thù lao tối thiểu 1 giờ");
        } else if (gio > 60){
            System.out.println("Không tính lương, thông báo làm việc quá số giờ qui định");
        } else{
            int gioLamThem = 0;
            if(gio > 40){
                gioLamThem = gio - 40;
                tienLuong = 40 * thuLao;
                tienLuong = tienLuong + gioLamThem * thuLao * 1.5;

            } else{
            tienLuong = gio * thuLao;
            }
            System.out.println("Tiền lương cho 1 tuần = " +tienLuong);
        }
    } 
    public static void main(String args[]){
        luong(7.0,20);
        luong(9.0,62);
        luong(10.0,41);
    }
}
