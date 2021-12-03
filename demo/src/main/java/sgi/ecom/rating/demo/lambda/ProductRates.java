package sgi.ecom.rating.demo.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
//import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import sgi.ecom.rating.demo.domain.APIGatewayProxyResponseEvent;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.bson.Document;

public class ProductRates implements RequestHandler<Object, APIGatewayProxyResponseEvent> {

    // declare MongoClient as an instance variable to ensure connection pooling
    final MongoClient mongoClient = MongoClients.create("mongodb://devecomapi:63vc0mA91@awsdevratemgdb1.etch.com:27017/?authMechanism=PLAIN&replicaSet=SGDEVENTRATE&readPreference=primary&appname=MongoDB%20Compass&ssl=false&authSource=$external");

    @Override
    public APIGatewayProxyResponseEvent handleRequest(Object request, Context context) {
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        try {
            Document doc = mongoClient.getDatabase("HCI") .getCollection("productRate")
                    .find() .first();
            System.out.println("mongodb response" + doc.toJson());
            response.setBody
                    (doc == null ? null : doc.toJson());
            response.setStatus("Success");
            response.setResponseCode(200);
            response.setResponseDescription("Product Rates method executed Successfully");
            response.setData(doc);
        }
        catch (Exception e){
            System.out.println("exception occured" + e);
        }
        return response;
    }

}
