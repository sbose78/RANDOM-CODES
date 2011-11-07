package src.in.robotix.xantsclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is to be used by the client code to encode Xween instructions to
 * be executed on the server side. This will typically be done inside the
 * {@link XweenClient#nextCycle(XweenActionProxy)} method.
 * 
 * */
public class XweenActionProxy {

	private Socket clientSocket;
	private InputStream input;
	private OutputStream output;
	private String broadcast;

	private static Matcher broadcastMatcher = Pattern.compile("^ *XANT +ID +(\\d+) +MESSAGE *\\{ *([A-Za-z0-9]+) *\\} *$").matcher(" ");

	/**
	 * Extracts the Xant's ID from a 'raw' hint string. A raw hint string is of
	 * the form {@code 'XANT ID &lt;ID&gt; MESSAGE &lt;HINT&gt; }'}.
	 * 
	 * @param rawHint
	 *            The 'raw' hint string to be parsed to extract the ID.
	 * 
	 * @return The Xant ID parsed or {@code -1} if the string passed to it was
	 *         invalid.
	 * 
	 * */
	public static int extractXantID(String rawHint) {
		broadcastMatcher.reset(rawHint);
		if (broadcastMatcher.find()) {
			return Integer.parseInt(broadcastMatcher.group(1));
		} else {
			return -1;
		}
	}

	/**
	 * Extracts the actual hint from a 'raw' hint string. A raw hint string is
	 * of the form {@code 'XANT ID &lt;ID&gt; MESSAGE &lt;HINT&gt; }'}.
	 * 
	 * @param rawHint
	 *            The 'raw' hint string to be parsed to extract the ID.
	 * 
	 * @return The parsed hint or {@code null} if the string passed to it was
	 *         invalid.
	 * 
	 * */
	public static String extractBroadcast(String rawHint) {
		broadcastMatcher.reset(rawHint);
		if (broadcastMatcher.find()) {
			return broadcastMatcher.group(2);
		} else {
			return null;
		}
	}

	private Vector<String> xantHints = new Vector<String>();

	/**
	 * Called to connect to the simulator server through the specified port. The
	 * participant need not be concerned with calling this method.
	 * 
	 * @param port
	 *            The port to which the client must connect.
	 * 
	 * @return {@code true} if the connection was successfully established.
	 * 
	 * */
	public boolean connect(int port) {
		try {
			clientSocket = new Socket("localhost", port);
			input = clientSocket.getInputStream();
			output = clientSocket.getOutputStream();
			writeLine("XANTS SIMULATOR 1.0 / CONNECTING XWEEN");
			String x = readLine();
			if (!x.equals("XANTS SIMULATOR 1.0 / CONNECTED XWEEN")) {
				input.close();
				output.close();
				clientSocket.close();
				return false;
			} else {
				writeLine(XweenClient.CLIENT_SIGNATURE);
				readLine();
				writeLine(String.valueOf(XweenClient.NUMBER_OF_XANTS));
				return true;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	private String readLine() throws IOException {
		StringBuffer ret = new StringBuffer();
		if (input != null) {
			int c = input.read();
			while (c != -1 && c != 10) {
				ret.append((char) ((byte) c));
				c = input.read();
			}
		}
		return ret.toString();
	}

	private void writeLine(String line) throws IOException {
		if (output != null) {
			byte[] bytes = (line + "\n").getBytes();
			output.write(bytes);
			output.flush();
		}
	}

	/**
	 * Gets the total number of hints sent by the various Xants.
	 * 
	 * @return The number of hints sent by the various Xants to the Xween.
	 * 
	 * */
	public int getNumberOfHints() {
		return xantHints.size();
	}

	/**
	 * Returns a particular hint. Please note that the hint is returned as it
	 * is, i.e., in the form {@code 'XANT ID &lt;ID&gt; MESSAGE &lt;HINT&gt; * }
	 * '}. To extract information out of it use {@link #extractXantID(String)}
	 * and / or {@link #extractBroadcast(String)}.
	 * 
	 * @param hint
	 *            The (zero-based) index of the hint to be returned.
	 * 
	 * @return The corresponding hint in the form of a {@link String}. Returns
	 *         {@code null} in case of invalid indices.
	 * 
	 * */
	public String getHint(int hint) {
		if (hint >= 0 && hint < xantHints.size()) {
			return xantHints.elementAt(hint);
		}
		return null;
	}

	/**
	 * Sets the broadcast for the current cycle.
	 * 
	 * @param b
	 *            The broadcast in the form of a {@link String}.
	 * 
	 * */
	public void setBroadcast(String b) {
		broadcast = b;
	}

	/**
	 * Called to start one cycle of execution, participants need not worry about
	 * calling this method.
	 * 
	 * */
	public void startCycle() {

		try {

			String x = readLine();
			xantHints.setSize(0);

			while (!x.equals("BROADCAST?")) {
				if (x.trim().length() != 0)
					xantHints.addElement(x);
				x = readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Called to end one cycle of execution, participants need not worry about
	 * calling this method.
	 * 
	 * */
	public void endCycle() {

		try {

			if (broadcast == null)
				writeLine(" ");
			else
				writeLine(broadcast);
			broadcast = null;

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
