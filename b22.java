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
public class b22 {
    public static int UCLN(int n, int m){
        for(int i = 0;n!=0 && m!=0 && n>i && m>i;i++){
            int ucln = n;
            if(n>m){
                n = n-m; return n;
            }
            else{
                m = m-n; return m;
            }
           }
        return n;
    }
    public static void main(String args[]){
        int n = 4;
        int m = 6;
        int bcnn = n*m/UCLN(n,m);
        System.out.println("BCNN = " +bcnn);
    }
}
