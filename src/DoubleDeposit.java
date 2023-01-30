public class DoubleDeposit implements ShowDate{
    static int timeToDouble;
    static int percent = 11;

    static {
        timeToDouble = 72 / percent;
    }

    static void total() {
        System.out.println("Ваші гроші подвояться приблизно за " + timeToDouble + " років.");
    }
    public void showDate() {
        System.out.println("Time - " + timeToDouble);
        System.out.println("Percent - " + percent);
    }
}
