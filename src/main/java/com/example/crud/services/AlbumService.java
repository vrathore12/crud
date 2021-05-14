package com.example.crud.services;
import com.example.crud.models.Album;
import com.example.crud.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album postAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    public List<Album> getById(String albumId) {
        return albumRepository.findAllById(albumId);
    }

    public void updateAlbum(Album album) {
        albumRepository.save(album);
    }

    public void deleteUSer(String albumId) {
        albumRepository.deleteById(albumId);
    }
}
