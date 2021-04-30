
//package BPAUnaryCA;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import jmDNS.SimpleServiceDiscovery;
import jmDNS.SimpleServiceRegistration;

public class ClientUnary {

	private static final Logger logger = Logger.getLogger(ClientUnary.class.getName());
	
	public static void main (String[] args) throws InterruptedException {
		System.out.println("Hello, I'm a gRPC client");
		

		ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		//Now retrieve the service info - all we are supplying is the service type
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		//Use the serviceInfo to retrieve the port
		int port = 50051;//serviceInfo.getPort();
		String host = "localhost";
		//int port = 50051;
		
	// we build a channel to establish connection with the server. For address we use a localhost and the port	
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		

		
		System.out.println("Creating stub");
		// creating stub using a channel
		CustomerSupportGrpc.CustomerSupportBlockingStub myclient = CustomerSupportGrpc.newBlockingStub(channel);
		
		//GreeterBlockingStub  blockingStub = GreeterGrpc.newBlockingStub(channel);
				
	   // ClientUnary client = new ClientUnary();
	    
	    try {
	    	// here, goes your code
	    	
			// create the request from the client
			SupportRequest request = SupportRequest.newBuilder().setPayment("How can I pay for the course?").build();
			
			//create the response
			SupportResponse response = myclient.getCustomerSupport(request);
			
			
			System.out.println(response.getCardPay());// the response is "the course can be paid by transference or by card"
			
			System.out.println("Shutting down channel");
			channel.shutdown();// finish the connection after the service is provided.
	    	 
	    	 //logger.info("Greeting: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	

		
	//}// end of main method

}//END OF ClientUnary

/*import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import grpc.examples.helloworld2.GreeterGrpc.GreeterBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class HelloWorld2Client {

	private static final Logger logger = Logger.getLogger(HelloWorld2Client.class.getName());

		  
	public static void main(String[] args) throws Exception {
		
		ServiceInfo serviceInfo;
		serviceInfo = SimpleServiceDiscovery.run();
		int port = serviceInfo.getPort();
		String host = "localhost";
		//int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub  blockingStub = GreeterGrpc.newBlockingStub(channel);
				
	    HelloWorld2Client client = new HelloWorld2Client();
	    
	    try {
	    	 String name = "Joe and Ann";
	    	 HelloRequest request = HelloRequest.newBuilder().setName(name).build();
	    	 
	    	 HelloReply response = blockingStub.sayHello(request);
	    	 
	    	 logger.info("Greeting: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
 * 
 */
