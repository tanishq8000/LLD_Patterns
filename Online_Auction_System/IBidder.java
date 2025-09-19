package Mediator_Design_Pattern.Online_Auction_System;

public interface IBidder {
    String getId();
    void update(double highestBid,String highestBidderId);
    void auctionEnded(double finalBid,String winnerId);
}
