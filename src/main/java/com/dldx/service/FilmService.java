package com.dldx.service;

import com.dldx.pojo.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    Film getFilmByFilmNo(Integer filmNo);

    int addFilm(Film film);

    int updateFilm(Film film);

    int deleteFilm(Integer filmNo);
}
