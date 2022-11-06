/**
 * @author hcalpay
 * @Date 6.11.2022
 */
public class Torun extends Baba {


    public Torun(int yas, boolean gobek) {
        super(yas, gobek);
    }

    @Override
    public void sporYap() {
        System.out.println("Ben super basket oynarım ");
        super.sporYap();
        Dede dede = new Dede(50,false);
        System.out.println(dede.toString());
        Dede buyukBaba = new Dede("örtmen","kaytan");
        System.out.println(buyukBaba.toString());

    }


}
