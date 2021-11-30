package sgi.ecom.rating.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Document(collection = "dealer")
public class Dealer {

    public String dealerCode;
    public String dealerCountry;
    private String dealerName;
    private String dealerState;
    private ArrayList productClassGroupCode;
    private ArrayList products;
    private String programAgentCode;
    private String programName;

}
