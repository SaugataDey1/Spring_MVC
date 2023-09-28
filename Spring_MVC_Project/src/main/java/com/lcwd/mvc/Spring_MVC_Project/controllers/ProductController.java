package com.lcwd.mvc.Spring_MVC_Project.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    /*
        @GetMapping("/getProduct")
        public String getProduct(
                @RequestParam("productName") String name,
                @RequestParam(value = "ProductRating", defaultValue = "0", required = false) int rating,
                @RequestParam("productId") int Id)
        {
            System.out.println("productName : " + name );
            System.out.println("productId : " + Id);
            System.out.println("ProductRating : " + rating);

            return "This is Testing Product URL";
        }
    */


  //  @GetMapping("/getProduct")
    @RequestMapping("/checkProduct/{productName}/{productId}/{ProductRating}")
    public String checkProduct(
            @PathVariable("productId") int id,
            @PathVariable String productName,
            @PathVariable int ProductRating
    )
    {
        System.out.println("ProductName : " + productName);
        System.out.println("ProductID : " + id);
        System.out.println("Product Rating : " + ProductRating);

        logger.error("ProductName {} {}" , productName, "Testing Argument");
        logger.warn("ProductId {}", id);
        logger.info("Product Rating {}", ProductRating);
        logger.debug("This is Testing for Debug");


        return "this is checking the concept of path variable";

    }






}
