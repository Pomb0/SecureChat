package Security;

/**
 * Created by Jaime on 27/05/2015.
 */
public class SecurityManager implements SecurityManagerInterface{
	@Override
	public boolean isClientValid(byte[] key, int id) {
		return false;
	}

	@Override
	public byte[] encodeMessage(byte[] message, int clientId) {
		return new byte[0];
	}

	@Override
	public byte[] decodeMessage(byte[] message, int clientId) {
		return new byte[0];
	}
}
