package pojos;

public class RightAngleTriangle {

    public double opposite;
    public double adjacent;

    public double unknownAngle() {
        double radians = Math.atan(opposite / adjacent);
        return Math.toDegrees(radians);
    }

    public double unknownSide() {
        double sumOfSquares = Math.pow(opposite,2) + Math.pow(adjacent, 2);
        return Math.sqrt(sumOfSquares);
    }
}
