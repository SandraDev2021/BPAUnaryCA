/*
//package BPAUnaryCA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//Stephane made the abstract class extension before and John made it after, so it doesn't affect anything.
// Stephane made Server separated from serverImpl and John made just the Server.

public class ServerUnary extends ServerStreaming.CustomerSupportImpl{
	

	
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		
		 ServerUnary serverUn = new ServerUnary();

			 

			            Properties prop = serverUn.getProperties();
			            
			            serverUn.registerService(prop);
			            int port = Integer.valueOf( prop.getProperty("service_port3") );// #.50051;

			 

			            try {

			 

			                  Server server = ServerBuilder.forPort(port)
			                            .addService((BindableService) new CustomerSupportImpl())
			                            .build();
			                    //server started
			                    server.start();
			                    System.out.println("Server started on Port number: " +port);

			 

			                    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			                        System.out.println("Received Shutdown Request");
			                        server.shutdown();
			                        System.out.println("Successfully stopped the server");
			                    }));

			 

			                server.awaitTermination();

			 


			            } catch (IOException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            } catch (InterruptedException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            }

			        }// end of Main method
        
			        private Properties getProperties() {
			            
			            Properties prop = null;        
			            
			             try (InputStream input = new FileInputStream("src/main/resources/unary.properties")) {

			 

			                    prop = new Properties();

			 

			                    // load a properties file
			                    prop.load(input);

			 

			                    // get the property value and print it out
			                    System.out.println("Certificate Service properties ...");
			                    System.out.println("\t service_type: " + prop.getProperty("service_type"));
			                    System.out.println("\t service_name: " +prop.getProperty("service_name"));
			                    System.out.println("\t service_description: " +prop.getProperty("service_description"));
			                    System.out.println("\t service_port: " +prop.getProperty("service_port3"));

			 

			                } catch (IOException ex) {
			                    ex.printStackTrace();
			                }
			        
			             return prop;
			        }
			        
			        
			        private  void registerService(Properties prop) {
			            
			             try {
			                    // Create a JmDNS instance
			                    JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			                    
			                    String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
			                    String service_name = prop.getProperty("service_name")  ;// "example";
			                   // int service_port = 1234;
			                    int service_port = Integer.valueOf( prop.getProperty("service_port3") );// #.50051;

			 

			                    
			                    String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
			                    
			                    // Register a service
			                    ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
			                    jmdns.registerService(serviceInfo);
			                    
			                    System.out.printf("Registering service with type %s and name %s \n", service_type, service_name);
			                    
			                    // Wait a bit
			                    Thread.sleep(1000);

			 

			                    // Unregister all services
			                    //jmdns.unregisterAllServices();

			 

			                } catch (IOException e) {
			                    System.out.println(e.getMessage());
			                } catch (InterruptedException e) {
			                    // TODO Auto-generated catch block
			                    e.printStackTrace();
			                }
			            
			        }*/
	
	//extend the abstract class
  //  static class CustomerSupportImpl extends CustomerSupportGrpc.CustomerSupportImplBase{  
    	/*name of the service(CustomerSupport) + Impl extends
    	 * CustomerSupportGrpc.CustomerSupportImplBase
    	 */
	
/*	public void getCustomerSupport(SupportRequest request, StreamObserver<SupportResponse>responseObserver) {
		//same name of the service - rpc(getCustomerSupport) and parameters are its request and response messages
		
		System.out.println(request.getPayment());
		String payment = request.getPayment();// what is inside the request message and get this request - request building
		
		
		SupportResponse.Builder response = SupportResponse.newBuilder(); // response building
		response.setCardPay("The course can be paid by transference or by card").build();//setting cardPay as a response to payment request
		
		responseObserver.onNext(response.build());// send the response to the client
		
		responseObserver.onCompleted();// complete the rpc call
		
		
	}//end of public void GetCustomer
}//end of serverUnaryImpl extends

}// end of class ServerUnary
//END OF ServerUnary*/

//package BPAUnaryCA;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceRegistration;

//Stephane made the abstract class extension before and John made it after, so it doesn't affect anything.
// Stephane made Server separated from serverImpl and John made just the Server.

public class ServerUnary extends CustomerSupportGrpc.CustomerSupportImplBase{// extends ImplBase

	//private Server server;
	private static final Logger logger = Logger.getLogger(ServerUnary.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		//John's code for JmDNS

	//	ServerUnary su = new ServerUnary();

		int port = 50051;
		String service_type = "_CustomerService._tcp.local.";
		String service_name = "CustomerService";
		SimpleServiceRegistration sReg = new SimpleServiceRegistration();
		sReg.run(port, service_type ,service_name);

		try {
			// build the server, with its port adding a service to it. The service implementation will be CustomerSupportImpl
					Server server = ServerBuilder.forPort(port)
					    .addService((BindableService) new CustomerSupportImpl())
					    .build()
					    .start();
					System.out.println("\nServer Unary Started");

					 server.awaitTermination();


				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			    logger.info("Server started, listening on " + port);
// end of John's jmDNS example

	}//end of main method


/*		final ServerUnary myserver = new ServerUnary();// create an instance of the ServerUnary
		myserver.start();

	}// end of main method

	private void start() throws IOException, InterruptedException {// we create the method start()
		int port = 50051;//assign the port
		// build the server, with its port adding a service to it. The service implementation will be ServerUnaryImpl
		server = ServerBuilder.forPort(50051).addService( (BindableService) new CustomerSupportImpl()).build().start();
		System.out.println("Server listening on port:"+ port);

		server.awaitTermination();// to prevent server from run non stop.

	}// end of start method */

	//extend the abstract class
	//server implementation
    static class CustomerSupportImpl extends CustomerSupportGrpc.CustomerSupportImplBase{
    	/*name of the service(CustomerSupport) + Impl extends
    	 * CustomerSupportGrpc.CustomerSupportImplBase
    	 */

	public void getCustomerSupport(SupportRequest request, StreamObserver<SupportResponse>responseObserver) {
		//same name of the service - rpc(getCustomerSupport) and parameters are its request and response messages

		System.out.println(request.getPayment());
		String payment = request.getPayment();// what is inside the request message and get this request - request building


		SupportResponse.Builder response = SupportResponse.newBuilder(); // response building
		response.setCardPay("The course can be paid by transference or by card").build();//setting cardPay as a response to payment request

		responseObserver.onNext(response.build());// send the response to the client

		responseObserver.onCompleted();// complete the rpc call


	}//end of public void GetCustomer
}//end of serverUnaryImpl extends

}// end of class ServerUnary
//END OF ServerUnary


