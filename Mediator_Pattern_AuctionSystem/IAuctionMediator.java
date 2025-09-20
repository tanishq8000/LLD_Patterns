package Mediator_Design_Pattern.Online_Auction_System;

public interface IAuctionMediator {
    void placeBid(double amount,String bidderId);
    void addBidder(IBidder bidder);
    void endAuction();
}
