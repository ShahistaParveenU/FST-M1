package activities;

public class Activity3 {
    public static void main(String args[]) {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        double Earth_age=calculateEarthYears(seconds,EarthSeconds);
         System.out.println("Age on Mercury: "+ calculateYears(Earth_age,MercurySeconds));
            System.out.println("Age on Venus: "+calculateYears(Earth_age,VenusSeconds));
            System.out.println("Age on Earth: "+Earth_age);
            System.out.println("Age on Mars: "+calculateYears(Earth_age,MarsSeconds));
            System.out.println("Age on Jupiter: "+calculateYears(Earth_age,JupiterSeconds));
            System.out.println("Age on Saturn: "+calculateYears(Earth_age,SaturnSeconds));
            System.out.println("Age on Uranus: "+calculateYears(Earth_age,UranusSeconds));
            System.out.println("Age on Neptune: "+calculateYears(Earth_age,NeptuneSeconds));
}
            public static double calculateEarthYears (double seconds, double EarthSeconds)
            {
                double Earthyears = 0;
                Earthyears = seconds / EarthSeconds;
                return Earthyears;
            }

            public static double calculateYears (double Earth, double planetSeconds) {
                double years = 0;
                years = Earth / planetSeconds;
                return years;
            }
            
           
        }
