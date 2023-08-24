package pri.damai.ribbondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@EnableFeignClients(basePackages = "pri.damai")
@SpringBootApplication
public class RibbonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonDemoApplication.class, args);
    }

    @Resource
    FooRibbonClient fooRibbonClient;

    @GetMapping("/homePage")
    public String homePage() {
        System.out.println("sss");
        return fooRibbonClient.homePage();
    }
}
