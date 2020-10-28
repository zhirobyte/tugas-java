/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.crud.mysql;

import daomodel.BukuDao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import model.Buku;

/**
 *
 * @author Andika Sundawijaya
 */
public class OopCrudMysql {

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    static BukuDao bukuDao = new BukuDao();
    static Buku buku;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu() {
        int pilihan = 0;
        do {
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("1. Insert Data");
            System.out.println("2. Show Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("0. Keluar");
            System.out.println("");
            System.out.print("PILIHAN> ");

            try {
                pilihan = Integer.parseInt(input.readLine());

                switch (pilihan) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        insertBuku();
                        break;
                    case 2:
                        showDataBuku();
                        break;
                    case 3:
                        updateBuku();
                        break;
                    case 4:
                        deleteBuku();
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (pilihan != 0);
    }

    static void showDataBuku() {
        System.out.println("+--------------------------------+");
        System.out.println("|           DATA BUKU            |");
        System.out.println("+--------------------------------+");

        List<Buku> listBuku = bukuDao.getAll();

        listBuku.forEach(buku -> System.out.println(String.format("%d. %s -- %s ",
                buku.getIdBuku(), buku.getJudul(), buku.getPengarang())));
    }

    static void insertBuku() {
        try {
            // ambil input dari user
            System.out.print("Judul: ");
            String judul = input.readLine().trim();
            System.out.print("Pengarang: ");
            String pengarang = input.readLine().trim();

            buku = new Buku(judul, pengarang);
            bukuDao.save(buku);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void updateBuku(){
        try {  
        // ambil input dari user
        System.out.print("ID yang mau diedit: ");
        int idBuku = Integer.parseInt(input.readLine());
        System.out.print("Judul: ");
        String judul = input.readLine().trim();
        System.out.print("Pengarang: ");
        String pengarang = input.readLine().trim();
        
        buku = new Buku(idBuku, judul, pengarang);
        bukuDao.update(buku);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void deleteBuku(){
        try {
        
        // ambil input dari user
        System.out.print("ID yang mau dihapus: ");
        int idBuku = Integer.parseInt(input.readLine());
        
        buku = new Buku(idBuku);
        bukuDao.delete(buku);
        
        System.out.println("Data telah terhapus...");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

}
