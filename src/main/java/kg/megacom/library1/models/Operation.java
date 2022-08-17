package kg.megacom.library1.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date startDate;
    Date endDate;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    Reader reader;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

    @Enumerated(value = EnumType.STRING)
    OperationStatus status;
}
