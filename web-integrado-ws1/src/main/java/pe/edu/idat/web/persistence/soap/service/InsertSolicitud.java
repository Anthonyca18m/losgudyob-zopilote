
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para insertSolicitud complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://endpoint.view.losgudyob.proyecto.pe/}solicitudRegistroModelRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertSolicitud", propOrder = { "arg0" })
public class InsertSolicitud {

	protected SolicitudRegistroModelRequest arg0;

	/**
	 * Obtiene el valor de la propiedad arg0.
	 * 
	 * @return possible object is {@link SolicitudRegistroModelRequest }
	 * 
	 */
	public SolicitudRegistroModelRequest getArg0() {
		return arg0;
	}

	/**
	 * Define el valor de la propiedad arg0.
	 * 
	 * @param value allowed object is {@link SolicitudRegistroModelRequest }
	 * 
	 */
	public void setArg0(SolicitudRegistroModelRequest value) {
		this.arg0 = value;
	}

}
