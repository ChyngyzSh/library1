package kg.megacom.library1.mappers.impl;

import kg.megacom.library1.mappers.ReaderMapper;
import kg.megacom.library1.models.Book;
import kg.megacom.library1.models.Reader;
import kg.megacom.library1.models.dto.BookDto;
import kg.megacom.library1.models.dto.ReaderDto;

import java.util.ArrayList;
import java.util.List;

public class ReaderMapperImpl implements ReaderMapper {
    @Override
    public Reader fromDto(ReaderDto readerDto) {
        Reader reader = new Reader();
        reader.setId(readerDto.getId());
        reader.setName(readerDto.getName());
        reader.setSurname(readerDto.getSurname());
        reader.setPatronymic(readerDto.getPatronymic());
        reader.setAddress(readerDto.getAddress());
        reader.setBirthday(readerDto.getBirthday());
        reader.setLibrary_card(readerDto.getLibrary_card());

        return reader;
    }

    @Override
    public ReaderDto toDto(Reader reader) {
        ReaderDto readerDto = new ReaderDto();
        readerDto.setId(reader.getId());
        readerDto.setName(reader.getName());
        readerDto.setSurname(reader.getSurname());
        readerDto.setPatronymic(reader.getPatronymic());
        readerDto.setAddress(reader.getAddress());
        readerDto.setBirthday(reader.getBirthday());
        readerDto.setLibrary_card(reader.getLibrary_card());

        return readerDto;
    }

    @Override
    public List<Reader> fromDtos(List<ReaderDto> readerDtos) {
        List<Reader>readers = new ArrayList<>();
        for (ReaderDto item: readerDtos) {
            Reader reader = fromDto(item);
            readers.add(reader);
        }
        return readers;
    }

    @Override
    public List<ReaderDto> toDtos(List<Reader> readers) {
        List<ReaderDto>readerDtos = new ArrayList<>();
        for (Reader item: readers) {
            ReaderDto readerDto = toDto(item);
            readerDtos.add(readerDto);
        }
        return readerDtos;
    }
}
