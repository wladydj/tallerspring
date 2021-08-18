package com.prjvsp.prjvsptaller.persistence;

import com.prjvsp.prjvsptaller.domain.dto.Office;
import com.prjvsp.prjvsptaller.domain.repository.OfficeRepository;
import com.prjvsp.prjvsptaller.persistence.crud.OficinaCrudRepository;
import com.prjvsp.prjvsptaller.persistence.entity.Oficina;
import com.prjvsp.prjvsptaller.persistence.mapper.OfficeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OficinaRepository implements OfficeRepository {
    @Autowired
    private OficinaCrudRepository OficinaCrudRepository;
    @Autowired
    private OfficeMapper Mapper;

    @Override
    public List<Office> getAll(){
        List<Oficina> oficinas= (List<Oficina>) OficinaCrudRepository.findAll();
        return Mapper.toOffices(oficinas);
    }

    @Override
    public Optional<Office> getOficina(int IdOficina){
        return OficinaCrudRepository.findById(IdOficina).map(oficina -> Mapper.toOffice(oficina));
    }
}
