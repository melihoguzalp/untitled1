public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;


  //  public Araba(){

    //    System.out.println("Benim constructor ım..");

    //}

    public Araba(String renk,int kapilar, int tekerlekler, String motor, String model){

        this.renk = renk;
        this.kapilar = kapilar;
        this.tekerlekler = tekerlekler;
        this.motor = motor;
        this.model = model;

    }


    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public String getModel() {
        return model;
    }
}
