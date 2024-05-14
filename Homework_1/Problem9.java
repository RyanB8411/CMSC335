package Homework_1;

public class Problem9 {

    class Airplane {

        // Private fields
        private String airplaneId;
        private int altitude;
        private int speed;
    
        // Constructor
        public Airplane(String airplaneId, int altitude, int speed) {
            this.airplaneId = airplaneId;
            this.altitude = altitude;
            this.speed = speed;
        }
    
        // Getter methods
        public String getAirplaneId() {
            return airplaneId;
        }
    
        public int getAltitude() {
            return altitude;
        }
    
        public int getSpeed() {
            return speed;
        }
    
        // Setter methods
        public void setAirplaneId(String airplaneId) {
            this.airplaneId = airplaneId;
        }
    
        public void setAltitude(int altitude) {
            this.altitude = altitude;
        }
    
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    
    }
    public class PassengerAirplane extends Airplane {

        // Private field
        private int numberOfPassengers;
    
        // Constructor
        public PassengerAirplane(String airplaneId, int altitude, int speed, int numberOfPassengers) {
            super(airplaneId, altitude, speed);
            this.numberOfPassengers = numberOfPassengers;
        }
    
        // Getter method
        public int getNumberOfPassengers() {
            return numberOfPassengers;
        }
    
        // Setter method
        public void setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        }
    
        // Method to perform takeoff
        public void takeoff() {
            // Code to perform takeoff for passenger airplane
        }
    }
}
