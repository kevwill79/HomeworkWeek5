package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 */
public class FlashingLightState implements TrafficLightState {
	TrafficLight trafficLight;
	TrafficLight state;
	
	public FlashingLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state
	 */
	public void stateChange() {
		currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.getRedLightState());
	}
	
	public void currentLightColor() {
		System.out.println("Flashing Light");
	}
}
