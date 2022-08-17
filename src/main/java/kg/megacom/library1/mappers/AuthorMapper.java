package kg.megacom.library1.mappers;

import kg.megacom.library1.models.Author;
import kg.megacom.library1.models.dto.AuthorDto;

import java.util.List;

public interface AuthorMapper {

    Author fromDto(AuthorDto authorDto);
    AuthorDto toDto(Author author);

    List<Author>fromDtos (List<AuthorDto>authorDtos);

    List<AuthorDto>toDtos (List<Author>authors);
}
