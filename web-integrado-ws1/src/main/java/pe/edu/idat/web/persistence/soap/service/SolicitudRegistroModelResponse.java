
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para solicitudRegistroModelResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudRegistroModelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudRegistroModelResponse", propOrder = { "codigoRespuesta", "respuesta", "descripcionServicio" })
public class SolicitudRegistroModelResponse {

	protected String codigoRespuesta;
	protected String respuesta;
	protected String descripcionServicio;

	/**
	 * Obtiene el valor de la propiedad codigoRespuesta.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	/**
	 * Define el valor de la propiedad codigoRespuesta.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCodigoRespuesta(String value) {
		this.codigoRespuesta = value;
	}

	/**
	 * Obtiene el valor de la propiedad respuesta.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * Define el valor de la propiedad respuesta.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRespuesta(String value) {
		this.respuesta = value;
	}

	/**
	 * Obtiene el valor de la propiedad descripcionServicio.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescripcionServicio() {
		return descripcionServicio;
	}

	/**
	 * Define el valor de la propiedad descripcionServicio.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDescripcionServicio(String value) {
		this.descripcionServicio = value;
	}

}
