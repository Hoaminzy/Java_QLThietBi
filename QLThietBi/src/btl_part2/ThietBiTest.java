/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_part2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
// hòa óc heo
public class ThietBiTest {



    static void menu() {
        System.out.println("+--------------CÁC CHỨC NĂNG-------------+");
        System.out.println("+ 1.Nhập thiết bị                        +");
        System.out.println("+ 2.Hiện thiết bị                        +");
        System.out.println("+ 3.Nhập danh sách hóa đơn               +");
        System.out.println("+ 4.Hiện danh sách hóa đơn               +");
        System.out.println("+ 5.                                     +");
        System.out.println("+---------------------***----------------+");

    }

    static void menu1() {
        System.out.println("+-----------Nhập Thiết bị----------+");
        System.out.println("+ 1. Linh kiện LapTop              +");
        System.out.println("+ 2. Linh kiện PC                  +");
        System.out.println("+ 3. Thiết bị ngoại vi             +");
        System.out.println("+----------------***---------------+");

    }

    static void menu2() {
        System.out.println("+----------Hiện thiết bị-----------+");
        System.out.println("+ 1.Hiên tất cả thiết bị           +");
        System.out.println("+ 2.Hiên danh sách linh kiện PC    +");
        System.out.println("+ 3.Hiện ds linh kiện LapTop       +");
        System.out.println("+ 4.Hiên ds thiết bị ngoại vi      +");
        System.out.println("+----------------***---------------+");

    }

    static void menu3() {

    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        int n;
        int chon;
        HoaDon hd = new HoaDon();
        DSHoaDon dshd = new DSHoaDon();
        DsThietBi dstb = new DsThietBi();
        ChucNang cn = new ChucNang();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Mời chọn!");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhập số lượng thiết bị: ");
                    n = sc.nextInt();
                    menu1();
                    dstb.NhapDS(n);
//                    System.out.println("Bạn muốn tiếp tục k ? 3->KT: ");
//                    chon = sc.nextInt();
                    break;
                case 2:
                    menu2();
                    dstb.HienDS();
//                    System.out.println("Bạn muốn tiếp tục k ? 3->KT: ");
//                    chon = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Nhập số lượng hóa đơn: ");
                    n=sc.nextInt();
                    dshd.NhapDSHoaDon(n);
                    break;
                case 4:
                    dshd.HienDSHoaDon();
                    break;
                case 5:
                    menu1();
                     System.out.println("Chon thiết bị cần thêm: ");
                   chon = new Scanner(System.in).nextInt();         
                    cn.ThemThietBi(chon);
                    break;
                case 6:
                    cn.SPTren50k();
                    break;
                case 7:
                    cn.sort();
                    menu2();
                 System.out.println("Hiện danh sách sắp xếp!");
                    dstb.HienDS();
                    break;
                case 8:
                    System.out.println("add thiết bị");
                    hd.addLKPC();
                    break;
                case 9:
                    HoaDonn hdd= new HoaDonn();
                    hdd.add();
                    break;
                default:
                    System.out.println("Chon sai chức năng!Chon lại");
                    break;

            }
        } while (chon!=7);
    }
}
