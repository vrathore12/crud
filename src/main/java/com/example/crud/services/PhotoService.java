package com.example.crud.services;

import com.example.crud.models.Photo;
import com.example.crud.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    PhotoRepository photoRepository;

    public Photo addPhoto(Photo photo) {
        return photoRepository.save(photo);
    }


    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public List<Photo> getPhotoById(String id) {
        return photoRepository.findAllById(id);
    }

    public void updatePhoto(Photo photo) {
        photoRepository.save(photo);
    }

    public void deletePhoto(String id) {
        photoRepository.deleteById(id);
    }
}
