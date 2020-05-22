/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author vhc
 */
public class KhachHang implements Serializable{
    String tenKH;
    String diaChi;
    int sdt;

    public KhachHang() {
        
    }

    public KhachHang(String tenKH, String diaChi, int sdt) {
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    public void NhapKH(){
        System.out.println("------Nhập thông tin khách hàng-----");
       Scanner sc = new Scanner(System.in);
        System.out.println("Tên khách hàng: ");
        tenKH = sc.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.println("Số điện thoại: ");
        sdt = sc.nextInt();      
    }
    public void HienKH(){
        System.out.printf("%-20s%-20s%-20d",getTenKH(),getDiaChi(),getSdt());
        System.out.println("");
    }
}
