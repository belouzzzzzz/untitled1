package SweetPresent;
import SweetPresent.SweetBox;

public class Sweet {
    public Sweet(String чупик, double v, double v1, String сладкий) {
    }

    public static void main(String[] args) {
        Sladosti chupik = new Sladosti("Чупик", 0.5, 15.5, "сладкий");
        Sladosti kinder = new Sladosti("Киндер", 2.0, 38.5, "шоколадный");
        Sladosti jelly = new Sladosti("Мармелад", 4.5, 20.0, "мягкий");
        SweetBox[] box = {chupik, kinder, jelly};
        for (SweetBox someBox: box) {
            System.out.println(someBox.toString());

        }
        double totalWeight = chupik.getWeight()+ kinder.getWeight()+ jelly.getWeight();
        double totalPrice = chupik.getPrice()+ kinder.getPrice()+ jelly.getPrice();
        System.out.println("Общий вес подарка = "+totalWeight);
        System.out.println("Общая стоимость подарка = "+totalPrice);
    }

}
