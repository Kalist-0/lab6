import java.util.Objects;

class Converter implements ShowDate{
    private String uah;
    private String currency;
    private int amount;

    Converter(String uah, String currency, int amount) {
        this.uah = uah;
        this.currency = currency;
        this.amount = amount;
    }

    Converter(Converter con) {
        this.uah = con.uah;
        this.currency = con.currency;
        this.amount = con.amount;
    }

    Converter() {

    }

    private int convertToUEP() {
        int total = 0;
        if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "usd"))) {
            total = amount * 37;
        } else if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "eur"))) {
            total = amount * 36;
        } else if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "gbp"))) {
            total = amount * 41;
        }

        return total;
    }

    int convertToUEPDemo() {
        return convertToUEP();
    }

    boolean equals(Converter con2) {
        return Objects.equals(uah, con2.uah) && Objects.equals(currency, con2.currency) && amount == con2.amount;
    }

    public void showDate() {
        System.out.println("Start currency - " + this.uah);
        System.out.println("Finish currency - " + this.currency);
        System.out.println("Value - " + this.amount);
    }



    public String getUah() {
        return uah;
    }

    public void setUah(String uah) {
        this.uah = uah;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
