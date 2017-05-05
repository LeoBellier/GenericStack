package listaGenerica;
import java.util.Random;

public class RandomGenerator {

	Random r;
			
	/***
	 * Returns a small int (between 0 and 50)
	 * @return
	 */
	public int getSmallRandomInt() {
		return r.nextInt(50);
	}
	
	/***
	 * Returns a big int (between 0 and 100)
	 * @return
	 */
	public int getBigRandomInt() {
		return r.nextInt(200);
	}

	/***
	 * returns a String of the size specified
	 * @param size
	 * @return
	 */
	public String getRandomString(int size) {
		char[] alphabet = {'Q', 'w', 'E', 'R', 't', 'Y', 'u', 'I', 'i', 'e', 'O', 'o', 'b','B', 'S', 's', 'F', 'f', 'c', 'A'};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(alphabet[r.nextInt(20)]);
		}
		return sb.toString();
	}

	/**
	 * Returns a string of size 5, which is small isn't it
	 * @return
	 */
	public String getSmallRandomString() {
		return getRandomString(5);
	}
	
	public RandomGenerator() {
		super();
		r = new Random();
	}
	
	
}