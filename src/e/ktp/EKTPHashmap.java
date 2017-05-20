package e.ktp;

import java.util.Arrays;
import java.util.HashMap;

public class EKTPHashmap {

    public static void main(String[] args) {
        HashMap<String, EKTPEnkapsulasi> b = new HashMap<>();
        b.put("NIK", new EKTPEnkapsulasi("3515131708960001","Dwi Agustian     ","Sidoarjo, 17 Agustus 1996","L", 3, 1,"Sambibulu","Sambibulu","Taman","Islam","Belum Kawin","Mahasiswa","A","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3516052411970001","Moch Bagas Prayoga ","Gresik. 24 November 1997","L", 5, 2,"Ngoro","Ngoro","Ngoro","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3507221209980002","Dwi Sandy Putra ","Malang, 12 September 1998","L", 2, 2,"Mulyoagung","Mulyoagung","Dau","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515122505980001","Hafida Isnaini     ","Mojokerto, 25 Mei 1998","P", 3, 1,"Bangsal","Bangsal","Bangsal","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515130606980001","Raissa Pratiwi Putri","Jakarta, 06 Juni 1998      ","P", 21, 3,"Gilang","Gilang","Sukodono","Islam","Belum Kawin","Mahasiswa","AB","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515122507960002","Bita Maulidiah     ","Sidoarjo, 25 Juli 1996","P", 12, 1,"Sambiroto","Sambibulu","Taman","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515112601960002","Agam Patria     ","Surabaya, 26 Januari 1996","L", 10, 3,"Driyorejo","Driyorejo","Blimbing","Islam","Belum Kawin","Mahasiswa","B","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515131504970001","Puput Elisia Ariska ","Surabaya, 15 April 1997","P", 17, 2,"Bangkingan","Bangkingan","Gedangan","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515131003940001","Steven William     ","Jakarta, 10 Maret 1994","L", 8, 1,"Trosobo","Trosobo","Krian","Islam","Belum Kawin","Mahasiswa","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515121010970001","Khairun Nisa     ","Malang, 10 Oktober 1997","P", 5, 2,"Bringin Wetan","Bringin Wetan","Lowokwaru","Islam","Belum Kawin","Mahasiswa","A","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515111205910001","Achmad Wahyudi     ","Sidoarjo, 12 Mei 1991   ","L", 3, 1,"Tlogomas","Tlogomas","Sumberaji","Islam","Kawin","Pekerja","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515130611920001","Aprilia Ayu Wuladari ","Jember, 06 November 1992","P", 3, 4,"Sepanjang","Sepanjang","Sidoagung","Kristen","Kawin","Ibu Rumah Tangga","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515131109940001","Nur Farida     ","Surabaya, 11 September 1994","P", 5, 2,"Papar","Papar","Pare","Islam","Belum Kawin","Mahasiswa","AB","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515130412920001","Ilham Johar     ","Solo, 04 Desember 1992","L", 7, 5,"Tarik","Tarik","Purworejo","Islam","Belum Kawin","Pekerja","A","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515132405200001","Wahyu Wijayanto     ","Bekasi, 24 Mei 2000    ","L", 15, 2,"Baron","Baron","Pungging","Islam","Belum Kawin","Pelajar","O","WNI"));
        b.put("NIK", new EKTPEnkapsulasi("3515132805920022","Khusnul Rofidah     ","Japan, 28 Mei 1992    ","P", 5, 2,"Karangploso","Karangploso","Njeruk","Islam","Belum Kawin","Mahasiswa","B","WNA"));
        
        System.out.println(Arrays.asList(b));
        for(EKTPEnkapsulasi a : b.values()){
            System.out.println(a.getNIK());
        }
    }
}
