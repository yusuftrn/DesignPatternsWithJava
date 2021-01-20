package creational.factory2;

import creational.factory2.plans.CommercialPlan;
import creational.factory2.plans.DomesticPlan;
import creational.factory2.plans.InstitutionalPlan;
import creational.factory2.plans.Plan;

/**
 *  use getPlan method to get object type of Plan
 */
public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
