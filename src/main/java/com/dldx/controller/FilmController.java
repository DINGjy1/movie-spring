package com.dldx.controller;

import com.dldx.pojo.Film;
import com.dldx.service.FilmService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FilmController {
    @Resource
   private FilmService filmService;

    @GetMapping("/film/allfilms")
    public List<Film> getAllFilms(){
        return  filmService.getAllFilms();
    }

    @GetMapping("/film/{filmNo}")
    public Film getOneFilm(@PathVariable  Integer filmNo){
        return filmService.getFilmByFilmNo(filmNo);
    }

    @PutMapping("/film/film")
    public String updateFilm(@RequestBody Film film){
        String msg="Error";
        int num = filmService.updateFilm(film);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }
    @PostMapping("/film/film")
    public String insertFilm(Film film){
        String msg="Erroe";
        int num = filmService.addFilm(film);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @DeleteMapping("/film/{filmNo}")
    public String deleteFilm(@PathVariable Integer filmNo){
        String msg="Error";
        int num = filmService.deleteFilm(filmNo);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }


}
