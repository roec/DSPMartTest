package com.dsp.dspmart.controlloer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "[{\"id\":\"1\",\"title\":\"文章标题1\",\"desc\":\"文章简介1\",\"imageUrl\":\"../images/info.png\"},{\"id\":\"2\",\"title\":\"文章标题2\",\"desc\":\"文章简介2\",\"imageUrl\":\"../images/bus_info.png\"}]";
    }

    @GetMapping("/article")
    public String article(@RequestParam("id") String id) {
        if (id.equalsIgnoreCase("1")) {
            return "https://lowcode.cloud.tencent.com/";
        }
        return "https://mp.weixin.qq.com/s/nQJ5NhIl81oRWKWoUZcB6w";
    }
}
