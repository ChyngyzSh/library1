package kg.megacom.library1.mappers.impl;

import kg.megacom.library1.mappers.AuthorMapper;
import kg.megacom.library1.models.Author;
import kg.megacom.library1.models.dto.AuthorDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public Author fromDto(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setName(authorDto.getName());
        return author;
    }

    @Override
    public AuthorDto toDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        return authorDto;
    }

    @Override
    public List<Author> fromDtos(List<AuthorDto> authorDtos) {
        List<Author>authors =  new ArrayList<>();
        for (AuthorDto item: authorDtos) {
            Author author =fromDto(item);
            authors.add(author);
        }
        return authors;
    }

    @Override
    public List<AuthorDto> toDtos(List<Author> authors) {
        List<AuthorDto>authorDtos = new ArrayList<>();
        for (Author item:authors) {
            AuthorDto authorDto = toDto(item);
            authorDtos.add(authorDto);
        }
        return authorDtos;
    }
}
