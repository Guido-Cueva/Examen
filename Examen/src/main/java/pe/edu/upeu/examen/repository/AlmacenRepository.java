package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long> {

}
