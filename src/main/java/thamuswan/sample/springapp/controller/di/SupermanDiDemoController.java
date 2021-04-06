/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.controller.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thamuswan.sample.springapp.service.SuperHeroService;

/**
 *
 * @author Thanawat Muangsawang
 */
@RestController
@RequestMapping("superman")
public class SupermanDiDemoController {

    private final SuperHeroService superHeroService;

    public SupermanDiDemoController(@Qualifier("supermanService") SuperHeroService superHeroService) {
        this.superHeroService = superHeroService;
    }

    @GetMapping("act")
    public String act() {
        return this.superHeroService.superHeroLand();
    }

}
