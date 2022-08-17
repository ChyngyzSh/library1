package kg.megacom.library1.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Date;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "readers")
public class Reader {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String patronymic;
    String library_card;
    String address;
    Date birthday;
}
