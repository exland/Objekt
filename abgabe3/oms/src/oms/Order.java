package oms;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private double price;
    private Map<BaseRamen, Integer> order_ =  new HashMap<BaseRamen, Integer>();

    public void addAnItem(BaseRamen newitm)
    {
      Boolean isin =   order_.containsKey(newitm);
      if(isin)
      {
         int old_val =  order_.get(newitm);
         int newval =  old_val + 1 ;
          order_.replace(newitm,old_val, newval);
      }
      else
      {
          order_.put(newitm,1);
      }
    }

    public void deleteAnItem(BaseRamen newitm) throws Exception
    {
        Boolean isin =   order_.containsKey(newitm);
        if(isin)
        {
            int old_val =  order_.get(newitm);
            if(old_val == 1)
            {
                order_.remove(newitm);
                return ;
            }
            old_val =  order_.get(newitm);
            int newval =  old_val  - 1 ;
            order_.replace(newitm,old_val, newval);
            return;
        }
       // throw  new Exception("Deleted something that is not in the map");
    }

}
