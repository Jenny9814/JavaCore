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
public class Panlyndrome {
    String a;

    public Panlyndrome() {
        a = "";
    }

    public Panlyndrome(String s) {
        this.a = s;
    }
    public boolean kiemTra(String s){
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt((s.length())-i-1)){ // charAt() là Trả về một char tại chỉ mục đã cho.
                return false;
            }
        }
        return true;
    }
    
}
