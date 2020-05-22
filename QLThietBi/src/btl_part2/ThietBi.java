/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class ThietBi implements Comparable<ThietBi>, Serializable{

    String tenThietBi;
    String maThietBi;
    String nhaSX;
    float donGia;
    int soLuong;
    float tongTien;
    Locale locale = new Locale("vi", "VN");//định dạng đất nước với mã tiền tệ là vi, tên nước VN
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

    public ThietBi() {
    }

    public ThietBi(String tenThietBi, String maThietBi, String nhaSX, float donGia, int soLuong, float tongTien) {
        this.tenThietBi = tenThietBi;
        this.maThietBi = maThietBi;
        this.nhaSX = nhaSX;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public String getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(String maThietBi) {
        this.maThietBi = maThietBi;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public float getDonGia() {
        return donGia;
    }

    public boolean setDonGia(float donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
            return true;
        } else {
            System.out.println("Đơn giá phải lớn hơn 0");
            return false;
        }

    }

    public int getSoLuong() {
        return soLuong;
    }

    public boolean setSoLuong(int soLuong) {
        if (soLuong > 0) {
            this.soLuong = soLuong;
            return true;
        } else {
            System.out.println("Số lượng phải lớn hơn k !");
            return false;

        }

    }

    public float getTongTien() {
        return tongTien;
    }

    public float setTongTien(float tongTien) {
        // this.tongTien += getDonGia() * getSoLuong();
        return tongTien;
    }

    float TongTienn() {

        return tongTien = this.getDonGia() * this.getSoLuong();
    }

    @SuppressWarnings("empty-statement")
    public void Nhap() {
        System.out.println("----------Nhập Thiết Bị------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        maThietBi = sc.nextLine();
        System.out.println("Nhập tên: ");
        tenThietBi = sc.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        nhaSX = sc.nextLine();
        System.out.println("Đơn giá: ");
        try {
              while(!setDonGia(sc.nextFloat()));
        }catch(InputMismatchException e){
            System.out.println("Vui lòng nhập số!!");
        } catch (Exception e) {
        }
      
        System.out.println("Nhập số lượng: ");
        try {
             while(!setSoLuong(sc.nextInt()));
           
        } catch(InputMismatchException e){
            System.out.println("Vui lòng nhập số!");
        }catch (Exception e) {
            System.out.println("đã có lỗi");
        }
       
    }

    public void Hien() {
        System.out.printf("%-20s%-20s%-20s%-20s", getMaThietBi(), getTenThietBi(), getNhaSX(), nf.format(donGia));

        System.out.println("");
    }

    public void HienHD() {
        System.out.printf("%-20s%-20s%-20s%-20f%-20d%-20s", getMaThietBi(), getTenThietBi(), getNhaSX(), nf.format(donGia), getSoLuong(), nf.format(TongTienn()));

        System.out.println("");
    }

    @Override
    public int compareTo(ThietBi tb) {
        return tb.getTenThietBi().compareToIgnoreCase(tenThietBi);
    }

}
