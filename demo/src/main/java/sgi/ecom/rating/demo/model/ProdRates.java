package sgi.ecom.rating.demo.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@Document(collection = "prodRates")
public class ProdRates {

    @Id
    public ObjectId id;
    public String productSku;
    @Field("class")
    public String className;
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
    public String startingInterval;
    public String startingIntervalName;
    public String surcharges;
    public Integer termMileage;
    public Integer termMonthsMax;
    public Integer termMonthsMin;
    public String vehicleCondition;
    public Integer vehicleCostMax;
    public Integer vehicleCostMin;
    public String coverageDescriptionPortal;
    public ArrayList coverageOption;
    public String carrierSku;
    public ArrayList regulatedRules;
    public String dealerTierProgramType;

}
