/**
 * Temp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class Temp  implements java.io.Serializable {
    private java.lang.String morningLow;

    private java.lang.String daytimeHigh;

    public Temp() {
    }

    public Temp(
           java.lang.String morningLow,
           java.lang.String daytimeHigh) {
           this.morningLow = morningLow;
           this.daytimeHigh = daytimeHigh;
    }


    /**
     * Gets the morningLow value for this Temp.
     * 
     * @return morningLow
     */
    public java.lang.String getMorningLow() {
        return morningLow;
    }


    /**
     * Sets the morningLow value for this Temp.
     * 
     * @param morningLow
     */
    public void setMorningLow(java.lang.String morningLow) {
        this.morningLow = morningLow;
    }


    /**
     * Gets the daytimeHigh value for this Temp.
     * 
     * @return daytimeHigh
     */
    public java.lang.String getDaytimeHigh() {
        return daytimeHigh;
    }


    /**
     * Sets the daytimeHigh value for this Temp.
     * 
     * @param daytimeHigh
     */
    public void setDaytimeHigh(java.lang.String daytimeHigh) {
        this.daytimeHigh = daytimeHigh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Temp)) return false;
        Temp other = (Temp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.morningLow==null && other.getMorningLow()==null) || 
             (this.morningLow!=null &&
              this.morningLow.equals(other.getMorningLow()))) &&
            ((this.daytimeHigh==null && other.getDaytimeHigh()==null) || 
             (this.daytimeHigh!=null &&
              this.daytimeHigh.equals(other.getDaytimeHigh())));
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
        if (getMorningLow() != null) {
            _hashCode += getMorningLow().hashCode();
        }
        if (getDaytimeHigh() != null) {
            _hashCode += getDaytimeHigh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Temp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "temp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("morningLow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "MorningLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daytimeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "DaytimeHigh"));
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
