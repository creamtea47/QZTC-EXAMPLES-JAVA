package experiment.chapter5;

import java.sql.SQLOutput;

public class HeavyRainState implements WeatherState {

    @Override
    public void showState() {
        System.out.print("大雨.");
    }
}
