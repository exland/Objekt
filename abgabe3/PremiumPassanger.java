package com.company;
import java.util.LinkedList;
import java.util.List;
abstract class Passangers{
}
abstract class PremiumPassanger extends Passangers {
    abstract public void selectSeat();
}
class Economy extends Passangers{
}
class Flex extends PremiumPassanger
{
    @Override
    public void selectSeat() {
    }
}
class Business extends PremiumPassanger
{
    @Override
    public void selectSeat() {
    }
}
class Main {
    public static void main(String[] args)
    {
        // in this list we see how many passangers there are in the plane
        List<Passangers>passList =  new LinkedList<>();
        List<PremiumPassanger>selectSeat = new LinkedList<>();
        passList.add(new Business());
        passList.add(new Economy());
        passList.add(new Flex());
        // we have a list, of which passengers can select their seat
        selectSeat.add(new Business());
        selectSeat.add(new Flex());
        for(PremiumPassanger i : selectSeat)
        {
            i.selectSeat();
        }
    }
}
