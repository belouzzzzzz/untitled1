package SweetTryTwo;

public class CandyTwo extends Sweets{
    String sticky;
    public CandyTwo (String sweetName, Double sweetWeight, Double sweetPrice,String sticky) {
        super(sweetName, sweetWeight, sweetPrice);
        this.sticky= sticky;
    }

    public String getSticky() {
        return sticky;
    }

    public void setSticky(String sticky) {
        this.sticky = sticky;
    }
    @Override
    public String toString(){
        return "Сладость 2: " + super.toString() + ", липнет к рукам - " + sticky;
    }
}
