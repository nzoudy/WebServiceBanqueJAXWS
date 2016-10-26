
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "conversionEuroFcfa", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionEuroFcfa", namespace = "http://webservice/")
public class Conversion {

    @XmlElement(name = "montant", namespace = "")
    private double montant;

    /**
     * 
     * @return
     *     returns double
     */
    public double getMontant() {
        return this.montant;
    }

    /**
     * 
     * @param montant
     *     the value for the montant property
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }

}
