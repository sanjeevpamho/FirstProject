package code.program;
/*
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
*/
public class DeepakMain {

	public static void main(String[] args) {
		String url="";
		String output="";
		try{
			System.out.println("****posting request via jersey Client");
		//	Client client=Client.create();
		//	WebResource webResource=client.resource("http://localhost:8181//bod/jump/deviceDetails");
			//	String input = "{\"username\":\"Praveen\",\"created\":\"2014-03-20T00:38:56.472\",\"message\":\"hello praveen\"}";

			String input = "{\"username\":\"gsngaedev4\",\"password\":\"P0rt@123\",\"ip\":\"10.54.9.197\",\"port\":\"22\",\"enable_password\":\"en\",\"devicename\":\"pre\"}";
			
		//	ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
		//	output = response.getEntity(String.class);
			System.out.println(output);
			
		
			System.out.println();
		//	ServiceResponse<NetworkHandlerResponse> data = new Gson().fromJson(output, ServiceResponse.class);
		//	System.out.println("NetworkHandlerResponse object"+ data.getResponseObject());
		
		//	System.out.println(data.getErrorType());
		//	System.out.println(data.getResponseObject());
			
			
			
		}
		catch (Exception e){
			System.out.println("here");
			e.printStackTrace();
			
			//	serviceResponse.setActivationException(aex);
			//	sharepointResponse.setEmppalresponse(response);
			//	serviceResponse.setResponseObject(sharepointResponse);
		}
	}
}
