package com.example.crud.resources;

import com.example.crud.models.Photo;
import com.example.crud.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/photos")
public class PhotoResource {

    @Autowired
    private PhotoService photoservice;

    @PostMapping
    public Photo addPhoto(@Valid @RequestBody Photo photo){
        return photoservice.addPhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoservice.getAllPhotos();
    }

    @GetMapping("/find")
    public  List<Photo> getPhotoById(@RequestParam(name="id") String id){
        return photoservice.getPhotoById(id);
    }

    @PutMapping
    public void updatePhoto(@RequestBody Photo photo){
        photoservice.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name="id")String id){
        photoservice.deletePhoto(id);
    }
}
