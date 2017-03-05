package WEB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SERVER {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(54321);
		while(true)
		{
			Socket socket=serverSocket.accept();
			System.out.println("·þÎñÆ÷Æô¶¯");
			FileInputStream fileInputStream=new FileInputStream(new File("e:/obj.txt"));
			OutputStream out=socket.getOutputStream();

			byte[] buf=new byte[1024];
			int len=0;
			while((len=fileInputStream.read())!=-1)
			{
				out.write(buf, 0, len);
			}

			out.close();
			fileInputStream.close();
		}
	}

}
