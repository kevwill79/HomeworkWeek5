package HomeWorkWeek5.TrafficLightStatePattern.src;

import java.util.Timer;
import java.util.TimerTask;

/*
 * State Design Pattern
 * 
 * Traffic light has 4 states
 * The flashing light is treated like a stop sign
 */
public class TrafficLight {
	TrafficLightState greenLight;
	TrafficLightState yellowLight;	
	TrafficLightState redLight;
	TrafficLightState flashingLight;
	TrafficLightState state;
	
	//TimerTask task;
	int delay;
	
	public TrafficLight() {
		greenLight = new GreenLightState(this);
		yellowLight = new YellowLightState(this);
		redLight = new RedLightState(this);
		flashingLight = new FlashingLightState(this);
		
		//The traffic light initial state is red
		state = redLight;
	}
	
	public void stateChange() {
		state.stateChange();
	}
	
	public void currentLightColor() {
		state.currentLightColor();
	}
	
	/*public void transitionTime() {
		TimerTask lightTransition = new TimerTask() {
			public void run() {
				
			}
		};
		Timer timer = new Timer();
		delay = 10000;
		timer.schedule(lightTransition, delay);
		
	}
	
	/*public void timer(TimerTask task, int delay) {
		Timer timer = new Timer();
		this.task = null;
		this.delay = 5000;
		timer.schedule(task, delay);
	}*/
	
	//Setter
	public void setTrafficLightState(TrafficLightState state) {
		this.state = state;
	}
	
	//Getter
	public TrafficLightState getState() {
		return state;
	}
	
	//Getters for each state
	public TrafficLightState getGreenLightState() {
		return greenLight;
	}
	
	public TrafficLightState getYellowLightState() {
		return yellowLight;
	}
	
	public TrafficLightState getRedLightState() {
		return redLight;
	}
	
	//Traffic light flashes from 10 p.m. to 5 a.m.
	public TrafficLightState getFlashingLightState() {
		return flashingLight;
	}
	
	public void currentState() {
		System.out.println("The state is: " + state);
	}
}
