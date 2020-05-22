/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class ChucNang {

    ArrayList<ThietBi> dstb = new ArrayList<>();
    ThietBi tb;
    ThietBiNgoaiVi tbnv;
    LinhKienLapTop tklt;
    LinhKienPC lkpc;

    public void SPTren50k() {
        for (ThietBi thietBi : dstb) {
            if (thietBi.getDonGia() > 50000) {
                thietBi.getTenThietBi();
            }
        }

    }

    public void ThemThietBi(int chon) {

        int n;

        System.out.println("Nhập số lượng thiết bị muốn thêm: ");
        n = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                System.out.println("Thêm " + n + " thiết bị ngoại vi vào danh sách");
                for (int i = 0; i < n; i++) {
                    tbnv = new ThietBiNgoaiVi();
                    tbnv.Nhap();
                    dstb.add(tbnv);
                }
                break;
            case 2:
                System.out.println("Thêm " + n + " linh kiện LapTop vào danh sách");
                for (int i = 0; i < n; i++) {
                    tklt = new LinhKienLapTop();
                    tklt.Nhap();
                    dstb.add(tklt);
                }
                break;
            case 3:
                System.out.println("Thêm " + n + " linh kiện PC vào danh sách");
                for (int i = 0; i < n; i++) {
                    lkpc = new LinhKienPC();
                    lkpc.Nhap();
                    dstb.add(lkpc);

                }
                break;
            default:
                System.out.println("Nhập sai!(1-3). Vui lòng nhập lại");
                break;
        }
    }

    public void sort() {

        Collections.sort(dstb, new Comparator<ThietBi>() {
            @Override
            public int compare(ThietBi tb2, ThietBi tb1) {
                return tb1.tenThietBi.compareTo(tb2.tenThietBi);
            }
        });
      
    }
    
}
