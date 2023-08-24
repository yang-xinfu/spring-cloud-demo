package pri.damai.ribbondemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author YangXinFu
 * @date 2023/8/23 17:05
 */
@FeignClient(name = "baidu")
public interface FooRibbonClient {

    @GetMapping
    String homePage();

}
