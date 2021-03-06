package ec.com.redepronik.negosys.invfac.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ec.com.redepronik.negosys.rrhh.entity.Cliente;
import ec.com.redepronik.negosys.rrhh.entity.EmpleadoCargo;

@Entity
@Table(name = "cotizaciones")
public class Cotizacion implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Cliente cliente;
	private EmpleadoCargo vendedor;
	private EmpleadoCargo cajero;
	private Timestamp fecha;
	private Boolean activo;
	private String establecimiento;
	private String puntoEmision;
	private String secuencia;
	private List<DetalleCotizacion> detalleCotizacion;

	public Cotizacion() {
	}

	public Cotizacion(Integer id, Cliente cliente, EmpleadoCargo vendedor,
			EmpleadoCargo cajero, Timestamp fecha, Boolean activo,
			String establecimiento, String puntoEmision, String secuencia,
			List<DetalleCotizacion> detalleCotizacion) {
		this.id = id;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.cajero = cajero;
		this.fecha = fecha;
		this.activo = activo;
		this.establecimiento = establecimiento;
		this.puntoEmision = puntoEmision;
		this.secuencia = secuencia;
		this.detalleCotizacion = detalleCotizacion;
	}

	public DetalleCotizacion addDetalleCotizacion(
			DetalleCotizacion detalleCotizacion) {
		getDetalleCotizacion().add(detalleCotizacion);
		detalleCotizacion.setCotizacion(this);

		return detalleCotizacion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotizacion other = (Cotizacion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Column(nullable = false)
	public Boolean getActivo() {
		return activo;
	}

	@ManyToOne
	@JoinColumn(name = "cajeroid")
	public EmpleadoCargo getCajero() {
		return cajero;
	}

	@ManyToOne
	@JoinColumn(name = "clienteid")
	public Cliente getCliente() {
		return cliente;
	}

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "cotizacion")
	// @IndexColumn(name = "orden", base = 1)
	public List<DetalleCotizacion> getDetalleCotizacion() {
		return detalleCotizacion;
	}

	@Column(length = 3, nullable = false)
	public String getEstablecimiento() {
		return establecimiento;
	}

	@Column(nullable = false)
	public Timestamp getFecha() {
		return fecha;
	}

	@Id
	@SequenceGenerator(allocationSize = 1, name = "COTIZACIONES_COTIZACIONID_GENERATOR", sequenceName = "COTIZACIONES_COTIZACIONID_SEQ")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COTIZACIONES_COTIZACIONID_GENERATOR")
	@Column(name = "cotizacionid", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@Column(name = "puntoemision", length = 3, nullable = false)
	public String getPuntoEmision() {
		return puntoEmision;
	}

	@Column(length = 9, nullable = false)
	public String getSecuencia() {
		return secuencia;
	}

	@ManyToOne
	@JoinColumn(name = "vendedorid")
	public EmpleadoCargo getVendedor() {
		return vendedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public DetalleCotizacion removeDetalleCotizacion(
			DetalleCotizacion detalleCotizacion) {
		getDetalleCotizacion().remove(detalleCotizacion);
		detalleCotizacion.setCotizacion(null);

		return detalleCotizacion;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public void setCajero(EmpleadoCargo cajero) {
		this.cajero = cajero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDetalleCotizacion(List<DetalleCotizacion> detalleCotizacion) {
		this.detalleCotizacion = detalleCotizacion;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPuntoEmision(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	public void setSecuencia(String secuencia) {
		this.secuencia = secuencia;
	}

	public void setVendedor(EmpleadoCargo vendedor) {
		this.vendedor = vendedor;
	}

}