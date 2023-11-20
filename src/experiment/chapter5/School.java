package experiment.chapter5;

public class School implements ComputerAverage {

    @Override
    public double average(double[] x) {
        int count = x.length;
        double aver = 0;
        for (int i = 0; i < count; i++) {
            aver = aver + x[i];
        }
        aver = aver / count;
        return aver;
    }
}
