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
public class HoaDon implements Serializable{
    Scanner sc = new Scanner(System.in);
    String maSP;
    int soLuongSP;
    float thanhTien;
    ThietBi tb = new ThietBi();
    KhachHang kh = new KhachHang();
    DsThietBi dsThietBi = new DsThietBi();
    ThietBiNgoaiVi tbnv;
   LinhKienLapTop lklt;
   LinhKienPC lkpc;
    ArrayList<ThietBi> dstb ;
    boolean check;

    public HoaDon() {
        dstb = new ArrayList<>();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void NhapDSTBHoaDon() {
         int chon;
         System.out.println("1. linh kiện LatTop");
         System.out.println("2. Linh kiện PC");
         System.out.println("3. Thiết bị ngoại vi");
        System.out.println("Nhập thiết bị cần mua: ");
        chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                addLKLT();
                break;
            case 2:
                addLKPC();
                break;
            case 3:
                addTBNV();
                break;
            default:
                System.out.println("sai!");
                break;
        }      
    }

    
public void addTBNV(){
    check=false;
     tbnv = new ThietBiNgoaiVi();
                for (ThietBi thietBi : dstb) {
                    if (thietBi instanceof ThietBiNgoaiVi) {
                        System.out.print("Mã cần mua: ");
                        maSP = sc.nextLine();
                        if (thietBi.getMaThietBi().equalsIgnoreCase(maSP)) {
                            do {
                                System.out.println("Số lượng cần mua:");
                                soLuongSP = sc.nextInt();
                                thietBi.setSoLuong(soLuongSP);
                                if (soLuongSP>0) {
                                    System.out.println("Số lượng nhập vào không thỏa mãn!");
                                } else {
                                    tbnv.Nhap();
                                    dstb.add(tbnv);
                                    
                                    check = true;
                                }

                            } while (soLuongSP>0);
                        }
                    }
                    if (check == true) {
                        System.out.println("Đã thêm thành công " + maSP + " vào hóa đơn!");
                    }
                }

}
public void addLKPC(){
    check=false;
  System.out.print("Mã cần mua: ");
                maSP = sc.nextLine();
                for (ThietBi thietBi : dstb) {
                    if (thietBi instanceof LinhKienPC) {
                        if (maSP.equalsIgnoreCase(thietBi.getMaThietBi())) {
                            do {
                                System.out.println("Số lượng cần mua:");
                                soLuongSP = sc.nextInt();
                                thietBi.setSoLuong(soLuongSP);
                                if (soLuongSP>0) {
                                    System.out.println("Số lượng nhập vào không thỏa mãn!");
                                } else {
                                    lkpc.Nhap();
                                    dstb.add(lkpc);
                                    check = true;
                                }

                            } while (thietBi.getSoLuong() <= 0);
                        }

                    }
                    if (check == true) {
                        System.out.println("Đã thêm thành công " + maSP + " vào hóa đơn!");
                    } else {
                        System.out.println("Thêm không thành công");
                    }
                }
}
public void addLKLT(){
  check=false;
  lklt = new LinhKienLapTop();
 System.out.print("Mã cần mua: ");
                maSP = sc.nextLine();
        for (ThietBi thietBi : dstb) {
            
            if (thietBi instanceof LinhKienLapTop) {
                if (thietBi.getMaThietBi().equalsIgnoreCase(maSP)) {
                    do {
                        System.out.println("Số lượng cần mua:");
                        soLuongSP = sc.nextInt();
                        thietBi.setSoLuong(soLuongSP);
                        if (soLuongSP>0) {
                            System.out.println("Số lượng nhập vào không thỏa mãn!");
                        } else {
                            lklt.Nhap();
                            dstb.add(lklt);
                         check = true;
                        }
                    } while (thietBi.getSoLuong() > 0);
                }
            }
            if (check == true) {
                System.out.println("Đã thêm thành công " + maSP + " vào hóa đơn!");
            } else {
                System.out.println("Thêm không thành công");
            }
        }
}
    public void NhapHD() {
        kh.NhapKH();
        NhapDSTBHoaDon();
          
    }

    public void HienHD() {
        thanhTien = 0;

        // System.out.println("HÓA ĐƠN MUA HÀNG");
        System.out.printf("%-20s%-20s%-20s", "Tên khách hàng", "Địa chỉ", "SĐT");
        System.out.println("");
        kh.HienKH();
        System.out.println("ĐÃ MUA");
        System.out.printf("%-22s%-15s%-10s%-30s%-15s%-15s%-20s", "Loại sản phẩm", "Mã sản phẩm", "Hãng SX", "Tên sản phẩm", "Đơn giá", "Số lượng", "Tổng tiền");
        System.out.println("");
        tb.Hien();
//        for (ThietBi tb : dstb) {
//           tb.Hien();
//           tb.HienHD();
//            thanhTien += tb.TongTienn();
//        }
        
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("THÀNH TIỀN: " +thanhTien);
        System.out.println("------------------------");
    }
}
