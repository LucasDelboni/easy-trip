/**
 * WeatherDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class WeatherDescription  implements java.io.Serializable {
    private short weatherID;

    private java.lang.String description;

    private java.lang.String pictureURL;

    public WeatherDescription() {
    }

    public WeatherDescription(
           short weatherID,
           java.lang.String description,
           java.lang.String pictureURL) {
           this.weatherID = weatherID;
           this.description = description;
           this.pictureURL = pictureURL;
    }


    /**
     * Gets the weatherID value for this WeatherDescription.
     * 
     * @return weatherID
     */
    public short getWeatherID() {
        return weatherID;
    }


    /**
     * Sets the weatherID value for this WeatherDescription.
     * 
     * @param weatherID
     */
    public void setWeatherID(short weatherID) {
        this.weatherID = weatherID;
    }


    /**
     * Gets the description value for this WeatherDescription.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WeatherDescription.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the pictureURL value for this WeatherDescription.
     * 
     * @return pictureURL
     */
    public java.lang.String getPictureURL() {
        return pictureURL;
    }


    /**
     * Sets the pictureURL value for this WeatherDescription.
     * 
     * @param pictureURL
     */
    public void setPictureURL(java.lang.String pictureURL) {
        this.pictureURL = pictureURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherDescription)) return false;
        WeatherDescription other = (WeatherDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.weatherID == other.getWeatherID() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.pictureURL==null && other.getPictureURL()==null) || 
             (this.pictureURL!=null &&
              this.pictureURL.equals(other.getPictureURL())));
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
        _hashCode += getWeatherID();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPictureURL() != null) {
            _hashCode += getPictureURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeatherDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "PictureURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
