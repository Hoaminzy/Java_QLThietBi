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
public class CanBo implements Serializable {
    String hoTen;
    String sdt;
    boolean gioiTinh;
double Luong;

    public CanBo() {
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;



    }
   double Luong(){
   
   return Luong;
   }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen= sc.nextLine();
        System.out.println("Số điện thoại: ");
        sdt= sc.nextLine();
        System.out.println("Giới tính: ");
        gioiTinh= sc.nextBoolean();
        if(gioiTinh == true){
            System.out.println("Con giá");
            
        }else{
            System.out.println("Con trai");}
    }
    public void Hien(){
         System.out.printf("%-20s%-20s%-20s", getHoTen(),getSdt(),isGioiTinh());
         
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoTen=" + hoTen + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh +"Lương: "+Luong()+'}';
    }
    
}
