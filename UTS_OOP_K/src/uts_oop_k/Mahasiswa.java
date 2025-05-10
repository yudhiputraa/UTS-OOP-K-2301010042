/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop_k;

/**
 *
 * @author Yudhi Putra
 * TGL 10 Mei 2025
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private int angkatan;

    // Constructor
    public Mahasiswa(String nama, String nim, String prodi, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.angkatan = angkatan;
    }

    // Overloading constructor
    public Mahasiswa() {
        this.nama = "Default";
        this.nim = "000000000";
        this.prodi = "Default Prodi";
        this.angkatan = 2000;
    }

    // Getter & Setter
    public String getNim() { return nim; }

    public void setNama(String nama) { this.nama = nama; }
    public void setProdi(String prodi) { this.prodi = prodi; }
    public void setAngkatan(int angkatan) { this.angkatan = angkatan; }

    // Overriding toString
    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Prodi: " + prodi + ", Angkatan: " + angkatan;
    }
}
