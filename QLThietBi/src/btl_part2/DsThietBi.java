/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import QLCB_Test.CanBo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class DsThietBi {
 LinhKienLapTop lklt;
 LinhKienPC lkpc;
  ThietBiNgoaiVi tbnv ;
    ArrayList<ThietBi> dstb;

    public DsThietBi() {
        dstb = new ArrayList<>();

    }

    public void NhapDS(int n) throws IOException {
        int chon;
        System.out.println("Mời bạn chon thiết bị cần nhập!!");
        chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                System.out.println("-----------Nhập thông tin Laptop----------");
                for (int i = 0; i < n; i++) {
                    lklt = new LinhKienLapTop();
                    System.out.println("LK Laptop " + i + ": ");
                    dstb.add(lklt);
                    lklt.Nhap();
                }
                SaveFileTB(dstb);
                break;
            case 2:
                System.out.println("-----------Nhập thông tin thiết bị PC---------------");
                for (int i = 0; i < n; i++) {
                    System.out.println("LK PC " + i + ":");
                   lkpc = new LinhKienPC();
                    dstb.add(lkpc);
                    lkpc.Nhap();
                }
                SaveFileTB(dstb);
                break;
            case 3:
                System.out.println("---------Nhập thông tin TB ngoại vi------------");
                for (int i = 0; i < n; i++) {
                   tbnv = new ThietBiNgoaiVi();
                    System.out.println("TB Ngoại Vi " + i + ":");
                    dstb.add(tbnv);
                    tbnv.Nhap();
                   SaveFileTB(dstb);
                }
                 break;
            default:
                System.out.println("Chon sai!(1->4)");
                break;

        }
    }

    public void HienDS() throws IOException, FileNotFoundException, ClassNotFoundException {
        int chon;
        System.out.println("Chon danh sách bạn muốn hiện: ");
        chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                System.out.println("------------------Hiện All Danh Sách Thiết Bị----------------------");
                dstb = ReadFileTB();
                for (ThietBi thietBi : dstb) {
                    thietBi.Hien();
                }
                break;
            case 2:
                System.out.println("-------------------Hiện Danh Sách Linh Kiện PC------------------");
                dstb = ReadFileTB();
                for (ThietBi thietBi : dstb) {
                    if (thietBi instanceof LinhKienPC) {
                        thietBi.Hien();
                    }

                }
                break;
            case 3: {
                System.out.println("-------------------Hiện danh sách Linh Kiện LapTop--------------------");
                dstb = ReadFileTB();
                
                for (ThietBi thietBi : dstb) {
                    if (thietBi instanceof LinhKienLapTop) {
                        thietBi.Hien();
                    }
                }
                break;
            }
            case 4: {
                 
                System.out.println("------------------Hiện danh sách thiết bị ngoại vi-----------------");
                dstb=ReadFileTB();
                for (ThietBi thietBi : dstb) {
                    if (thietBi instanceof ThietBiNgoaiVi) {
                        thietBi.Hien();
                    }

                }

            }
            break;
            default:
                System.out.println("Chon sai!(1->4)");
                break;
        }

    }
    
       public void SaveFileTB(ArrayList<ThietBi> dstb) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("ThietBi.dat");
        try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(dstb);
            out.close();
        }
    }

    public ArrayList<ThietBi> ReadFileTB() throws FileNotFoundException, IOException, ClassNotFoundException {
        int n;
        FileInputStream fin = new FileInputStream("ThietBi.dat");
        try (ObjectInputStream in = new ObjectInputStream(fin)) {
            dstb = (ArrayList<ThietBi>) in.readObject();
            n = dstb.size();
            in.close();
        }
        return dstb;
    }
    
}
