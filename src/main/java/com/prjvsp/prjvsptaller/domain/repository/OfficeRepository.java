package com.prjvsp.prjvsptaller.domain.repository;

import com.prjvsp.prjvsptaller.domain.dto.Office;

import java.util.List;
import java.util.Optional;

public interface OfficeRepository {
    List<Office> getAll();
    Optional<Office> getOficina(int oficinaId);
}
