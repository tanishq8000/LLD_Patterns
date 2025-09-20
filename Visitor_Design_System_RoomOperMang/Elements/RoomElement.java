package Visitor_Design_System_RoomOperMang.Elements;

import Visitor_Design_System_RoomOperMang.Visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
