package Juanchinify.JuanchiniFy.controller;

import Juanchinify.JuanchiniFy.model.Album;
import Juanchinify.JuanchiniFy.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private AlbumService serviceAlbum;

    @GetMapping("/albums")
    public List<Album> buscarTodos(){
        return serviceAlbum.buscarTodos();
    }

    @PostMapping("/albums")
    public Album guardar(@RequestBody Album album){
        serviceAlbum.guardar(album);
        return album;
    }

    @PutMapping("/albums")
    public Album modificar(@RequestBody Album album){
        serviceAlbum.guardar(album);
        return album;
    }

    @DeleteMapping("/albums/{id}")
    public String borrar(@PathVariable("id") Long id){
        serviceAlbum.borrar(id);
        return "Registro eliminado";
    }
}
