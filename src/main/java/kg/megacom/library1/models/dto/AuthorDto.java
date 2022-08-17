package kg.megacom.library1.models.dto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class AuthorDto {
    Long id;
    String name;
}
