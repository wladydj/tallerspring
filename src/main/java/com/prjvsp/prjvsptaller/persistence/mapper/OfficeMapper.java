package com.prjvsp.prjvsptaller.persistence.mapper;

import com.prjvsp.prjvsptaller.domain.dto.Office;
import com.prjvsp.prjvsptaller.persistence.entity.Oficina;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OfficeMapper {
    @Mappings(
            {
                    @Mapping(source = "idOficina", target = "oficinaId"),
                    @Mapping(source = "nameOficina", target = "nombreId"),
                    @Mapping(source = "managerOficina", target = "gestorId"),
                    @Mapping(source = "emailOficina", target = "emailId"),
                    @Mapping(source = "addressOficina", target = "direccionId"),
                    @Mapping(source = "cityOficina", target = "ciudadId"),
                    @Mapping(source = "dptOficina", target = "departamentoId"),
            }
    )
    Office toOffice(Oficina oficina);
    List<Office> toOffices(List<Oficina> oficinas);

    @InheritInverseConfiguration
    Oficina toOficina(Office offices);
}
