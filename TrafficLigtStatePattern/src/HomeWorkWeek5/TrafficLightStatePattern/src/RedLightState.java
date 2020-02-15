package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 */
public class RedLightState implements TrafficLightState {
	TrafficLight trafficLight;
	
	public RedLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state
	 */
	public void stateChange() {
		currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.getGreenLightState());
	}
	
	public void currentLightColor() {
		System.out.println("Red Light");
	}
}
