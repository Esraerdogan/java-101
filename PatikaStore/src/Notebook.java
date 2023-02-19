public class Notebook {

        private int id;
        private int birimFiyat;
        private int indirimOran;
        private int stokMiktar;
        private String ad;
        private int ram = 8;
        private int depolama = 512;
        private double ekranBoyut = 14;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(int birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getIndirimOran() {
        return indirimOran;
    }

    public void setIndirimOran(int indirimOran) {
        this.indirimOran = indirimOran;
    }

    public int getStokMiktar() {
        return stokMiktar;
    }

    public void setStokMiktar(int stokMiktar) {
        this.stokMiktar = stokMiktar;
    }

    public int getAd() {
        return Integer.parseInt(ad);
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyut() {
        return ekranBoyut;
    }

    public void setEkranBoyut(double ekranBoyut) {
        this.ekranBoyut = ekranBoyut;
    }

    public Notebook(int id, String ad, int birimFiyat, String marka, int depolama, double ekranBoyut, int ram) {
        this.id = id;
        this.birimFiyat = birimFiyat;
        this.ad = ad;
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyut = ekranBoyut;

    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", birimFiyat=" + birimFiyat +
                ", indirimOran=" + indirimOran +
                ", stokMiktar=" + stokMiktar +
                ", ad='" + ad + '\'' +
                ", ram=" + ram +
                ", depolama=" + depolama +
                ", ekranBoyut=" + ekranBoyut +
                '}';
    }
}
