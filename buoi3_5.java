// Viết chương trình đếm số âm
// Chưa xong
package Buoi3;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_5 {
    public static void NegativeNumerInStrings(String str){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) <= '0'){
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void main(String args[]){
        String str = "abc-5xyz-12k91--p";
        NegativeNumerInStrings(str);
    }
}
