package ec.com.redepronik.negosys.wsOtros.broadnet.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validacionCuponResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "validacionCuponResult" })
@XmlRootElement(name = "validacionCuponResponse")
public class ValidacionCuponResponse {

	protected String validacionCuponResult;

	/**
	 * Obtiene el valor de la propiedad validacionCuponResult.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidacionCuponResult() {
		return validacionCuponResult;
	}

	/**
	 * Define el valor de la propiedad validacionCuponResult.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidacionCuponResult(String value) {
		this.validacionCuponResult = value;
	}

}
