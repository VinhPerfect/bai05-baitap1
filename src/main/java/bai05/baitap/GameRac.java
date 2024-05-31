/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai05.baitap;

/**
 *
 * @author lqv20
 */
public class GameRac {
    public static void main(String[] args) {
        KyBinh kb = new KyBinh(true, true, true, true, "vinh", "1234", "gioitinh", "cuocsong", (byte)0);
        System.out.println(kb);
        kb.hanhdong();
        kb.sucmanh();
    }

   
}
