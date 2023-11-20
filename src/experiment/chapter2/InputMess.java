package experiment.chapter2;

import java.util.Scanner;

public class InputMess {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入姓名（按Enter键确认）：");
        String name = reader.nextLine();
        System.out.println("输入年龄（按Enter键确认）：");
        byte age = reader.nextByte();
        System.out.println("输入身高（按Enter键确认）：");
        float height = reader.nextFloat();
        System.out.printf("%28s\n", "--基本信息--");
        System.out.printf("%10s%-10s\n", "姓名：", name);
        System.out.printf("%4s%-4d\n", "年龄：", age);
        System.out.printf("%4s%-4.2f\n", "身高：", height);
    }
}
