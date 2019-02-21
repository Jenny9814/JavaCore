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
public class SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        int dToan = sc.nextInt();
        System.out.println("Nhập điểm Lý");
        int dLy = sc.nextInt();
        System.out.println("Nhập điểm Hóa");
        int dHoa = sc.nextInt();
        int dTB = (int) ((dToan+dLy+dHoa)/3);
        switch(dTB){
            case 8:{
                System.out.println("Học sinh giỏi"); break;
            }
            case 5:{
                System.out.println("Học sinh khá"); break;
            }
            default:{
                System.out.println("Học sinh trung bình"); break;
            }
        }
    }
}
// try catch là chạy đến khi nào được thì thôi .. => Lấy không được thì cướp
// finally nhiệm vụ là xuất ra màn hình là cho ngta biết k có lỗi 
// Thư viện xử lý dữ liệu số: DecimalFormat 
// Làm thư viện DecinalFormat xem nó có cái gì? giải thích
/*
    DecimalFormat dcf = new DecimalFormat("#.##);
    double x=3.0/8;
    System.out.println(x);
    System.out.println(dcf.format(x));
*/
// Thư viện xử lý ngày tháng năm
// Calendar & SimpleDateFormat -- giải thích
/*
    
*/
// Randome() -- giải thích
// Chuỗi : StringBuilder & SringTokenizer -- giải thích