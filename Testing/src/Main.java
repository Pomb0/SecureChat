import java.io.*;

/**
 * Created by Jaime on 27/05/2015.
 */
public class Main {
	public static void main(String[] args) throws IOException {
		final int bufferSize = 1024;
		PipedInputStream convertPipe = new PipedInputStream(bufferSize);
		PipedOutputStream dataPipe = new PipedOutputStream(convertPipe);
		BufferedInputStream bis = new BufferedInputStream(convertPipe);
		BufferedOutputStream bos = new BufferedOutputStream(dataPipe);


		int data = 0;

		bos.write(150);
		bos.flush();
		data = bis.read();

		System.out.println(data);



	}
}
