package com.llocr.midterm.controller;

import com.llocr.midterm.model.ClientDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


@Controller
public class ApplicationController {

    @PostMapping("application")
    public String application(@ModelAttribute("client") ClientDTO client, @RequestParam("consentFile") MultipartFile file, Model model) {
        if (!file.isEmpty()) {
            String root = "src/main/resources/static";
            String filePath = root + "/uploadFiles";
            File dir = new File(filePath);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            String originFileName = file.getOriginalFilename();
            String ext = originFileName.substring(originFileName.lastIndexOf("."));
            String savedName = "[" + client.getName() + "]님_상담신청서" + ext;

            try {
                file.transferTo(new File(filePath + "/" + savedName));
                model.addAttribute("fileUploadCheck", "성공");
            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("fileUploadCheck", "실패");
            }
        } else {
            model.addAttribute("fileUploadCheck", "파일이 선택되지 않았습니다.");
        }

        return "result";
    }
}
