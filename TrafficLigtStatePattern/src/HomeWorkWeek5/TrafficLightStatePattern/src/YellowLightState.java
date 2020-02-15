package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 */
public class YellowLightState implements TrafficLightState {
	TrafficLight trafficLight;
	
	public YellowLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state
	 */
	public void stateChange() {
		currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.getFlashingLightState());
	}
	
	public void currentLightColor() {
		System.out.println("Yellow Light");
	}
}
