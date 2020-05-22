/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author vhc
 */
public class ThietBiNgoaiVi extends ThietBi implements Serializable{
     String loaiThietBi;
     Locale local = new Locale("vi", "VN");//định dạng đất nước với mã tiền tệ là vi, tên nước VN
      NumberFormat n= NumberFormat.getCurrencyInstance(local);
    public ThietBiNgoaiVi(String loaiThietBi) {
        this.loaiThietBi = "Thiết Bị Ngoại Vi";
    }

    public ThietBiNgoaiVi() {
        this.loaiThietBi="Thiết Bị Ngoại Vi";
    }

    public String getLoaiThietBi() {
        return loaiThietBi;
    }

    public void setLoaiThietBi(String loaiThietBi) {
        this.loaiThietBi = loaiThietBi;
    }

    @Override
    public void HienHD() {
        super.HienHD();
    }

    @Override
    public void Hien() {
        System.out.print(getLoaiThietBi()+"\t");
        super.Hien(); 
    }

    @Override
    public void Nhap() {
        super.Nhap(); }
    

}
