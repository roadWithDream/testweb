package special.soldier.chapter04.socket.client.sender;

import java.io.IOException;

import special.soldier.chapter04.socket.SocketWrapper;

public interface Sendable {
	
	public byte getSendType();

	public void sendContent(SocketWrapper socketWrapper) throws IOException;
}
