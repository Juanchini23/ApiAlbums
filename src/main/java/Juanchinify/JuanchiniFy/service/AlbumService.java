package Juanchinify.JuanchiniFy.service;

import Juanchinify.JuanchiniFy.model.Album;

import java.util.List;

public interface AlbumService {

    List<Album> buscarTodos();
    void guardar(Album album);

    void borrar(Long idAlbum);
}
