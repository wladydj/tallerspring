package com.prjvsp.prjvsptaller.domain.service;

import com.prjvsp.prjvsptaller.domain.dto.Office;
import com.prjvsp.prjvsptaller.domain.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public List<Office> getAll() { return officeRepository.getAll();}

    public Optional<Office> getOffice(int officeId) { return officeRepository.getOficina(officeId);}
}
