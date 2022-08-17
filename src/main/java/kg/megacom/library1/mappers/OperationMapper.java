package kg.megacom.library1.mappers;

import kg.megacom.library1.models.Operation;
import kg.megacom.library1.models.dto.OperationDto;

import java.util.List;

public interface OperationMapper {
    Operation fromDto(OperationDto operationDto);
    OperationDto toDto(Operation operation);

    List<Operation>fromDtos(List<OperationDto>operationDtos);
    List<OperationDto>toDtos(List<Operation>operations);


}
