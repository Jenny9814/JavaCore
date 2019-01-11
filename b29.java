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
public class b29 {
    public static void main(String args[]){
        String hoTen = "Nguyễn Xuân Anh Thư";
        int ngaySinh = 7, thangSinh = 9, namSinh = 1998;
        System.out.println("Thông tin người đó: ");
        System.out.println("Họ và tên: "+hoTen + "\n" +"Ngày tháng năm sinh: " +ngaySinh + "/" +thangSinh +"/" +namSinh);
        int tuoi = 2019 - namSinh;
        System.out.println("Tuổi = " +tuoi);
    }
}
