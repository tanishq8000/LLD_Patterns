package Mediator_Design_Pattern.Online_Auction_System;

public class Main {
    public static void main(String[] args) {
        IAuctionMediator auctionMediator = new AuctionMediator();

        IBidder bidder1 = new Bidder("Tanishq",auctionMediator);
        IBidder bidder2 = new Bidder("Niranjan",auctionMediator);
        IBidder bidder3 = new Bidder("Abhinandan",auctionMediator);

        System.out.println("--- Starting the auction ---");
        ((Bidder) bidder1).bid(100.0);
        ((Bidder) bidder2).bid(150.0);
        ((Bidder) bidder3).bid(120.0);
        ((Bidder) bidder1).bid(200.0);

        auctionMediator.endAuction();
    }
}
