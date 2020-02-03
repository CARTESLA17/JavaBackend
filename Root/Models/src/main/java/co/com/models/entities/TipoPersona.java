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
@Table(name = "TIPO_PERSONA")
public class TipoPersona extends PersistentObject{

	private static final long serialVersionUID = -1450045229146621869L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "tipoPersona")
	private List<Titular> titulares;
	
	public TipoPersona() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}	
	
}
