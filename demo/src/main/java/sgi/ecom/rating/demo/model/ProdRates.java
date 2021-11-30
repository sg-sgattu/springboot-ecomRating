package sgi.ecom.rating.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@Document(collection = "productRate")
public class ProdRates {
    @Field("class")
    public String classy;
    public String productSku;
    public Boolean commercial;
    public String coverageCode;
    public String coverageDescription;
    public String dealerTier;
    public Integer deductible;
    public Boolean disappearingDeductible;
    public ArrayList multiCoverage;
    public String multiCoverageCode;
    public String odometerMax;
    public String odometerMin;
    public String paymentType;
    public String planCode;
    public String planName;
    public String premiumCoverageCode;
    public String productCode;
    public String productType;
    public String program;
    public String programAgentCode;
    public String programType;
    public ArrayList rates;
    public Integer regulatedRuleId;
    public String riskType;
}
