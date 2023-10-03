public class MathCalc
{
    public static void main(String[] args)
    {
        double diameterOfEarthInMiles = 7600.0;
        double diameterOfSunInMiles = 865000.0;
        double radiusOfEarthInMiles = 0.0;
        double radiusOfSunInMiles = 0.0;
        double volumeOfEarthInCubicMiles = 0.0;
        double volumeOfSunInCubicMiles = 0.0;
        double volumeRatio = 0.0;

        // Calculations for radius of Earth and Sun
        radiusOfEarthInMiles = diameterOfEarthInMiles/2.0;
        radiusOfSunInMiles = diameterOfSunInMiles/2.0;

        // Calculation for Volume of Earth and Sun in Cubic Miles
        volumeOfEarthInCubicMiles = (4.0/3.0)*Math.PI*Math.pow(radiusOfEarthInMiles,3);
        volumeOfSunInCubicMiles = (4.0/3.0)*Math.PI*Math.pow(radiusOfSunInMiles,3);

        // Calculation of Ratio of Volume of Sun to Volume of Earth
        volumeRatio = volumeOfSunInCubicMiles / volumeOfEarthInCubicMiles;

        // Printing the results
        System.out.println("The Volume of the Earth in Cubic Miles  is "+volumeOfEarthInCubicMiles+"\n");
        System.out.println("The Volume of the Sun in Cubic Miles is "+volumeOfSunInCubicMiles+"\n");
        System.out.println("The Ratio of Volume of Sun to Volume of Earth is "+volumeRatio);
    }
}