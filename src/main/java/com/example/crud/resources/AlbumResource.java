package com.example.crud.resources;

import com.example.crud.models.Album;
import com.example.crud.services.AlbumService;
import com.example.crud.validations.ValidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album postAlbum(@Valid @RequestBody Album album){
        return albumService.postAlbum(album);
    }

    @GetMapping
    public List<Album> getAll(){
        return albumService.getAll();
    }

    @GetMapping("/find")
    public List<Album> getById(@RequestParam(name="id") String albumId){
        return albumService.getById(albumId);
    }

    @PutMapping
    public void updateAlbum(@RequestBody Album album){
        albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteUSer(String albumId){
        albumService.deleteUSer(albumId);
    }

}
