package com.centurylink.pctl.mod.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by begin.samuel on 10/14/2016.
 */
@Document(collection="airtelplan")
public class Details {

    public Details(){

    }
    public Details(@JsonProperty("nightcall") String nightcall,@JsonProperty("data") String data,@JsonProperty("atoa")String atoa,@JsonProperty("othermobiles") String othermobiles)
    {
        this.nightcall =nightcall;
        this.data = data;
        this.atoa = atoa;
        this.othermobiles = othermobiles;
    }
    private String nightcall;

    public String getNightcall() {
        return nightcall;
    }

    public void setNightcall(String nightcall) {
        this.nightcall = nightcall;
    }

    private String data;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public String getatoa() {
        return atoa;
    }

    public void setatoa(String atoa) {
        this.atoa = atoa;
    }

    private String atoa;

    private String othermobiles;

    public String getothermobiles() {
        return othermobiles;
    }

    public void setothermobiles(String othermobiles) {
        this.othermobiles = othermobiles;
    }
}
