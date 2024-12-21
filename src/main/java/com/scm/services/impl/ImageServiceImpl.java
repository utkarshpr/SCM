package com.scm.services.impl;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import com.scm.helpers.AppConstants;
import com.scm.services.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private Cloudinary cloudinary;

    @Override
    public String uploadImage(MultipartFile contactImagFile,String filename) {

       // String filename=UUID.randomUUID().toString();

        try {
            byte[] data =new byte[contactImagFile.getInputStream().available()];
            contactImagFile.getInputStream().read(data);
            cloudinary.uploader().upload(data, ObjectUtils.asMap(
                "public_id",filename
            ));
            return getURLFromPublicId(filename);
        } catch (IOException e) {
            
            e.printStackTrace();
            return null;
        }


       
        
    }

    @Override
    public String getURLFromPublicId(String publicId) {
        
        return cloudinary
        .url()
        .transformation(
            new Transformation<>()
            .width(AppConstants.WIDTH).height(AppConstants.HEIGHT).crop(AppConstants.CROP)
        ).generate(publicId);
    }

}
