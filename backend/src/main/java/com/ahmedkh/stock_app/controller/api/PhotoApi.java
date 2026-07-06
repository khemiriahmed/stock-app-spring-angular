package com.ahmedkh.stock_app.controller.api;

import static com.ahmedkh.stock_app.utils.Constants.APP_ROOT;

import com.flickr4java.flickr.FlickrException;

import java.io.IOException;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


@Tag(name = "photos", description = APP_ROOT)
public interface PhotoApi {

    @PostMapping(APP_ROOT + "/save/{id}/{title}/{context}")
    Object savePhoto(@PathVariable("context") String context, @PathVariable("id") Integer id,@RequestPart("file") MultipartFile photo, @PathVariable(
            "title") String title) throws IOException,
            FlickrException;

}