package com.nikias.sb.controller;



import com.nikias.sb.service.JewelleryShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.nikias.sb.model.Product;

@RestController
public class JewelleryShopController {
    private static Logger LOGGER = LoggerFactory.getLogger(JewelleryShopController.class);

    private final JewelleryShopService jewelleryShopService;

    @Autowired
    public JewelleryShopController(JewelleryShopService jewelleryShopService) {
        this.jewelleryShopService = jewelleryShopService;
    }

    @RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
    public Product getQuestions(@RequestParam(required = true) String type) {
        LOGGER.info("Discount request fired!");
        Product product = new Product();
        product.setType(type);
        jewelleryShopService.getProductDiscount(product);
        return product;
    }
}