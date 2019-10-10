package cn.itcast.gateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping(value = "/fallbackTest")
    public Map<String,String> fallBackController(){
        Map<String,String> response=new HashMap<>();
        response.put("code","502");
        response.put("msg","服务超时");
        return response;
    }
}
