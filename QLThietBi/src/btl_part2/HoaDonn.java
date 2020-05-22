/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class HoaDonn implements Serializable{
    String maSP;
    int soLuongSp;

    public HoaDonn() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(int soLuongSp) {
        this.soLuongSp = soLuongSp;
    }
    
    ArrayList<ThietBi> dstb = new ArrayList<>();
    LinhKienLapTop lklt= new LinhKienLapTop();
    public void add(){
        System.out.println("Nhập mã");
        maSP= new Scanner(System.in).nextLine();
        //for (ThietBi thietBi : dstb) {
         //   if(maSP.equals(thietBi.getMaThietBi())){
                System.out.println("thêm số lượng: ");
                soLuongSp= new Scanner(System.in).nextInt();
          //  }
       // }
    }
}
