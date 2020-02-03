package co.com.models.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIMIENTOS")
public class Movimiento extends PersistentObject{
	
	private static final long serialVersionUID = -7383103476452115964L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "importe")
	private Float importe;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cuenta")
	private Cuenta cuenta;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tipoMovimiento")
	private TipoMovimiento  tipoMovimiento;
	
	public Movimiento() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Float getImporte() {
		return importe;
	}
	
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

}
