package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<Map<String,String>, String>{
    @Override
    public String handleRequest(Map<String,String> event, Context context)
    {
        Class test = Class.forName("com.amazonaws.services.lambda.runtime.events.CloudFrontEvent")
        String response = new String("success");
        return response;
    }
}
