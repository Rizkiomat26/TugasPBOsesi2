public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    String getJenisHP(){
        return jenis_hp;
    }
    long getTahunPembuatan(){
        return tahun_pembuatan;
    }
    public static void main(String[] args){
        HandPhone hp = new HandPhone();
        hp.setDataHP("EsiaHidayah", 2014);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
    public String getJenis_hp() {
        return jenis_hp;
    }
    public void setJenis_hp(String jenis_hp) {
        this.jenis_hp = jenis_hp;
    }
    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }
    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }
}