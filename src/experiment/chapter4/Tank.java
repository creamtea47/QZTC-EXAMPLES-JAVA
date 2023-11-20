package experiment.chapter4;

public class Tank {
    double speed;
    int bulletAmount;

    void speedUp(int s) {
        speed = s + speed;
    }

    void speedDown(int d) {
        if (speed - d >= 0) {
            speed = speed - d;
        } else {
            speed = 0;
        }
    }

    int getBulletAmount() {
        return bulletAmount;
    }

    void setBulletAmount(int m) {
        bulletAmount = m;
    }

    double getSpeed() {
        return speed;
    }

    void fire() {
        if (bulletAmount >= 1) {
            bulletAmount = bulletAmount - 1;
            System.out.printf("开火！剩余子弹%d颗\n", bulletAmount);
        } else {
            System.out.println("子弹不足，无法开火！");
        }
    }
}
