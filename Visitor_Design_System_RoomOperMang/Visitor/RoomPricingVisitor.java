package Visitor_Design_System_RoomOperMang.Visitor;

import Visitor_Design_System_RoomOperMang.Elements.DeluxeRoom;
import Visitor_Design_System_RoomOperMang.Elements.DoubleRoom;
import Visitor_Design_System_RoomOperMang.Elements.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj){
        System.out.println("Pricing calculation logic of Single Room");
        singleRoomObj.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj){
        System.out.println("Pricing calculation logic of Double Room");
        doubleRoomObj.price = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj){
        System.out.println("Price calculation logic of Deluxe Room");
        deluxeRoomObj.price = 5000;
    }
}
