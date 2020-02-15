package HomeWorkWeek5.TrafficLightStatePattern.src;
/*
 * State Design Pattern
 * 
 * currentLightColor() current traffic signal state (grn, red, yel, flash)
 * stateChange() transitions traffic signal to the next state
 * timer() transition time for each state
 */
public interface TrafficLightState {
	
	public void currentLightColor();
	public void stateChange();
}
