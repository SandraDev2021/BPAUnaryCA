


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceRegistration;

public class ServerStreaming extends CustomerSupportGrpc.CustomerSupportImplBase {
	

	//Stephane made the abstract class extension before and John made it after, so it doesn't affect anything.
	// Stephane made Server separated from serverImpl and John made just the Server.

	private static final Logger logger = Logger.getLogger(ServerStreaming.class.getName());
		
		public static void main(String[] args) throws IOException, InterruptedException {
			  
			
		//	ServerStreaming serverStr= new ServerStreaming();

			int port = 50051;
			String service_type = "_CustomerService._tcp.local.";
			String service_name = "CustomerService";
			SimpleServiceRegistration ssr2 = new SimpleServiceRegistration();
			ssr2.run(port, service_type ,service_name);

		    
			try {
				Server server = ServerBuilder.forPort(port)
				    .addService((BindableService) new CustomerSupportImpl())
				    .build()
				    .start();
				System.out.println("\nServer Streaming Started");
				
				 server.awaitTermination();

				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    logger.info("Server started, listening on " + port);
		    		    
		   
		}
		/* ServerStreaming serverSS = new ServerStreaming();

			 

			            Properties prop = serverSS.getProperties();
			            
			            serverSS.registerService(prop);
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
			            
			             try (InputStream input = new FileInputStream("src/main/resources/serverStreaming.properties")) {

			 

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
		//server implementation
	    static class CustomerSupportImpl extends CustomerSupportGrpc.CustomerSupportImplBase{  
	    	/*name of the service(CustomerSupport) + Impl extends
	    	 * CustomerSupportGrpc.CustomerSupportImplBase
	    	 */
		
		public void getCustomerSupport1(SupportRequest1 request, StreamObserver<SupportResponse1>responseObserver) {
			//same name of the service - rpc(getCustomerSupport) and parameters are its request and response messages
			
			System.out.println(request.getAvailableDay());
			String available_day = request.getAvailableDay();// what is inside the request message and get this request - request building
			
			/* here, the error was on define available_day as int. I should be defined as String. I probably will have to rebuild the whole project again and
			and also figure out how to do the streaming with more than 1  different responses.
			*/
		try {	
			
			SupportResponse1.Builder response1 = SupportResponse1.newBuilder(); // response building
			response1.setCourseStartJune14("June 14th").build();//setting Course_start_June_14 as a response to available_day request
			
		   
			SupportResponse1.Builder response2 = SupportResponse1.newBuilder(); // response building
			response2.setCourseStartJune28("June 28th").build();//setting Course_start_June_28 as a response to available_day request
			
			SupportResponse1.Builder response3 = SupportResponse1.newBuilder(); // response building
			response3.setCourseStartAugust16("August 16th").build();//setting Course_start_August_16 as a response to p available_day request 
			
			/*
			 * OBS: THERE WERE SPACES BETWEEN THE WORDS IN MY METHODS (THE FILDS IN THE SUPPORT RESPONSE) AND
			 * I HAD TAKE THEM OUT TURNING THE SUBSEQUENT LETTERS AS UPPERCASES. IN THE ORIGINAL FORMAT WAS GIVING 
			 * ME ERRORS!
			 * 
			 * try to use:
			 * response1.setCourseStartJune14(“Course start 1: June 14th”).build();//setting Course_start_June_14 as a response to available_day request, using the proper message in the response
			   response2.setCourseStartJune14(“Course start 2: June 28th”).build();//setting Course_start_June_14 as a response to available_day request, using the proper message in the response
			   response3.setCourseStartJune14(“Course start 3: August 16th”).build();//setting Course_start_June_14 as a response to available_day request, using the proper message in the response

			 * 
			 */
			
			for(int i = 0; i<=1;i++) {
			responseObserver.onNext(response1.build());// send the response to the client
			Thread.sleep(500);
			responseObserver.onNext(response2.build());// send the response to the client
			Thread.sleep(500);
			responseObserver.onNext(response3.build());// send the response to the client
			Thread.sleep(500);
			}// end of for loop
		}catch(Exception e) {
			e.printStackTrace();
		}finally {// finally lets you to execute code regardless the result of try/catch
			
			responseObserver.onCompleted();// complete the rpc call
		}
			
		}//end of public void GetCustomer
	}//end of serverUnaryImpl extends


}//END OF class ServerStreaming

/*
 * import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.helloworld2.GreeterGrpc.GreeterImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HelloWorld2Server extends GreeterImplBase {

	private static final Logger logger = Logger.getLogger(HelloWorld2Server.class.getName());

	public static void main(String[] args) {
		
		HelloWorld2Server greeterserver = new HelloWorld2Server();

		int port = 50052;
		String service_type = "_grpc2._tcp.local.";
		String service_name = "GrpcServer2";
		SimpleServiceRegistration ssr2 = new SimpleServiceRegistration();
		ssr2.run(port, service_type ,service_name);

	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(greeterserver)
			    .build()
			    .start();
			System.out.println("\nServer V1.2 Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	@Override
	public void sayHello(HelloRequest request,  StreamObserver<HelloReply> responseObserver) {
		    
		//System.out.println("receiving hello request V 1.1");
		
		 HelloReply reply = HelloReply.newBuilder().setMessage("Hi out there again " + request.getName() + " from port 51002").build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}

 */

