package kg.megacom.library1.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto {
    Long id;
    String title;
    double price;
    List<AuthorDto> authorDtos;
}
