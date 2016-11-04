package com.centurylink.pctl.mod.product.controllers.rest;



import com.centurylink.pctl.mod.product.domain.productwo.AirtelPlanService;

import com.centurylink.pctl.mod.product.model.AirtelPlan;
import com.centurylink.pctl.mod.product.model.Details;
import com.centurylink.pctl.mod.product.model.ProductwoFull;
import com.centurylink.pctl.mod.product.model.ProductwoVariants;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/airtelplan")
public class AirtelPlanRestController {

    private static final Logger log = LoggerFactory.getLogger(AirtelPlanRestController.class);

    @Autowired
    private AirtelPlanService airtelPlanService;


    @RequestMapping(value = "/sponser", method = RequestMethod.GET)
    public AirtelPlan getProducts() {
          return airtelPlanService.findSponserId("spons001");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String saveProductTwo(@RequestBody AirtelPlan productwo) {
        AirtelPlan prdo = (AirtelPlan) airtelPlanService.saveProductTwo(productwo);
        return  "Saved Successfully..." ;
    }


    @RequestMapping(value = "/{sponsorid}", method = RequestMethod.GET)
    public List<AirtelPlan> findAirtelPlanSponsorId(@PathVariable("sponsorid") String sponsorid) {
        return Lists.newArrayList(airtelPlanService.findAirtelPlanSponsorId(sponsorid));
    }
}

