/**
 * @author hcalpay
 * @Date 6.11.2022
 */
public class Baba extends Dede {

    public int kilo = 100;
    public int boyu = 200;

    public Baba(int yas, boolean gobek){
        this.setYas(yas);
        this.setGobek(gobek);
    }

    @Override
    public void sporYap() {

        System.out.println("Baba : benim spor anlayışım bilgisayarda basketbol oynamak");
        super.sporYap();
    }




}
