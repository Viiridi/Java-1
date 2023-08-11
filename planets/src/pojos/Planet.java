package pojos;

public class Planet {

    public String name;
    public long avgDistanceFromSun;
    public double radius;
    public boolean isTerrestrial;
    public String[] atmosphericConstituents;
    public static final double PI = 3.14;

    public Planet(){
    }

    public Planet(String name, long avgDistanceFromSun, double radius, boolean isTerrestrial, String[] atmosphericConstituents) {
        this.name = name;
        this.avgDistanceFromSun = avgDistanceFromSun;
        this.radius = radius;
        this.isTerrestrial = isTerrestrial;
        this.atmosphericConstituents = atmosphericConstituents;
    }

    public double circumference(){
        double diameter = radius * 2;
        return PI * diameter;
    }

    public long relativeAvgDistanceFromSunComparedWith(Planet other) {
        return avgDistanceFromSun / other.avgDistanceFromSun;
    }

    public double relativeSizeComparedWith(Planet other){
        return radius / other.radius;
    }

    public boolean isTheSameTypeAs(Planet other){
        return isTerrestrial == other.isTerrestrial;
    }

}
