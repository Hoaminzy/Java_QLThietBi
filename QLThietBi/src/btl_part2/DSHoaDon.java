/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vhc
 */
public class DSHoaDon implements Serializable{
   // ArrayList<KhachHang> dskh;
    ArrayList<HoaDon> dshd;
    HoaDon hd;
   // KhachHang kh;
    public DSHoaDon() {
      //  dskh= new ArrayList<>();
        dshd=new ArrayList<>();
        
    }
    
 public  void NhapDSHoaDon(int n){
     for (int i = 0; i < n; i++) {
         hd=new HoaDon();
         hd.NhapHD();
         dshd.add(hd);
      
     }
 }
 public void HienDSHoaDon(){
     for (HoaDon hoaDon : dshd) {
         System.out.println("*********Danh Sách Hóa Đơn************");
         hoaDon.HienHD();
     }
 }
 
   
    
}
