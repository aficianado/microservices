package com.db.ms.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "user-post-service", url = "localhost:9010")
//@FeignClient(name = "user-post-service")
@FeignClient(name = "zuul-api-gateway-server") //zuul api server
@RibbonClient(name = "user-post-service")
public interface UserPostServiceProxy {

    //@GetMapping("/users")
    @GetMapping("/user-post-service/users") //zuul api
    public List<?> retrieveAllUsers();

}
