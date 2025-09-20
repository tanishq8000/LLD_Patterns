package Mediator_Design_Pattern.Online_Auction_System;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements IAuctionMediator{
    private final List<IBidder> bidders = new ArrayList<>();
    private double currHighestBid = 0;
    private String currBidderId = null;

    @Override
    public void addBidder(IBidder bidder){
        bidders.add(bidder);
    }
    @Override
    public void placeBid(double amount,String bidderId){
        if(amount <= currHighestBid){
            System.out.println("Bid From " + bidderId + " Failed : Bid amount must be greater than current highest bid amount of " + currHighestBid);
            return;
        }

        System.out.println("Bid Placed by " + bidderId + " of amount " + amount);
        this.currHighestBid = amount;
        this.currBidderId = bidderId;

        for(IBidder bidder : bidders){
            if(!bidder.getId().equals(bidderId)){
                bidder.update(currHighestBid,currBidderId);
            }
        }
    }

    @Override
    public void endAuction(){
        System.out.println("<-------- AUCTION ENDED ---------->");
        for(IBidder bidder:bidders){
            bidder.auctionEnded(currHighestBid,currBidderId);
        }
    }
}
