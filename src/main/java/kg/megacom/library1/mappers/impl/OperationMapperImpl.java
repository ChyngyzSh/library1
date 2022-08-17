package kg.megacom.library1.mappers.impl;

import kg.megacom.library1.mappers.BookMapper;
import kg.megacom.library1.mappers.OperationMapper;
import kg.megacom.library1.mappers.ReaderMapper;
import kg.megacom.library1.models.Operation;
import kg.megacom.library1.models.dto.OperationDto;
import kg.megacom.library1.models.dto.ReaderDto;

import java.util.ArrayList;
import java.util.List;

public class OperationMapperImpl implements OperationMapper {
    ReaderMapper readerMapper;
    BookMapper bookMapper;
    @Override
    public Operation fromDto(OperationDto operationDto) {
        Operation operation = new Operation();
        operation.setId(operationDto.getId());
        operation.setStartDate(operationDto.getStartDate());
        operation.setEndDate(operationDto.getEndDate());
        //operation.setReader(fromDto(operationDto).getReader());
        operation.setReader(readerMapper.fromDto(operationDto.getReader()));
        operation.setBook(bookMapper.fromDto(operationDto.getBook()));
        operation.setStatus(operationDto.getStatus());

        return operation;
    }
    @Override
    public OperationDto toDto(Operation operation) {
        OperationDto operationDto = new OperationDto();
        operationDto.setId(operation.getId());
        operationDto.setStartDate(operation.getStartDate());
        operationDto.setEndDate(operation.getEndDate());
        operationDto.setReader(readerMapper.toDto(operation.getReader()));
        operationDto.setBook(bookMapper.toDto(operation.getBook()));
        operationDto.setStatus(operation.getStatus());
        return operationDto;
    }

    @Override
    public List<Operation> fromDtos(List<OperationDto> operationDtos) {
        List<Operation>operations = new ArrayList<>();
        for (OperationDto item: operationDtos) {
            Operation operation = fromDto(item);
            operations.add(operation);
        }
        return operations;
    }

    @Override
    public List<OperationDto> toDtos(List<Operation> operations) {
        List<OperationDto>operationDtos=new ArrayList<>();
        for (Operation item:operations) {
            OperationDto operationDto=toDto(item);
            operationDtos.add(operationDto);
        }
        return operationDtos;
    }
}
