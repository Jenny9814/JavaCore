// Chuẩn hóa xâu
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_3 {
    /*public static String dauCach(String s){
        s = s.trim();
        s = s.replace("\\s+"," ");
        return s;
    }
    public static String vietHoa(String s){
        s = dauCach(s);
        String str[] = s.split(" ");
        s = " ";
        for(int i =0;i<str.length;i++){
            s += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1);
            if(i<str.length - 1){
                s += " ";
            }
        }
        return s;
    }*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi");
        String s = sc.nextLine();
        // Xóa các khoảng trắng
        s = s.trim(); // phương thức trim() xóa các khoảng trắng đầu và cuối của chuỗi
        // có 2 cách : 
        /*
        c1: s1.indexOf(s2) : phương thức trả về vị trí của s2 trong s1.
            while (str.indexOf("  ") != -1) str = str.replaceAll("  "," ");
        s.replaceAll(s1,s2): ở dưới
        */
        s = s.replaceAll("\\s+"," "); // phương thức thay thế tất cả chuỗi s1 thành s2 trong s. nhưng chỉ duyệt chuỗi s 1 lần.
        // Viết hoa chữ cái đầu mỗi từ
        String[] str = s.split(" "); // Chia chuỗi ra thành các phần tử của mảng
        // Xét vòng lặp for dùng phương thức String.valueOf().toUperCase()
        s = " "; // Chuỗi sau khi xóa dấu cách sau đó đưa chuỗi về rỗng để làm tiếp phần viết hoa mỗi chữ cái đầu. Nếu như k khai báo s = " " thì sẽ xuất ra 2 giá trị . 1 là giá trị sau khi bỏ dấu cách 2 là giá trị sau khi bỏ dấu cách và viết hoa chữ cái đầu
        for(int i =0;i<str.length;i++){
            s += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1);
            if(i<str.length - 1){
                s += " ";
            }
        }
        System.out.println(s);
    }
}
