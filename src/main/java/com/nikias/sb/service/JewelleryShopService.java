package com.nikias.sb.service;


import com.nikias.sb.model.Product;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JewelleryShopService {

    private final KieContainer kieContainer;

    @Autowired
    public JewelleryShopService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Product getProductDiscount(Product product) {
        //get the stateful session
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession();
        kieSession.execute(product);
        return product;
    }
}