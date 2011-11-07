package src.in.robotix.xantsclient;

import java.util.HashMap;

/**
 * Objects of this class encapsulate two dimensional array of integers
 * (matrices). The values are stored internally as a one dimensional array. The
 * glue code uses objects of this class to pass on information about the various
 * information matrices sent to it by the core. Note that the maximum size of
 * the two dimensional matrix is {@code 7 X 7}.
 * 
 * */
public class FlatMatrix {

	private static HashMap<Integer, Integer> preCalc = new HashMap<Integer, Integer>();

	static {
		preCalc.put(8, 3);
		preCalc.put(24, 5);
		preCalc.put(48, 7);
	}

	private int[] data = new int[49]; // Magic Number :)
	private int size;

	/**
	 * Constructs an instance by parsing the passed text. Since participants
	 * will never have to directly create instances of {@link FlatMatrix}, this
	 * constructor is not relevant to the participant's code.
	 * 
	 * @param txt
	 *            The text to parse.
	 * 
	 * */
	public FlatMatrix(String txt) {
		String[] arr = txt.split(" ");
		int count = 0;
		for (String s : arr) {
			if (s.length() > 0) {
				data[count++] = Integer.parseInt(s);
			}
		}
		for (int i = count; i > count / 2; i--)
			data[i] = data[i - 1];
		data[count / 2] = -1;
		size = preCalc.get(count);
	}

	/**
	 * Returns the value stored at the location {@code (x, y)}. Keep in mind
	 * that, for performance reasons, there is a possibility of this function
	 * returning garbage for an invalid index pair. An
	 * {@link ArrayIndexOutOfBoundsException} may also be thrown.
	 * 
	 * @return The value of the {@link FlatMatrix} at the specified position,
	 *         assuming a valid index pair.
	 * 
	 * */
	public int get(int x, int y) {
		return data[x * size + y];
	}

}
