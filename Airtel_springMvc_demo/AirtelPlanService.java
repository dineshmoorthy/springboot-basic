package com.centurylink.pctl.mod.product.domain.productwo;



import com.centurylink.pctl.mod.product.model.AirtelPlan;
import com.centurylink.pctl.mod.product.model.Details;
import com.centurylink.pctl.mod.product.model.ProductwoFull;
import com.centurylink.pctl.mod.product.model.ProductwoVariants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by begin.samuel on 10/7/2016.
 */
@Service
public class AirtelPlanService {

    private final Logger log = LoggerFactory.getLogger(AirtelPlanService.class);

    @Autowired
    private AirtelPlanRepository airtelPlanRepository;

    public AirtelPlan findSponserId(String sponserId){
        return airtelPlanRepository.findSponserId(sponserId).get(0);
    }

    public AirtelPlan saveProductTwo(AirtelPlan productplan){
        return airtelPlanRepository.save(productplan);
    }


    public List<AirtelPlan> findAirtelPlanSponsorId(String sponsorid)
    {
        return  airtelPlanRepository.findAirtelPlanSponsorId(sponsorid);
    }
}
