package com.dldx.dao;

import com.dldx.pojo.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmDao {
    //查所有
    List<Film> getAllFilms();
    //按编号查询
    Film getFilmByFilmNo(Integer filmNo);

    int addFilm(Film film);

    int updateFilm(Film film);

    int deleteFilm(Integer filmNo);
}
