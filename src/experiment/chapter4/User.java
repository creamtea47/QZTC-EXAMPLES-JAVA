package experiment.chapter4;

public class User {
    public static void main(String[] args) {
        CD dataCD = new CD();
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8};
        dataCD.setSize(b.length);
        dataCD.setContent(b);
        int a[] = dataCD.getContent();
        System.out.println("dataCD上的内容：");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
        }
        Computer computerIMB = new Computer();
        computerIMB.putCD(dataCD);
        System.out.println("\n将dataCD上的内容复制到computerIMB上：");
        computerIMB.copyToComputer();
        System.out.println("computerIMB上的内容：");
        computerIMB.showData();
        int m = 12;
        System.out.println("\ncomputerIMB上的内容全部加" + m + "后：");
        computerIMB.addData(m);
        System.out.println("computerIMB将增值后的内容复制到dataCD上：");
        computerIMB.copyToCD();
        System.out.println("dataCD上的内容：");
        a = dataCD.getContent();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
        }
    }
}
