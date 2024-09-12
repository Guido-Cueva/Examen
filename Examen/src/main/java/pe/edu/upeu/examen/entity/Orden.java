package pe.edu.upeu.examen.entity;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "orden")

public class Orden {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha_orden")
	@Temporal(TemporalType.DATE)
	private Date fecha_orden;	
	@Column(name = "fecha_soli")
	@Temporal(TemporalType.DATE)
	private Date fecha_soli;
	@Column(name = "estado")
	private Date estado;
	
	
	@ManyToOne
	@JoinColumn(name = "tipo_orden_id", nullable = false)
	private Tipo_orden tipo_orden;
	@ManyToOne
	@JoinColumn(name = "foma_pago_id", nullable = false)
	private Forma_pago forma_pago;
	@ManyToOne
	@JoinColumn(name = "almacen_id", nullable = false)
	private Almacen almacen;
	@ManyToOne
	@JoinColumn(name = "proveedor_id", nullable = false)
	private Proveedor proveedor;
	
}
