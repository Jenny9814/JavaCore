/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class TachLayChuoi {
    // regax là phân giới
    // limit là bao nhiêu chuỗi được trả về
    /*public String[] split(String regax, int limix){
    }*/
    public static void main(String args[]){
        String s="D:/music/k/kk/bolero/longme.mp3";
        String[] w = s.split("/");
        
        String k = w[w.length-1]; // Lấy độ dài mảng - 1 -- lấy ngược
        // k= longme.mp3
        String[] x = k.split("\\."); //longme.mp3
            if("mp3".equals(x[x.length-1])){
                System.out.println(k);
                String q = x[x.length-2]; 
                System.out.println(q);
            }
    }
}
