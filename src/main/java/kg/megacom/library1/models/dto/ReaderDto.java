package kg.megacom.library1.models.dto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.Date;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReaderDto {

    Long id;
    String name;
    String surname;
    String patronymic;
    String library_card;
    String address;
    Date birthday;

}
