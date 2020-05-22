/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;

/**
 *
 * @author vhc
 */
public class LinhKienLapTop extends LinhKien implements Serializable{

    public String getLoaiThietBi() {
        return loaiThietBi;
    }

    public void setLoaiThietBi(String loaiThietBi) {
        this.loaiThietBi = "Linh Kiện LapTop";
    }

    public LinhKienLapTop() {
        this.loaiThietBi="Linh Kiện LapTop";
    }


    @Override
    public void Nhap() {
   
        super.Nhap(); 
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
    
}
