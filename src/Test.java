public class Test {
    public static void main (String args[]){


        //Araba araba1 = new Araba();

        //araba1.model= "Ford";

        //System.out.println(araba1.model); //OOP ile obje oluşturma . Burda public yaptık ancak oop de mantık private olmasıdır.


        //araba1.setModel("Ford");
       // System.out.println(araba1.getModel()); //encapsulation method. Burda private kullandık.(getter setter methodları yardımıyla)

        Araba araba2 = new Araba("Sarı",3,4,"10000","Ford");


        araba2.setModel("Ford");

        System.out.println(araba2.getModel());



    }
}
