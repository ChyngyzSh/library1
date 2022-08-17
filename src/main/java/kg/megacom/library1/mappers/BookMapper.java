package kg.megacom.library1.mappers;

import kg.megacom.library1.models.Book;
import kg.megacom.library1.models.dto.BookDto;

import java.util.List;

public interface BookMapper {
    Book fromDto(BookDto bookDto);
    BookDto toDto(Book book);
    List<Book> fromDtos (List<BookDto>bookDtos);
    List<BookDto>toDtos (List<Book>books);
}
