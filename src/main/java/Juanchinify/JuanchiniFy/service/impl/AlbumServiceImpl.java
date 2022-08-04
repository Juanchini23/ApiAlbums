package Juanchinify.JuanchiniFy.service.impl;

import Juanchinify.JuanchiniFy.model.Album;
import Juanchinify.JuanchiniFy.repository.AlbumRepository;
import Juanchinify.JuanchiniFy.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository repoAlbum;

    @Override
    public List<Album> buscarTodos() {
        return repoAlbum.findAll();
    }

    @Override
    public void guardar(Album album) {
        repoAlbum.save(album);
    }

    @Override
    public void borrar(Long idAlbum) {
        repoAlbum.deleteById(idAlbum);
    }
}
