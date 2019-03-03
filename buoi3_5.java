// Viết chương trình đếm số âm
// Chưa xong
package Buoi3;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_5 {
    public static void NegativeNumerInStrings(String str){
       String st = "-";
        int i;
        for(i = 0;i<str.length();i++){
            if((int)str.charAt(i) == 45){ // chuyển các kí tự thành ma ASCII
                i++;
                while((int) str.charAt(i) <=57 && (int)str.charAt(i) >=48){
                    st+=str.charAt(i);i++;
                    if((int) str.charAt(i) >57 || (int)str.charAt(i) <48 ){
                        System.out.println(st);
                        st = "-";
                        break;
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        String str = "abc-5xyz-12k91--p";
        NegativeNumerInStrings(str);
    }
}
