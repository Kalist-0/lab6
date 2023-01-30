public class CalcInvest implements ShowDate{
    private double time;
    private double percent;
    private double sum;

    CalcInvest(int time, int percent, int sum) {
        this.time = time;
        this.percent = percent;
        this.sum = sum;
    }

    CalcInvest(CalcInvest ci2) {
        this.time = ci2.time;
        this.percent = ci2.percent;
        this.sum = ci2.sum;
    }

    CalcInvest() {

    }


    double calcIncome() {
        return sum *
                (Math.pow((1 + percent / 100), time));
    }

    CryptoConverter cc = new CryptoConverter("btc", "sol", 2);
    double calcIncomeCC() {
        double btcToUsd = cc.getAmount() * 20000;
        return btcToUsd *
                (Math.pow((1 + percent / 100), time));
    }

    public void showDate() {
        System.out.println("Time - " + this.time);
        System.out.println("Percent - " + this.percent);
        System.out.println("Sum - " + this.sum);
    }



    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent * 1.05; // бонус
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
