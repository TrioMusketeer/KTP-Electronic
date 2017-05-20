package e.ktp;

public class Ktp {
    private String  NIK;
    private String Nama;
    private String TTL;
    private String JK;
    private int Rt;
    private int Rw;
    private String Desa;
    private String Kel;
    private String Kec;
    private String Agama;
    private String StatusKawin;
    private String Pekerjaan;
    private String GolonganDarah;
    private String Kewarganegaraan;
    
    public Ktp(String NIK, String Nama, String TTL, String JK, int Rt, int Rw, String Desa, String Kel, 
            String Kec, String Agama, String StatusKawin, String Pekerjaan, String GolonganDarah, String Kewarganegaraan){
        setNIK(NIK);
        setNama(Nama);
        setTTL(TTL);
        setJK(JK);
        setRt(Rt);
        setRw(Rw);
        setDesa(Desa);
        setKel(Kel);
        setKec(Kec);
        setAgama(Agama);
        setStatusKawin(StatusKawin);
        setPekerjaan(Pekerjaan);
        setGolonganDarah(GolonganDarah);
        setKewarganegaraan(Kewarganegaraan);
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public int getRt() {
        return Rt;
    }

    public void setRt(int Rt) {
        this.Rt = Rt;
    }

    public int getRw() {
        return Rw;
    }

    public void setRw(int Rw) {
        this.Rw = Rw;
    }

    public String getDesa() {
        return Desa;
    }

    public void setDesa(String Desa) {
        this.Desa = Desa;
    }

    public String getKel() {
        return Kel;
    }

    public void setKel(String Kel) {
        this.Kel = Kel;
    }

    public String getKec() {
        return Kec;
    }

    public void setKec(String Kec) {
        this.Kec = Kec;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getStatusKawin() {
        return StatusKawin;
    }

    public void setStatusKawin(String StatusKawin) {
        this.StatusKawin = StatusKawin;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getGolonganDarah() {
        return GolonganDarah;
    }

    public void setGolonganDarah(String GolonganDarah) {
        this.GolonganDarah = GolonganDarah;
    }

    public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public void setKewarganegaraan(String Kewarganegaraan) {
        this.Kewarganegaraan = Kewarganegaraan;
    }
    
}
