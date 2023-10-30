package SweetTryTwo;

public abstract class Sweets {
    String SweetName;
    Double SweetWeight;
    Double SweetPrice;

    public Sweets(String sweetName, Double sweetWeight, Double sweetPrice) {
        SweetName = sweetName;
        SweetWeight = sweetWeight;
        SweetPrice = sweetPrice;
    }

    public String getSweetName() {
        return SweetName;
    }

    public void setSweetName(String sweetName) {
        SweetName = sweetName;
    }

    public Double getSweetWeight() {
        return SweetWeight;
    }

    public void setSweetWeight(Double sweetWeight) {
        SweetWeight = sweetWeight;
    }

    public Double getSweetPrice() {
        return SweetPrice;
    }

    public void setSweetPrice(Double sweetPrice) {
        SweetPrice = sweetPrice;
    }

    @Override
    public String toString() {
        return
                 SweetName +
                ", вес - " + SweetWeight +
                ", стоимость - " + SweetPrice;
    }
}
