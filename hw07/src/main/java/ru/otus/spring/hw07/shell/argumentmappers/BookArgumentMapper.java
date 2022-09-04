package ru.otus.spring.hw07.shell.argumentmappers;

import ru.otus.spring.hw07.domain.Book;

import java.util.List;

public interface BookArgumentMapper {

    Book map(String title, long genreId, List<Long> authorIds);

    Book map(long id, String title, long genreId, List<Long> authorIds);
}
