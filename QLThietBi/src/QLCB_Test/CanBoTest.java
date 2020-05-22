/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCB_Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhc
 */
public class CanBoTest {

    static void menu() {
        System.out.println("---------------------***--------------");
        System.out.println("1. Nhập danh sách");
        System.out.println("2. In danh sách cá bộ đã nhập");
        System.out.println("3. In ds giảng viên ");
        System.out.println("4. In cán bộ có tiền lương thấp nhất");
        System.out.println("5. Sắp xếp cán bộ theo tiền lương tăng dần");
        System.out.println("-------------------***--------------------");
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        CanBoBLL cb = new CanBoBLL();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            menu();
            System.out.println("Chon chức năng: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    int n;
                    System.out.println("Nhập số lượng: ");
                    n = sc.nextInt();
                     {
                        cb.NhapDSCB(n); }
                    break;
                case 2: {
                    cb.HienAllCanBO();
                }
                break;
                case 3: 
                    cb.HienDSGV();
                break;
                case 4:
                    cb.LuonCBThapNhat();
                    break;
                    
                    case 5:
                        cb.SapXepLuongGianDan();
                 
                        break;
                default:
                    break;

            }
        } while (true);
    }
}
