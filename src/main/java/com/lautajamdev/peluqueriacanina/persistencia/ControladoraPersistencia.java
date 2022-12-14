
package com.lautajamdev.peluqueriacanina.persistencia;

import com.lautajamdev.peluqueriacanina.logica.Duenio;
import com.lautajamdev.peluqueriacanina.logica.Mascota;
import java.util.List;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascoJPA = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //  Crear en la BD el duenio
        duenioJPA.create(duenio);

        //  Crear en la BD la mascota
        mascoJPA.create(masco);
    }

    public List<Mascota> traerMascotas() {
        return mascoJPA.findMascotaEntities();
    }
    
}
