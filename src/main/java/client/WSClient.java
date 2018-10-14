package client;

import firstcode.com.cxf_server_sec.HelloWorldImplService;

public class WSClient {
	public static void main(String[] args) {
		System.out.println("Comenzando...");
		
		HelloWorldImplService service = new HelloWorldImplService();
		
		System.out.println(service.getHelloWorldImplPort().sayHi("Pepe"));
		
		System.out.println("Terminando...");
    }
}
