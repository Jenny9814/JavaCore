// Đếm các kí tự
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_7 {
    public static int demHoa(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i) <='Z'){
                dem++;
            }
        }
        return dem;
    }
    public static int demThuong(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i) <='z'){
                dem++;
            }
        }
        return dem;
    }
    public static int demCS(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i) <='9'){
                dem++;
            }
        }
        return dem;
    }
    public static int demKTDB(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if((int) s.charAt(i) == 92 || (int) s.charAt(i) == 91 || (int) s.charAt(i) == 46 || (int) s.charAt(i) == 40 || (int) s.charAt(i) == 123 || (int) s.charAt(i) == 42 || (int) s.charAt(i) == 43 ||(int) s.charAt(i) == 63 || (int) s.charAt(i) == 94 || (int) s.charAt(i) == 36 || (int) s.charAt(i) == 124){
                dem++;
            }
        }
        return dem;
    }
    public static int demKT(String s){
        int dem = 0;
        char c;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if(Character.isSpace(c)){ // KIỂM TRA VỊ TRÍ I CÓ PHẢI LÀ KHOẢNG TRẮNG KHÔNG?
                dem++;
            }
        }
        return dem;
    }
    public static int demNA(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)== 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'u'|| s.charAt(i) == 'o'|| s.charAt(i) == 'A'|| s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U'){
                dem++;
            }
        }
        return dem;
    }
    public static int demPA(String s){
        int dem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!= 'a' || s.charAt(i) != 'e'|| s.charAt(i) != 'i'|| s.charAt(i) != 'u'|| s.charAt(i) != 'o'|| s.charAt(i) != 'A'|| s.charAt(i) != 'E'|| s.charAt(i) != 'I'|| s.charAt(i) != 'O'|| s.charAt(i) != 'U'){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String s = sc.nextLine();
        System.out.println("Số lượng chữ in hoa : "+demHoa(s));
        System.out.println("Số lượng chữ in thường: " +demThuong(s));
        System.out.println("Số lượng chữ là chữ số: " +demCS(s));
        System.out.println("Số lượng chữ là ký tự đặc biệt: " +demKTDB(s));
        System.out.println("Số lượng chữ là khoảng trắng: "+demKT(s));
        System.out.println("Số lượng chữ là nguyên âm: " +demNA(s));
        System.out.println("Số lượng chữ là phụ âm: "+demPA(s));
    }
}
