/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller for test.
 *
 * @author Thanawat Muangsawang
 */
@RestController
@RequestMapping("main")
public class MainController {

    @GetMapping("sample-resource")
    public String getSampleResource() {
        return "{ \"firstName\": \"John\", \"lastName\": \"Price\" }";
    }

}
