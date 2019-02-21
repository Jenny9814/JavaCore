// Xuất tuổi
package Buoi3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_6 {
    public static void main(String args[]) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Nhập ngày tháng năm sinh : ");
        String dateTime = sc.nextLine();
        // Chuyển ngày sinh kiểu chuỗi sang kiểu Date time
        Date date = formate.parse(dateTime);
        System.out.println("Ngày tháng năm sinh: "+date);
        Date dNow = new Date();
        System.out.println("Date hien tai: " + formate.format(dNow));
        System.out.println("Tuổi = "+(dNow.getYear() - date.getYear()));
    }
}
