package experiment.chapter5;

public class ChinaPeople extends People {
    public void speakHello() {
        System.out.println("你好");
    }

    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高：" + height + "厘米");
    }

    @Override
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重：" + weight + "公斤");
    }

    public void chinaGongfu() {
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
