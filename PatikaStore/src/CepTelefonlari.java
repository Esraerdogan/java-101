public class CepTelefonlari{

        private int id;
        private int birimFiyat;
        private int indirimOran;
        private int stokMiktar;
        private String ad;
        private String hafiza = "128 GB, 64 GB";
        private double ekranBoyut = 6.1;
        private int pil = 4000;
        private int ram = 6;
        private String renk = "Siyah,Kırmızı,Mavi";

        public CepTelefonlari(int id, String ad, int birimFiyat, String marka, int hafiza, double ekranBoyut, int kamera, int pil, int ram, String renk) {
                this.id = id;
                this.birimFiyat = birimFiyat;
                this.indirimOran = indirimOran;
                this.stokMiktar = stokMiktar;
                this.ad = String.valueOf(ad);
                this.hafiza = String.valueOf(hafiza);
                this.ekranBoyut = ekranBoyut;
                this.pil = pil;
                this.ram = ram;
                this.renk = renk;
        }

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

        public String getHafiza() {
                return hafiza;
        }

        public void setHafiza(String hafiza) {
                this.hafiza = hafiza;
        }

        public double getEkranBoyut() {
                return ekranBoyut;
        }

        public void setEkranBoyut(double ekranBoyut) {
                this.ekranBoyut = ekranBoyut;
        }

        public int getPil() {
                return pil;
        }

        public void setPil(int pil) {
                this.pil = pil;
        }

        public int getRam() {
                return ram;
        }

        public void setRam(int ram) {
                this.ram = ram;
        }

        public String getRenk() {
                return renk;
        }

        public void setRenk(String renk) {
                this.renk = renk;
        }

        @Override
        public String toString() {
                return "CepTelefonlari{" +
                        "id=" + id +
                        ", birimFiyat=" + birimFiyat +
                        ", indirimOran=" + indirimOran +
                        ", stokMiktar=" + stokMiktar +
                        ", ad='" + ad + '\'' +
                        ", hafiza='" + hafiza + '\'' +
                        ", ekranBoyut=" + ekranBoyut +
                        ", pil=" + pil +
                        ", ram=" + ram +
                        ", renk='" + renk + '\'' +
                        '}';
        }
}
