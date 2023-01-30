import java.util.Objects;

class CryptoConverter implements ShowDate{
    private String btc;
    private String crypto;
    private int amount;

    CryptoConverter(String btc, String crypto, int amount) {
        this.btc = btc;
        this.crypto = crypto;
        this.amount = amount;
    }


    private int convertToCrypto() {
        int total = 0;
        int ether = 1250;
        int bitcoin = 20000;
        int solana = 30;
        int tether = 1;
        if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "eth"))) {
            total = (amount * bitcoin) / ether;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "sol"))) {
            total = (amount * bitcoin) / solana;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "tet"))) {
            total = (amount * bitcoin) * tether;
        }
        return total;
    }

    int convertToCryptoDemo() {
        return convertToCrypto();
    }

    double convertToCrypto(String btc, String crypto, double amount) {
        double total = 0;
        double ether = 1250.60;
        double solana = 30.88;
        double tether = 1.01;
        int bitcoin = 20000;
        if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "eth"))) {
            total = (amount * bitcoin) / ether;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "sol"))) {
            total = (amount * bitcoin) / solana;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "tet"))) {
            total = (amount * bitcoin) / tether;
        }

        return total;
    }

    public void showDate() {
        System.out.println("Start cr-currency - " + this.btc);
        System.out.println("Finish cr-currency - " + this.crypto);
        System.out.println("Value - " + this.amount);
    }

    public int getAmount() { return amount; };



}
