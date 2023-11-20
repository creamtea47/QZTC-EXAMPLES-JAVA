package experiment.chapter5;

public class AmericanPeople extends People {
    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }

    @Override
    public void averageHeight() {
        System.out.println("American average height:" + height);
    }

    public void averageWeight() {
        System.out.println("American average weight:" + weight + "kg");
    }

    public void americanBoxing() {
        System.out.println("直拳，勾拳，组合拳");
    }
}
