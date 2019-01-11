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
public class b28 {
    public static void main(String args[]){
        double toan = 9.0,ly=7.5,hoa=8.3;
        String maHS = "AT131341";
        String tenHS = "Nguyễn Xuân Anh Thư";
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Họ và tên: "+tenHS + "\n" +"Mã học sinh: "+maHS +"\n"+"Điểm toán: " +toan +"\n"+"Điểm lý: " +ly +"\n"+"Điểm hóa: " +hoa);
        double diemTB = (toan+ly+hoa)/3;
        System.out.println("Điểm trung bình = "+diemTB);
        if(diemTB <5.0) {
            System.out.println("Học sinh yếu");
        }else if(diemTB == 5.0 && diemTB<6.5 ){
            System.out.println("Học sinh trung bình");
        }else if(diemTB == 6.5 && diemTB <8.0){
            System.out.println("Học sinh khá");
        }else{
            System.out.println("Học sinh giỏi");
        }
    }
}
