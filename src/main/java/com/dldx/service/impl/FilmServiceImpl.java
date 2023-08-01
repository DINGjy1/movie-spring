package com.dldx.service.impl;

import com.dldx.dao.FilmDao;
import com.dldx.pojo.Film;
import com.dldx.service.FilmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Resource
    private FilmDao filmDao ;
    @Override
    public List<Film> getAllFilms() {
        return filmDao.getAllFilms();
    }

    @Override
    public Film getFilmByFilmNo(Integer filmNo) {
        return filmDao.getFilmByFilmNo(filmNo);
    }

    @Override
    public int addFilm(Film film) {
        return filmDao.addFilm(film);
    }

    @Override
    public int updateFilm(Film film) {
        return filmDao.updateFilm(film);
    }

    @Override
    public int deleteFilm(Integer filmNo) {
        return filmDao.deleteFilm(filmNo);
    }
}
