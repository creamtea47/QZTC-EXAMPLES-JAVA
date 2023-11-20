package experiment.chapter4;

public class Fight {
    public static void main(String[] args) {
        Tank tank1, tank2;
        tank1 = new Tank();
        tank2 = new Tank();
        tank1.setBulletAmount(10);
        tank2.setBulletAmount(10);
        System.out.printf("坦克1的初始子弹数为%d\n", tank1.getBulletAmount());
        System.out.printf("坦克2的初始子弹数为%d\n", tank2.getBulletAmount());
        tank1.speedUp(80);
        tank2.speedUp(90);
        System.out.println("坦克1加速后的速度为：" + tank1.getSpeed());
        System.out.println("坦克2加速后的速度为：" + tank2.getSpeed());
        tank1.speedDown(15);
        tank2.speedDown(30);
        System.out.println("坦克1减速后的速度为：" + tank1.getSpeed());
        System.out.println("坦克2减速后的速度为：" + tank2.getSpeed());
        System.out.println("坦克1开火：");
        tank1.fire();
        System.out.println("坦克2开火：");
        tank2.fire();
        tank2.fire();
        System.out.println("坦克1的炮弹数为：" + tank1.getBulletAmount());
        System.out.println("坦克2的炮弹数为：" + tank2.getBulletAmount());
    }

}
