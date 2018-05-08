package app.controllers;

import app.model.Price;
import app.model.PriceRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PriceController {

    @RequestMapping(value="/api/price", method= RequestMethod.POST)
    @ResponseBody
    String createPrice(@RequestBody PriceRequest request){
        Price createPrice= new Price(request.value, request.auctionTime, request.auctionName);
        return createPrice.toString();
    }

}

