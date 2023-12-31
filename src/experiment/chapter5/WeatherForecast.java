package experiment.chapter5;

public class WeatherForecast {
    public static void main(String[] args) {
        Weather weatherBeijing = new Weather();
        System.out.print("\n今天白天：");
        weatherBeijing.setState(new CloudDayState());
        weatherBeijing.show();
        System.out.print("\n今天夜间：");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("转：");
        weatherBeijing.setState(new HeavyRainState());
        weatherBeijing.show();
        System.out.print("\n明天白天：");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("\n明天夜间：");
        weatherBeijing.setState(new CloudyLittleState());
        weatherBeijing.show();
    }
}
