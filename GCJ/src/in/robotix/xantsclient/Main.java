package src.in.robotix.xantsclient;

/**
 * This class handles the low level details of actually creating the required
 * objects and running the simulation. Participants need worry about the
 * contents of this class.
 * */

public class Main {

	/**
	 * Tries to connect to the simulator on this port.
	 * */
	private static final int PORT = 7657;

	/**
	 * Set to the number of cycles the execution is supposed to run.
	 * */
	private static final int CYCLES = 400;

	/**
	 * Set up the sockets and run the simulation.
	 * */
	public static void runSimulation() {

		final XweenActionProxy xweenProxy = new XweenActionProxy();
		final XweenClient xweenClient = new XweenClient();

		xweenProxy.connect(PORT);
		System.out.println("Connected the Xween.");

		Thread xween = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < CYCLES; i++) {
					xweenProxy.startCycle();
					xweenClient.nextCycle(xweenProxy);
					xweenProxy.endCycle();
				}
				System.out.println("Simulation Complete.");
			}

		});

		Thread xants = new Thread(new Runnable() {

			@Override
			public void run() {
				XantClient[] clients = new XantClient[XweenClient.NUMBER_OF_XANTS];
				XantActionProxy[] proxies = new XantActionProxy[XweenClient.NUMBER_OF_XANTS];
				for (int i = 0; i < XweenClient.NUMBER_OF_XANTS; i++) {
					clients[i] = new XantClient();
					proxies[i] = new XantActionProxy();
					proxies[i].connect(PORT);
				}
				System.out.println("Connected the Xants.");
				for (int i = 0; i < CYCLES; i++) {
					for (int j = 0; j < XweenClient.NUMBER_OF_XANTS; j++) {
						proxies[j].startCycle();
					}
					for (int j = 0; j < XweenClient.NUMBER_OF_XANTS; j++) {
						clients[j].nextCycle(proxies[j]);
						proxies[j].endCycle();
					}
				}
			}

		});

		xween.start();
		xants.start();

	}

	public static void main(String[] args) {
		System.out.println("Xants Client Code '" + XweenClient.CLIENT_SIGNATURE
				+ "'\n   http://robotix.in");
		runSimulation();
	}

}
