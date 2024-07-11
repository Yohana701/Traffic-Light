public class Main {
    public static void main(String[] args) {
        //Step 6:Create an instance of TrafficLight and test iis functionality
        TrafficLight trafficLight = new TrafficLight("Red", 30);
        //Display the initial state
        System.out.println("Initial Traffic Light State: ");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds.");
        //Check if the light is red
        System.out.println("Is the traffic light red? " + trafficLight.isRed());
        //Change the color to green
        trafficLight.changeColor("Green");
        //Display the new state
        System.out.println("\nUpdate Traffic Light State: ");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds.");
        //Check if the light is green
        System.out.println("Is the light green? " + trafficLight.isGreen());
    }
}
