package Mediator_Design_Pattern.Online_Auction_System;

public class Bidder implements IBidder{
    private final String id;
    private final IAuctionMediator auctionMediator;

    public Bidder(String id,IAuctionMediator auctionMediator){
        this.id = id;
        this.auctionMediator = auctionMediator;
        this.auctionMediator.addBidder(this);
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public void update(double highestBid,String highestBidderId){
        System.out.println("Bidder - " + id + " notified : The new highest bid is " + highestBid +" placed by Bidder - " + highestBidderId );
    }

    @Override
    public void auctionEnded(double finalBid,String winnerId){
        if(this.id.equals(winnerId)){
            System.out.println("Bidder - " + id + " : Congratulations you won the Auction with a final bid of " + finalBid);
        }
        else{
            System.out.println("Bidder - " + id + " : Auction is over and winner is Bidder - " + winnerId + " with a final bid of " + finalBid );
        }
    }

    public void bid(double amount){
        auctionMediator.placeBid(amount,this.id);
    }
}
