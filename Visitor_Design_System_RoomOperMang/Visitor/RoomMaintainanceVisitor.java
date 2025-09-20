package Visitor_Design_System_RoomOperMang.Visitor;

import Visitor_Design_System_RoomOperMang.Elements.DeluxeRoom;
import Visitor_Design_System_RoomOperMang.Elements.DoubleRoom;
import Visitor_Design_System_RoomOperMang.Elements.SingleRoom;

public class RoomMaintainanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj){
        System.out.println("Performing maintenance work for Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj){
        System.out.println("Performing maintenance work for Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj){
        System.out.println("Performing maintenance work for Deluxe Room");
    }
}
