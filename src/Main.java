public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_YELLOW = "\u001B[33m";


        Converter con = new Converter("uah", "usd", 25);
        Converter con2 = new Converter(con);
        Converter con3 = new Converter();
        con3.setUah("uah");
        con3.setCurrency("eur");
        con3.setAmount(25);

        CryptoConverter cc = new CryptoConverter("btc", "eth", 15);

        CalcInvest ci = new CalcInvest(10, 12, 150000);
        CalcInvest ci2 = new CalcInvest(ci);
        CalcInvest ci3 = new CalcInvest();




        ci3.setTime(15);
        ci3.setPercent(13.2);
        ci3.setSum(230000);

        System.out.println(con.equals(con2));


        System.out.println(con.convertToUEPDemo() + ANSI_GREEN +" гривень" + ANSI_RESET);
        System.out.println(con2.convertToUEPDemo() + ANSI_GREEN +" гривень" + ANSI_RESET);
        System.out.println(con3.convertToUEPDemo() + ANSI_GREEN + " Гривень" + ANSI_RESET);

        System.out.println(cc.convertToCryptoDemo() + ANSI_PURPLE + " Ether" + ANSI_RESET);
        System.out.println(cc.convertToCrypto("btc", "eth", 7.7) + ANSI_PURPLE + " Ether" + ANSI_RESET);
        System.out.println(cc.convertToCrypto("btc", "sol", 2.380) + ANSI_BLUE + " Solana" + ANSI_RESET);

        System.out.println("В кінцевому результаті ви отримаєте - " + ANSI_YELLOW + ci.calcIncome() + ANSI_RESET);
        System.out.println("В кінцевому результаті ви отримаєте - " + ANSI_YELLOW + ci2.calcIncome() + ANSI_RESET);
        System.out.println("В кінцевому результаті за " + ci3.getTime() + " років, з процентом " + ci3.getPercent() + " і вкладом " + ci3.getSum() + " ви отримаєте " + ANSI_YELLOW + ci3.calcIncome() + ANSI_RESET);
        System.out.println("В кінцевому результаті за " + ci3.getTime() + " років, з процентом " + ci3.getPercent() + " і вкладом " + ci3.cc.getAmount() + " біткоіна" + " ви отримаєте " + ANSI_YELLOW + ci3.calcIncomeCC() + ANSI_RESET);

        DoubleDeposit.total();

        InvestBonus ib = new InvestBonus(11,13, 200000);
        ib.addBonus();

        con.showDate();
        cc.showDate();
        ci.showDate();
        ib.showDate();


    }
}