package pri.damai.ribbondemo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author YangXinFu
 * @date 2023/8/23 17:05
 */
@FeignClient(name = "damai")
public interface FooRibbonClient {

    @GetMapping("/printLog/{log}")
    String homePage(@PathVariable String log);

}
