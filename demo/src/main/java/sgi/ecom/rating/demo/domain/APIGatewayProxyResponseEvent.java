package sgi.ecom.rating.demo.domain;

import lombok.Data;
import org.bson.Document;

@Data
public class APIGatewayProxyResponseEvent {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Document getData() {
        return data;
    }

    public void setData(Document data) {
        this.data = data;
    }

    private  String status;
    private  Integer responseCode;
    private  String responseDescription;
    private Document data;

    public void setBody(String s) {
    }
}
