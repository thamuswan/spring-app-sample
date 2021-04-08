/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import thamuswan.sample.springapp.service.MainService;

/**
 * A controller for test.
 *
 * @author Thanawat Muangsawang
 */
@RestController
@RequestMapping("main")
public class AppMainController {

    private final MainService mainService;

    public AppMainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("sample-resource")
    public String getSampleResource() {
        return "{ \"firstName\": \"John\", \"lastName\": \"Price\" }";
    }

    @PostMapping("simple-upload")
    public void upoad(@RequestParam(name = "file") MultipartFile file) throws IOException {
        mainService.uploadFile(file);
    }

}
