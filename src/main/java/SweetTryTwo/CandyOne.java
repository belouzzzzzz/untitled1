package SweetTryTwo;

public class CandyOne extends Sweets{
    double timeToEat;
    public CandyOne (String sweetName, Double sweetWeight, Double sweetPrice,double timeToEat) {
        super(sweetName, sweetWeight, sweetPrice);
        this.timeToEat= timeToEat;
    }


    public double getTimeToEat() {
        return timeToEat;
    }

    public void setTimeToEat(Double timeToEat) {
        this.timeToEat = timeToEat;
    }
    @Override
    public String toString(){
        return "Сладость 1: " + super.toString() + ", время рассасывания - " + timeToEat + " часов";
    }
}