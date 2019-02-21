// Viết game đoán số
package Buoi3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class buoi3_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int score = 5; // Ban đầu cho người chơi mặc định là 5 điểm 
        int numberOfPlayer, numberOfGame;
        String result = " ";
        // Nếu để điều kiện vòng lặp là true thì while sẽ chạy đến khi biểu thức if có từ khóa break thì đc thực thi
        while(true){
            Random rd = new Random();
            numberOfGame = 1+ rd.nextInt(5); // Random số của máy từ 1 đến 5
            System.out.println("Đoán số");
            numberOfPlayer = sc.nextInt();
            if(numberOfPlayer != numberOfGame){
                result = "You're wrong";
                System.out.println(result);
                score--; // Điểm trừ đi 1 mỗi lần đoán sai
            }
            else{
                result = "You're right";
                System.out.println(result);
                score++; // Điểm cộng lên 1 mỗi lần đoán đúng
            }
            if(score == 0){
                System.out.println("Game Over");
                break;
            }
            if(score == 10){
                System.out.println("Congratulation! You Win!");
                break;
            }
        }
        
    }
}
