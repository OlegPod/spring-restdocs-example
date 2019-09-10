package com.olehpodolin.restdocsexample.web.mappers;

import com.olehpodolin.restdocsexample.domain.Beer;
import com.olehpodolin.restdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
