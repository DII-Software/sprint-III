package com.example.sprint3dllSoftware.Servicios;

import com.example.sprint3dllSoftware.entidades.Empresa;
import com.example.sprint3dllSoftware.repositorio.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmpresa implements ServicioEmpresa {
    @Autowired
    private RepositorioEmpresa repositorioEmpresa;

    @Override
    public List<Empresa> listarEmpresa() {
        return repositorioEmpresa.findAll();
    }

    @Override
    public Empresa consultarEmpresaPorId(Integer nit) {
        return repositorioEmpresa.findById(nit).get();
    }

    @Override
    public Empresa guardarEmpresa(Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }

    @Override
    public Empresa actualizarPorId(Integer nit, Map<Object, Object> objectMap) {
        Empresa empr=repositorioEmpresa.findById(nit).get();
        objectMap.forEach((key, value)->{
            Field field= ReflectionUtils.findField(Empresa.class, (String) key);
            field.setAccessible(true);

            ReflectionUtils.setField(field, empr, value);
        });
        return repositorioEmpresa.save(empr);
    }


    @Override
    public void eliminarEmpresa(Integer nit) {
        repositorioEmpresa.deleteById(nit);

    }
}
