package experiment.chapter5;

public class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;

    public void setTuxing(Geometry[] t) {
        this.tuxing = t;
    }

    public double computerTotalArea() {
        for (int i = 0; i < tuxing.length; i++) {
            totalArea += tuxing[i].getArea();
        }
        return totalArea;
    }
}
