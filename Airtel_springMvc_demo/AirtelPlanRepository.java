package com.centurylink.pctl.mod.product.domain.productwo;



import com.centurylink.pctl.mod.product.model.AirtelPlan;
import com.centurylink.pctl.mod.product.model.Details;


import com.centurylink.pctl.mod.product.model.ProductwoFull;
import com.centurylink.pctl.mod.product.model.ProductwoVariants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by begin on 10/04/2016.
 */
@RepositoryRestResource(collectionResourceRel = "airtelplan", path = "airtelplan")
public interface AirtelPlanRepository extends MongoRepository<AirtelPlan, String>{


    @Query(value = "{ 'sponsorId' : ?0 }")
    public List<AirtelPlan>
    findSponserId(String sponsorId);


    @Query(value = "{ 'sponsorId' : ?0 }")
    List<AirtelPlan> findAirtelPlanSponsorId(String full);
}

