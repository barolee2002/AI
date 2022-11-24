package Lab_2;
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart() ;

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger", 87 , 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War" , "Science Fiction" , "George", 87 , 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation" , 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


        anOrder.hienthi();

        System.out.println("Total Cost Is : " + anOrder.totalCost());


        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.remove("The Lion King");
        anOrder.hienthi();

        System.out.println("Total Cost Is : " + anOrder.totalCost());


        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Ky Nguyenn" , "Animation" , 30.00f);
        anOrder.addDigitalVideoDisc(dvd4);

        anOrder.hienthi();

        System.out.println("Total Cost Is : " + anOrder.totalCost());
    }
}