/**
 * Forecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class Forecast  implements java.io.Serializable {
    private java.util.Calendar date;

    private short weatherID;

    private java.lang.String desciption;

    private com.cdyne.ws.WeatherWS.Temp temperatures;

    private com.cdyne.ws.WeatherWS.POP probabilityOfPrecipiation;

    public Forecast() {
    }

    public Forecast(
           java.util.Calendar date,
           short weatherID,
           java.lang.String desciption,
           com.cdyne.ws.WeatherWS.Temp temperatures,
           com.cdyne.ws.WeatherWS.POP probabilityOfPrecipiation) {
           this.date = date;
           this.weatherID = weatherID;
           this.desciption = desciption;
           this.temperatures = temperatures;
           this.probabilityOfPrecipiation = probabilityOfPrecipiation;
    }


    /**
     * Gets the date value for this Forecast.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this Forecast.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the weatherID value for this Forecast.
     * 
     * @return weatherID
     */
    public short getWeatherID() {
        return weatherID;
    }


    /**
     * Sets the weatherID value for this Forecast.
     * 
     * @param weatherID
     */
    public void setWeatherID(short weatherID) {
        this.weatherID = weatherID;
    }


    /**
     * Gets the desciption value for this Forecast.
     * 
     * @return desciption
     */
    public java.lang.String getDesciption() {
        return desciption;
    }


    /**
     * Sets the desciption value for this Forecast.
     * 
     * @param desciption
     */
    public void setDesciption(java.lang.String desciption) {
        this.desciption = desciption;
    }


    /**
     * Gets the temperatures value for this Forecast.
     * 
     * @return temperatures
     */
    public com.cdyne.ws.WeatherWS.Temp getTemperatures() {
        return temperatures;
    }


    /**
     * Sets the temperatures value for this Forecast.
     * 
     * @param temperatures
     */
    public void setTemperatures(com.cdyne.ws.WeatherWS.Temp temperatures) {
        this.temperatures = temperatures;
    }


    /**
     * Gets the probabilityOfPrecipiation value for this Forecast.
     * 
     * @return probabilityOfPrecipiation
     */
    public com.cdyne.ws.WeatherWS.POP getProbabilityOfPrecipiation() {
        return probabilityOfPrecipiation;
    }


    /**
     * Sets the probabilityOfPrecipiation value for this Forecast.
     * 
     * @param probabilityOfPrecipiation
     */
    public void setProbabilityOfPrecipiation(com.cdyne.ws.WeatherWS.POP probabilityOfPrecipiation) {
        this.probabilityOfPrecipiation = probabilityOfPrecipiation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Forecast)) return false;
        Forecast other = (Forecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.weatherID == other.getWeatherID() &&
            ((this.desciption==null && other.getDesciption()==null) || 
             (this.desciption!=null &&
              this.desciption.equals(other.getDesciption()))) &&
            ((this.temperatures==null && other.getTemperatures()==null) || 
             (this.temperatures!=null &&
              this.temperatures.equals(other.getTemperatures()))) &&
            ((this.probabilityOfPrecipiation==null && other.getProbabilityOfPrecipiation()==null) || 
             (this.probabilityOfPrecipiation!=null &&
              this.probabilityOfPrecipiation.equals(other.getProbabilityOfPrecipiation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += getWeatherID();
        if (getDesciption() != null) {
            _hashCode += getDesciption().hashCode();
        }
        if (getTemperatures() != null) {
            _hashCode += getTemperatures().hashCode();
        }
        if (getProbabilityOfPrecipiation() != null) {
            _hashCode += getProbabilityOfPrecipiation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Forecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Forecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desciption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Desciption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Temperatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "temp"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probabilityOfPrecipiation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ProbabilityOfPrecipiation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "POP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
