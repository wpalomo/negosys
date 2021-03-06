package ec.com.redepronik.negosys.utils.documentosElectronicos.entityDocumentosElectronicosXML.guiaRemision;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "detalle" })
public class Detalles {
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "detalle", propOrder = { "codigoInterno",
			"codigoAdicional", "descripcion", "cantidad", "detallesAdicionales" })
	public static class Detalle {
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "detAdicional" })
		public static class DetallesAdicionales {
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			public static class DetAdicional {
				@XmlAttribute
				protected String nombre;
				@XmlAttribute
				protected String valor;

				public String getNombre() {
					return this.nombre;
				}

				public String getValor() {
					return this.valor;
				}

				public void setNombre(String value) {
					this.nombre = value;
				}

				public void setValor(String value) {
					this.valor = value;
				}
			}

			protected List<DetAdicional> detAdicional;

			public List<DetAdicional> getDetAdicional() {
				if (this.detAdicional == null) {
					this.detAdicional = new ArrayList<DetAdicional>();
				}
				return this.detAdicional;
			}
		}

		@XmlElement(required = true)
		protected String codigoInterno;
		protected String codigoAdicional;
		@XmlElement(required = true)
		protected String descripcion;
		@XmlElement(required = true)
		protected BigDecimal cantidad;

		protected DetallesAdicionales detallesAdicionales;

		public BigDecimal getCantidad() {
			return this.cantidad;
		}

		public String getCodigoAdicional() {
			return this.codigoAdicional;
		}

		public String getCodigoInterno() {
			return this.codigoInterno;
		}

		public String getDescripcion() {
			return this.descripcion;
		}

		public DetallesAdicionales getDetallesAdicionales() {
			return this.detallesAdicionales;
		}

		public void setCantidad(BigDecimal value) {
			this.cantidad = value;
		}

		public void setCodigoAdicional(String value) {
			this.codigoAdicional = value;
		}

		public void setCodigoInterno(String value) {
			this.codigoInterno = value;
		}

		public void setDescripcion(String value) {
			this.descripcion = value;
		}

		public void setDetallesAdicionales(DetallesAdicionales value) {
			this.detallesAdicionales = value;
		}
	}

	@XmlElement(required = true)
	protected List<Detalle> detalle;

	public List<Detalle> getDetalle() {
		if (this.detalle == null) {
			this.detalle = new ArrayList<Detalle>();
		}
		return this.detalle;
	}
}