package com.company;

enum PassengerType{Economy, Flex,  Bussines}

class Baggage
{
    public double getBaggageAllowance(PassengerType passengerType)
    {
        switch (passengerType)
        {
            case Flex:
                return 32;
            case Economy:
                return 64;
            case Bussines:
                return 0;
        }
        return -1;
    }
}
public class Passenger {
    private PassengerType passengerType;

    public PassengerType getPassengerType() {
        return passengerType;
    }
    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }
}
