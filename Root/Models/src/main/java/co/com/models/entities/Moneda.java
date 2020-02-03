package co.com.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MONEDA")
public class Moneda extends PersistentObject{
	
	private static final long serialVersionUID = 8526507519915432499L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "moneda")
	private List<Cuenta> cuenta;
	
	public Moneda() {
		super();		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Cuenta> getCuenta() {
		return cuenta;
	}

	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}

}





		 