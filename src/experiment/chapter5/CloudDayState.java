package experiment.chapter5;

public class CloudDayState implements WeatherState {

    @Override
    public void showState() {
        System.out.printf("多云，有时阴.");
    }
}
