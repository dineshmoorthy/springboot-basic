package com.centurylink.pctl.mod.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by begin.samuel on 10/4/2016.
 */


@Document(collection="airtelplan")
public class AirtelPlan implements Serializable {


    @Id
    private String _id;
        private String descriptions;
        private String name;
        private String sponsorId;
        private List<Details> details;

    public  AirtelPlan(String _id, String descriptions, String name, String sponsorId, List<Details> details){
        this._id = _id;
        this.descriptions = descriptions;
        this.name = name;
        this.sponsorId = sponsorId;
        this.details = details;
    }

    public String get_id ()
    {
        return _id;
    }

    public void set_id (String id)
    {
        this._id = id;
    }
    public String getSponsorId ()
    {
        return sponsorId;
    }

    public void setSponsorId (String sponsorId)
    {
        this.sponsorId = sponsorId;
    }
    public String getDescriptions ()
    {
        return descriptions;
    }

    public void setDescriptions (String descriptions)
    {
        this.descriptions = descriptions;
    }

       public List<Details> getDetails ()
        {
            return details;
        }

        public void setDetails (List<Details> details)
        {
            this.details = details;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }



        @Override
        public String toString()
        {
            return "Productwo {" +

                "descriptions = "+descriptions+"," +

                "details = "+details+"," +
                "name = "+name+", " +


                "sponsorId = "+sponsorId+"}";
        }
}
