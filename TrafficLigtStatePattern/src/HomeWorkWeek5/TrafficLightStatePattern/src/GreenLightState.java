package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 */
public class GreenLightState implements TrafficLightState {
	TrafficLight trafficLight;
	
	public GreenLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state
	 */
	public void stateChange() {
		currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.getYellowLightState());
	}
	
	public void currentLightColor() {
		System.out.println("Green Light");
	}
}
