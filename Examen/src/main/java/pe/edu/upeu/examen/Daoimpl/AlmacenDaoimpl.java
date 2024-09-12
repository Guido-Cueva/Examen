package pe.edu.upeu.examen.Daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import pe.edu.upeu.examen.dao.AlmacenDao;
import pe.edu.upeu.examen.entity.Almacen;
@Component
public class AlmacenDaoimpl implements AlmacenDao {

	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
