package Visitor_Design_System_RoomOperMang;

import Visitor_Design_System_RoomOperMang.Elements.DeluxeRoom;
import Visitor_Design_System_RoomOperMang.Elements.DoubleRoom;
import Visitor_Design_System_RoomOperMang.Elements.RoomElement;
import Visitor_Design_System_RoomOperMang.Elements.SingleRoom;
import Visitor_Design_System_RoomOperMang.Visitor.RoomMaintainanceVisitor;
import Visitor_Design_System_RoomOperMang.Visitor.RoomPricingVisitor;
import Visitor_Design_System_RoomOperMang.Visitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement deluxeRoomObj = new DeluxeRoom();

        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitorObj);
        System.out.println("Price of Single Room is " + ((SingleRoom)singleRoomObj).price);

        deluxeRoomObj.accept(pricingVisitorObj);
        System.out.println("Price of Deluxe Room is " + ((DeluxeRoom)deluxeRoomObj).price);

        RoomVisitor maintenanceVisitorObj = new RoomMaintainanceVisitor();
        doubleRoomObj.accept(maintenanceVisitorObj);
        deluxeRoomObj.accept(maintenanceVisitorObj);

    }
}
