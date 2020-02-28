package es.keytree.klockin.app1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class AppConfigurator {

    @Value("${company.name}")
    private String companyName;

    public String getCompanyName(){
        return companyName;
    }
}
