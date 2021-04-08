/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Thanawat Muangsawang
 */
@Service
public class MainServiceImpl implements MainService {

    private static final String ROOT_PATH = "home/storage";

    @PostConstruct
    public void init() throws IOException {
        Files.createDirectories(Paths.get(ROOT_PATH));
    }

    @Override
    public void uploadFile(MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()) {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            String fileNameToUse = UUID.randomUUID().toString();

            int lastDotIndex = fileName.lastIndexOf(".");
            if (lastDotIndex != -1) {
                fileNameToUse += fileName.substring(lastDotIndex);
            }

            try (OutputStream os = new FileOutputStream(new File(ROOT_PATH, fileNameToUse), false)) {
                try (InputStream is = file.getInputStream()) {
                    int readByte;
                    byte[] bytes = new byte[8192];
                    while ((readByte = is.read(bytes)) != -1) {
                        os.write(bytes, 0, readByte);
                    }
                }
            }
        }
    }

}
