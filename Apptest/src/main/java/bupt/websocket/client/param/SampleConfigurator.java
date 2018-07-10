package bupt.websocket.client.param;

import javax.websocket.ClientEndpointConfig.Configurator;
import javax.websocket.HandshakeResponse;
import java.util.List;
import java.util.Map;

public class SampleConfigurator extends Configurator {

	@Override
	public void beforeRequest(Map<String, List<String>> headers) {
		//Auto-generated method stub
		System.out.println(headers);
	}

	@Override
	public void afterResponse(HandshakeResponse handshakeResponse) {
		//Auto-generated method stub
		System.out.println(handshakeResponse);
	}

}
