package com.prjvsp.prjvsptaller.web.controller;

import com.prjvsp.prjvsptaller.domain.dto.Office;
import com.prjvsp.prjvsptaller.domain.service.OfficeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/offices")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @ApiOperation("Este método entrega el listado completo de las oficinas de atención al ciudadano")
    @GetMapping("/all")
    public List<Office> getAll(){
        return officeService.getAll();
    }

    @ApiOperation("Este método recibe un parametro para entregar la oficina dependiendo del identificador")
    @GetMapping("/{codigo}")
    public Optional<Office> getOffice(@ApiParam(value = "Este parámetro obedece al id de la oficina", required = true, example = "20") @PathVariable("codigo") Integer officeId){
        return officeService.getOffice(officeId);
    }

}
