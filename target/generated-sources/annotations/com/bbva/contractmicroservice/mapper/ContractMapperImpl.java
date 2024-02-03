package com.bbva.contractmicroservice.mapper;

import com.bbva.contractmicroservice.dto.ContractDTO;
import com.bbva.contractmicroservice.entity.Contract;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-03T18:36:41-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ContractMapperImpl implements ContractMapper {

    @Override
    public ContractDTO toDto(Contract contract) {
        if ( contract == null ) {
            return null;
        }

        ContractDTO contractDTO = new ContractDTO();

        return contractDTO;
    }

    @Override
    public Contract toEntity(ContractDTO contractDTO) {
        if ( contractDTO == null ) {
            return null;
        }

        Contract contract = new Contract();

        return contract;
    }

    @Override
    public List<ContractDTO> toDtoList(List<Contract> contracts) {
        if ( contracts == null ) {
            return null;
        }

        List<ContractDTO> list = new ArrayList<ContractDTO>( contracts.size() );
        for ( Contract contract : contracts ) {
            list.add( toDto( contract ) );
        }

        return list;
    }
}
