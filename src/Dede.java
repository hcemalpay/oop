/**
 * @author hcalpay
 * @Date 6.11.2022
 */
public class Dede {

    private int yas = 60;
    private boolean gobek =true;
    private boolean sac = false;
    protected String saglikDurumu = "ORTA";
    public String meslek ="asker";
    public String biyik = "Pala";


    public  Dede() {
        System.out.println("Dede oluştu");
    }

    public  Dede(int yas, boolean gobek) {
        System.out.println("dedenin orjinal yaşı:"+this.yas+"\ndedenin orjinal göbeği:"+this.gobek);
        System.out.println("dedeler yaşlı ve göbekli olurdu");
        this.yas = yas ;
        this.gobek = gobek ;
        System.out.println("dedenin yeni yaşı:"+yas+"\n dedenin yeni göbeği:"+gobek);
    }

    public Dede(String meslek, String biyik) {
        System.out.println("bıyıklı ve çalışan dede oluştu");
    }

    public void ekmekGetirme() {
        System.out.println("dede ekmek alllll");
    }

    public void kovboyFilmiIzleme() {
        System.out.println("dede pazar sabahları trt2");
    }

    public void sporYap() {
        System.out.println("Dede : spor benim için maç izlemektir.");
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isGobek() {
        return gobek;
    }

    public void setGobek(boolean gobek) {
        this.gobek = gobek;
    }

    public boolean isSac() {
        return sac;
    }

    public void setSac(boolean sac) {
        this.sac = sac;
    }

    public String getSaglikDurumu() {
        return saglikDurumu;
    }

    public void setSaglikDurumu(String saglikDurumu) {
        this.saglikDurumu = saglikDurumu;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getBiyik() {
        return biyik;
    }

    public void setBiyik(String biyik) {
        this.biyik = biyik;
    }
}
