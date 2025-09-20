package Visitor_Design_System_RoomOperMang.Visitor;

import Visitor_Design_System_RoomOperMang.Elements.DeluxeRoom;
import Visitor_Design_System_RoomOperMang.Elements.DoubleRoom;
import Visitor_Design_System_RoomOperMang.Elements.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxeRoom deluxeRoomObj);
}
