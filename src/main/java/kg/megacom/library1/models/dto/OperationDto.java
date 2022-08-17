package kg.megacom.library1.models.dto;

import kg.megacom.library1.models.OperationStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.Date;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperationDto {

    Long id;
    Date startDate;
    Date endDate;
    ReaderDto reader;
    BookDto book;
    OperationStatus status;
}
