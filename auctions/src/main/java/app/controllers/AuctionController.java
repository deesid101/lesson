package app.controllers;

import app.model.Auction;
import app.model.AuctionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AuctionController {

    @RequestMapping(value="/api/auction", method= RequestMethod.POST)
    @ResponseBody
    String createAuction(@RequestBody AuctionRequest request){
        Auction createdAuction= new Auction(request.startDate, request.endDate, request.name);
        return createdAuction.toString();
    }

}
