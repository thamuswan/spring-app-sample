/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.service.di;

import org.springframework.stereotype.Service;

/**
 *
 * @author Thanawat Muangsawang
 */
@Service
public class BatmanService implements SuperHeroService {

    @Override
    public String superHeroLand() {
        return "Batman landing!!";
    }

}
