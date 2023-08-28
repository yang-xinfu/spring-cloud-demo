package pri.damai.ribbondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

//    @Resource
//    SpringClientFactory springClientFactory;
    @Resource
    FooRibbonClient fooRibbonClient;
    @GetMapping("/test/{log}")
    public String homePage(@PathVariable String log) {
        return fooRibbonClient.homePage(log);
    }

    @GetMapping("/printLog/{log}")
    public void printLog(@PathVariable String log) {
//        ILoadBalancer loadBalancer = springClientFactory.getLoadBalancer("damai");
//        Server server = loadBalancer.chooseServer(null);
//        System.out.println(server);
    }
}
