package Security;

/**
 * Created by Jaime on 27/05/2015.
 *
 */

public interface SecurityManagerInterface {
	boolean isClientValid(byte[] key, int clientId); //TODO add parameters


	byte[] encodeMessage(byte[] message, int clientId);
	byte[] decodeMessage(byte[] message, int clientId);

}
