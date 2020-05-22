/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCB_Test;

import java.io.Serializable;
import java.util.Scanner;
public class GiangVien extends CanBo implements Serializable{
    float dinhMuc;
    int soTiet;
    public GiangVien() {
    }
    public GiangVien(float dinhMuc, int soTiet) {
        this.dinhMuc = dinhMuc;
        this.soTiet = soTiet;
    }
    public float getDinhMuc() {
        return dinhMuc;
    }
    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public int getSoTiet() {
        return soTiet;
    }
    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
    @Override
    double Luong() {
        Luong= getDinhMuc()*getSoTiet();
        return Luong;
    }
  
  @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap(); 
        System.out.println("Định mức thanh toán: ");
        dinhMuc= sc.nextFloat();
        System.out.println("Số tiết dạy: ");
        soTiet=sc.nextInt();
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Hien() {
        super.Hien(); 
        System.out.printf("%-20f%-20d",getDinhMuc(),getSoTiet()
        );
        System.out.println("");
    }

  

  
    
}
