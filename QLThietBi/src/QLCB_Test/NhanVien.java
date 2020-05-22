/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCB_Test;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class NhanVien extends CanBo implements Serializable{
    String nhiemVu;
    float hsl;
    double mucPC;
  
final double lcb=135000;
    public NhanVien() {
    }

   
    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public double getMucPC() {
        return mucPC;
    }

    public void setMucPC(double mucPC) {
        this.mucPC = mucPC;
    }
//double Luong(){
//    Luong = getHsl()*lcb+getMucPC();
//return Luong;
//}

    @Override
    double Luong() {
          Luong = getHsl()*lcb+getMucPC();
return Luong;
    }
    
    
  @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhiệm vụ: ");
        nhiemVu=sc.nextLine();
        System.out.println("Hệ số lương: ");
        hsl = sc.nextFloat();
        System.out.println("Mức phụ cấp: ");
        mucPC = sc.nextDouble();
    }
   
    @Override
    public String toString() {
        return super.toString(); 
    }
    @Override
    public void Hien() {
        super.Hien(); 
        System.out.printf("%-20s%-20f%-20f",getNhiemVu(),getHsl(),getMucPC());
        System.out.println("");
    }

  
    
}
