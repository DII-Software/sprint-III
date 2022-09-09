package com.example.sprint3dllSoftware.Servicios;

import com.example.sprint3dllSoftware.entidades.Empresa;

import java.util.List;
import java.util.Map;

public interface ServicioEmpresa {

    public List<Empresa>listarEmpresa();
    Empresa consultarEmpresaPorId(Integer nit);
    public Empresa guardarEmpresa(Empresa empresa);
    public Empresa actualizarPorId(Integer nit, Map<Object, Object> objectMap);
    public void eliminarEmpresa (Integer nit);

}
