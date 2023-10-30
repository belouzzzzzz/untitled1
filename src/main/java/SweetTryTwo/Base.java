package SweetTryTwo;

public class Base {
    public static void main(String[] args) {
        CandyOne chupik=new CandyOne("Чупа-чупс",0.15,13.5,5.5 );
        CandyTwo chocolate=new CandyTwo("Шоколадка", 30.0,7.5,"очень липкая");


        Sweets [] present = {chupik, chocolate};
        for (int i = 0; i < present.length; i++) {
            System.out.println(present[i]);
        }
        double totalWeight = chupik.getSweetWeight()+chocolate.getSweetWeight();
        double totalPrice = chupik.getSweetPrice()+ chocolate.getSweetPrice();
        System.out.println("Общий вес подарка = "+totalWeight);
        System.out.println("Общая стоимость подарка = "+totalPrice);
    }
}
