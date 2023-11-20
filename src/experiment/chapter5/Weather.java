package experiment.chapter5;

public class Weather {
    WeatherState state;

    public void show() {
        state.showState();
    }

    public void setState(WeatherState state) {
        this.state = state;
    }
}
