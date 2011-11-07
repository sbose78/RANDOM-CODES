package src.in.robotix.xantsclient;


/**
 * The user needs to 'fill-in' this class to provide the desired functionality.
 * One instance of this class on the client side acts as a brain for one Xant.
 * The framework automatically instantiates the required number of copies and
 * runs the simulation.
 * */
public class XantClient {

	/**
	 * This method will get executed every execution cycle of the simulation, for every Xant.
	 * 
	 * @param proxy An instance of {@link XantActionProxy}. The code inside inside the
	 * method is supposed to call the various methods through this instance to execute corresponding
	 * actions.
	 * 
	 * */
	public void nextCycle (XantActionProxy proxy) {
		proxy.moveNorth();
	}

}
