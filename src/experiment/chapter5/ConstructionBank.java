package experiment.chapter5;

public class ConstructionBank extends Bank {
    double year;

    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        double yearInterest = super.computerInterest();
        double day = (int) (r * 365);
        double dayInterest = day * 0.0001 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d元存在建设银行%d年零%d天的利息:%f元\n", savedMoney, (int) year, (int) day, interest);
        return interest;
    }
}
