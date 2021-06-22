package oms;

import java.util.Map;

public class PrintReceipt {

    public void printRect(Map<BaseRamen, Integer> data)
    {
        for (Map.Entry<BaseRamen, Integer> entry : data.entrySet())
            System.out.println("Meal = " + entry.getKey() +
                  entry.getValue() +   "x" );

        System.out.println("The sum is  = " + new CalculatePrice().calPrice(data));
    }

}
