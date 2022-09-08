package com.example.sprint3dllSoftware.Servicios;

import com.example.sprint3dllSoftware.entidades.Employee;
import com.example.sprint3dllSoftware.repositorio.RepositorioEmployee;
import org.apache.el.util.ReflectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmployee implements ServicioEmployee {

    @Autowired
    private RepositorioEmployee repositorioEmployee;

    @Override
    public Employee guardarEmployee (Employee employee){
        return repositorioEmployee.save(employee);
    }

    @Override
    public Employee consultarEmployeePorId (Integer documento){
        return repositorioEmployee.findById(documento).get();
    }

    @Override
    public Employee actualizarEmployee (Employee employee){
        return repositorioEmployee.save(employee);
    }

    @Override
    public void eliminarEmployee (Integer documento){
        repositorioEmployee.deleteById(documento);

    }

    @Override
    public List<Employee> listarEmployee() {
        return repositorioEmployee.findAll();
    }

    @Override
    public Employee actualizarPorId(Integer doc, Map<Object, Object> objectMap){
        Employee emp=repositorioEmployee.findById(doc).get();
        objectMap.forEach((key, value)->{
            Field field= ReflectionUtils.findField(Employee.class, (String) key);
            field.setAccessible(true);

            ReflectionUtils.setField(field, emp, value);

        });
        return repositorioEmployee.save(emp);
        }

}
