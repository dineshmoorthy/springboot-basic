package com.centurylink.pctl.mod.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dakshinamoorthyd on 28-10-2016.
 */
public class ListAirtelPlan {

    @JsonProperty( "parameters" )
 List atlPlan = new ArrayList<AirtelPlan>();


    public ListAirtelPlan(List atlPlan) {
        this.atlPlan = atlPlan;
    }

    public List getAtlPlan() {
        return atlPlan;
    }

    public void setAtlPlan(List atlPlan) {
        this.atlPlan = atlPlan;
    }
}
