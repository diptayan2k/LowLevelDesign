import com.bidder.service.AuctionService;
import com.bidder.service.SuperBidder;
import com.bidder.service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserService userService = new UserService();
        AuctionService auctionService = new AuctionService();
        SuperBidder superBidder = new SuperBidder(auctionService, userService);

        superBidder.addBuyer("buyer1");
        superBidder.addBuyer("buyer2");
        superBidder.addBuyer("buyer3");
        superBidder.addSeller("seller1");
        superBidder.createAuction("A1", 10, 50, "seller1");
        superBidder.createBid("buyer1", "A1", 17);
        superBidder.createBid("buyer2", "A1", 15);
        superBidder.updateBid("buyer2", "A1", 19);
        superBidder.createBid("buyer3", "A1", 19);
        superBidder.closeAuction("A1");

        System.out.println("---------------------------------------");

        superBidder.addSeller("seller2");
        superBidder.createAuction("A2", 5, 20, "seller2");
        superBidder.createBid("buyer3", "A2", 25);
        superBidder.createBid("buyer2", "A2", 5);
        superBidder.withdrawBid("buyer2", "A2");
        superBidder.closeAuction("A2");


    }
}