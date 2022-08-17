package kg.megacom.library1.mappers;

import kg.megacom.library1.models.Reader;
import kg.megacom.library1.models.dto.ReaderDto;

import java.util.List;

public interface ReaderMapper {
    Reader fromDto(ReaderDto readerDto);
    ReaderDto toDto(Reader reader);
    List<Reader> fromDtos(List<ReaderDto>readerDtos);
    List<ReaderDto>toDtos(List<Reader>readers);

}
