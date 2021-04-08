/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.service;

import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Thanawat Muangsawang
 */
public interface MainService {

    public void uploadFile(MultipartFile file) throws IOException;

}
