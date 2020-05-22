/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCB_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vhc
 */
public class CanBoBLL implements Serializable {

    ArrayList<CanBo> dscb;
   
    NhanVien nv;
    GiangVien gv;

    public CanBoBLL() {
        dscb = new ArrayList<>();
     
    }
void input() throws IOException, FileNotFoundException, ClassNotFoundException{
   dscb=ReadFileCB();
   

}
    public void NhapDSCB(int n) throws IOException {
        int chon;
        System.out.println("1. Nhập giảng viên");
        System.out.println("2. Nhập nhân viên");
        chon = new Scanner(System.in).nextInt();
        switch (chon) 
            {
            case 1: {
                System.out.println("Nhập giảng viên");
                for (int i = 0; i < n; i++) {
                    System.out.println("Giảng viên " + i);
                    gv = new GiangVien();
                    gv.Nhap();
                    dscb.add(gv);
                }
                SaveFileCB(dscb);
                break;
            }
            case 2:{ 
                System.out.println("Nhập nhân viên");
                for (int i = 0; i < n; i++) {
                    
                    System.out.println("Nhân viên " + i);
                    nv = new NhanVien();
                    nv.Nhap();
                    dscb.add(nv);
                }
                SaveFileCB(dscb);
                break;
            }
            default:
                System.out.println("Nhập sai!");
                break;
            }
        }
    public void HienDSGV() throws IOException, FileNotFoundException, ClassNotFoundException {
        dscb=ReadFileCB();
        for (CanBo canBo : dscb) {
            if(canBo instanceof GiangVien){
               canBo.Hien();
            }
        }
    }

    public void HienAllCanBO() throws IOException, FileNotFoundException, ClassNotFoundException {
        input();
         for (CanBo canBo : dscb) {
            
               canBo.Hien();
            
        }
    }
//        public void SaveFileNV(ArrayList<NhanVien> dsnv) throws FileNotFoundException, IOException {
//        FileOutputStream fout = new FileOutputStream("NV.dat");
//        try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
//            out.writeObject(dsnv);
//            out.close();
//        }
//    }
//
//    public ArrayList<NhanVien> ReadFileNV() throws FileNotFoundException, IOException, ClassNotFoundException {
//        int n;
//        FileInputStream fin = new FileInputStream("NV.dat");
//        try (ObjectInputStream in = new ObjectInputStream(fin)) {
//            dsnv= (ArrayList<NhanVien>) in.readObject();
//            n = dsnv.size();
//            in.close();
//        }
//        return dsnv;
//    }
        public void SaveFileCB(ArrayList<CanBo> dscb) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("CB.dat");
        try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(dscb);
            out.close();
        }
    }

    public ArrayList<CanBo> ReadFileCB() throws FileNotFoundException, IOException, ClassNotFoundException {
        int n;
        FileInputStream fin = new FileInputStream("CB.dat");
        try (ObjectInputStream in = new ObjectInputStream(fin)) {
            dscb = (ArrayList<CanBo>) in.readObject();
            n = dscb.size();
            in.close();
        }
        return dscb;
    }
    double LuonCBThapNhat() throws IOException, FileNotFoundException, ClassNotFoundException{
        input();
        double min=dscb.get(0).getLuong();
        for (int i = 0; i < dscb.size(); i++) {
            CanBo get = dscb.get(i);
            if(get.getLuong()<min){
              min=get.getLuong();
            }
        }
        System.out.println("Cán bộ có lương thấp nhất là: ");
        for (int i = 0; i < dscb.size(); i++) {
            CanBo get = dscb.get(i);
           if(get.getLuong()==min) {
               System.out.println(dscb.toString());
           
          
           }
            
        }
//        System.out.println("nhân viên thấp nahast");
//        
//        for (NhanVien ds  :dsnv) {
//            if(ds.getLuong()==min){
//              ds.getHoTen();
//              
//            }
//        }
        
        return min;
        
    }
    void SapXepLuongGianDan() throws IOException, FileNotFoundException, ClassNotFoundException{
      input();
      CanBo tg= new CanBo();
        for(int i=0; i<dscb.size();i++){
           for(int j=i+1; j<dscb.size();j++){
                if(dscb.get(i).getLuong()>dscb.get(j).getLuong()){
                    tg=dscb.get(i);
                    dscb.set(i, dscb.get(j));
                    dscb.set(j, tg);
                }
            }
        }
        System.out.println("Danh sách sắp xếp theo lương: ");
        for (CanBo canBo : dscb) {
            System.out.println(canBo.toString());
        }
      
      
    }
}
