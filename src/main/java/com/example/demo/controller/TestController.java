package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: TestController
 * @Description: TODO
 * @author chinyuki
 * @date 2021/02/09
 *
 */
@Controller
public class TestController {

    /**
     * 
     * @Title: testInit
     * @Description: TODO
     * @param @return
     * @return String
     * @throws
     */
    @RequestMapping(value = "/test")
    public String testInit() {
        return "test";
        
    }
}
