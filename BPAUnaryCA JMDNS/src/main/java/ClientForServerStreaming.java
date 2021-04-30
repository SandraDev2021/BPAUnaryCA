
//package BPAUnaryCA;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import jmDNS.SimpleServiceDiscovery;

public class ClientForServerStreaming {
	//just one request for the many responses of the server
	private static final Logger logger = Logger.getLogger(ClientForServerStreaming.class.getName());
	
	public static void main (String[] args) throws InterruptedException {
		System.out.println("Hello, I'm a gRPC client");
		
		//ServiceInfo serviceInfo;
		String service_type = "_CustomerSupport._tcp.local.";
		
		//now retrieve the service information we are supplying in service_type
		ServiceInfo serviceInfo;
		
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		int port = 50051;//serviceInfo.getPort();
		String host = "localhost";
		//int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		 
		
		// we build a channel to establish connection with the server. For address we use a localhost and the port 
		//ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
		
		System.out.println("Creating stub");
		// creating stub using a channel
		// it is a blocking stub so it is synchronous
		CustomerSupportGrpc.CustomerSupportBlockingStub myclient = CustomerSupportGrpc.newBlockingStub(channel);
		
	//	ClientForServerStreaming client = new ClientForServerStreaming();
		
	try {
		//SERVER STREAM
		//create the client's request - just one
		SupportRequest1 available_day = SupportRequest1.newBuilder().setAvailableDay("What are the course's available days?").build();
		
		//stream the responses (in a blocking manner)
		 myclient.getCustomerSupport1(available_day).forEachRemaining(SupportResponse1 ->{
			System.out.println(SupportResponse1.getCourseStartJune14()+ SupportResponse1.getCourseStartJune28()
			+ SupportResponse1.getCourseStartAugust16()
					
					);
		});
	}catch(StatusRuntimeException e) {
	    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
	    
	    return;		
	    
    } finally {
    	//shutdown channel
    	System.out.println("Shutting down channel");
    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
		
		
		//channel.shutdown();// finish the connection after the service is provided.
		
	}//END OF ClientForServerStreaming




/*
 * private static final Logger logger = Logger.getLogger(HelloWorld2Client.class.getName());

		  
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


 */
