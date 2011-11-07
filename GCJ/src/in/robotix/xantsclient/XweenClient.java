package src.in.robotix.xantsclient;

/**
 * The user needs to 'fill-in' this class to provide the desired functionality.
 * There is only one instance of this class on the client side and that instance
 * acts the intelligence of the Xween. The instantiation is done and the
 * functions are called automatically.
 * 
 * */
public class XweenClient {

	/**
	 * Modify this constant and set it to the number of Xants to be spawned in
	 * the beginning of the simulation.
	 * */
	public static final int NUMBER_OF_XANTS = 100;

	/**
	 * Modify this constant and set it to any string you wish to <i>tag</i> your
	 * Xween with. It's value has little more than cosmetic importance.
	 * */
	public static final String CLIENT_SIGNATURE = "JAVA_GENERIC";

	/**
	 * Called once every execution cycle.
	 * 
	 * @param proxy
	 *            An instance of {@link XweenActionProxy}. The code inside
	 *            inside the method is supposed to call the various methods
	 *            through this instance to execute corresponding actions.
	 * 
	 * */
	public void nextCycle(XweenActionProxy proxy) {

		/* Write your code here. */

		proxy.setBroadcast("ROBOTiX");

	}

}
