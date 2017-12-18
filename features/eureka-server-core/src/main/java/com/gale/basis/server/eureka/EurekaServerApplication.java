package com.gale.basis.server.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>The infrastructure: The Eureka Server.</p>
 *
 * Created by Yao Gang (thatisgale@gmail.com) on 2017/12/17.
 *
 * @author <a href="mailto:thatisgale AT gmail DOT com">Yao Gang</a>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .web(true).run(args);
    }
}
