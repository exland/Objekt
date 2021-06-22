package oms;

import java.util.Map;

public class CalculatePrice {


    public double calPrice(Map<BaseRamen, Integer> data)
    {
        double retval = 0;

        for (Map.Entry<BaseRamen, Integer> entry : data.entrySet())
        {
             retval += entry.getKey().getPrice_() * entry.getValue();
        }
        return retval;
    }
}
