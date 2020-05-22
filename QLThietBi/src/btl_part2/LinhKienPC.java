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
public class LinhKienPC extends LinhKien implements Serializable{
 

   public void setLoaiThietBi(String loaiThietBi) {
        this.loaiThietBi ="Linh Kiên PC";
    }
    public String getLoaiThietBi() {
        return loaiThietBi;
    }

 


    public LinhKienPC() {
        this.loaiThietBi="Linh Kiện PC";
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
        System.out.print(getLoaiThietBi()+"\t\t");
        super.Hien(); 
    }

 
    


    
}
