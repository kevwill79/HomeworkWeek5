package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 */
public class TrafficLightTester {
	
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();

		trafficLight.currentState();
		trafficLight.stateChange();
		trafficLight.currentState();
		trafficLight.stateChange();
		trafficLight.currentState();
		trafficLight.stateChange();
		trafficLight.currentState();
		trafficLight.stateChange();
	}
}
