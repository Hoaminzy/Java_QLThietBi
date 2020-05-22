/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;
public class LinhKien extends ThietBi implements Serializable{
    String loaiThietBi;
    public LinhKien() {
    }
    @Override
    public void Nhap() {
        super.Nhap(); 
    }

    @Override
    public String toString() {
        return "LinhKien{" + "loaiThietBi=" + loaiThietBi + '}';
    }

    
}
