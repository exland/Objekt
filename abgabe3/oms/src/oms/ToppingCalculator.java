package oms;

public class ToppingCalculator {

    static public String topping(RamenToppings topping)
    {
        switch (topping)
        {
            case Fish_Cake:
                return "Fish Cake";
            case Roasted_Pork:
                return "Roasted Pork";
            case See_Food:
                return "See Food";
            case Spicy_Ground_Pork:
                return "Spicy Ground Pork";
            default:
                return "Non valid input";
        }

    }
}
