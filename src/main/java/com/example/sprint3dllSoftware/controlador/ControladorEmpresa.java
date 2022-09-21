package com.example.sprint3dllSoftware.controlador;

import com.example.sprint3dllSoftware.Servicios.ServicioImpEmployee;
import com.example.sprint3dllSoftware.Servicios.ServicioImpEmpresa;
import com.example.sprint3dllSoftware.entidades.Employee;
import com.example.sprint3dllSoftware.entidades.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/empresa")
@RestController

public class ControladorEmpresa {

    @Autowired
    private ServicioImpEmpresa siee;

    @GetMapping
    public List<Empresa>listar(){
        return siee.listarEmpresa();
    }

    @GetMapping("/{idemp}")
    public Empresa consultar(@PathVariable ("idemp")Integer idemp){
        return siee.consultarEmpresaPorId(idemp);
    }

    @PostMapping public Empresa insertar(@RequestBody Empresa empr){
        return siee.guardarEmpresa(empr);
    }

    @PatchMapping("/{idemp}")
    public Empresa actualizarPorId(@PathVariable("idemp")Integer idemp, @RequestBody Map<Object, Object> objectMap){
        return siee.actualizarPorId(idemp, objectMap);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Empresa empr){
        siee.eliminarEmpresa(empr.getId(empr));
    }
}
