/**
 * POP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class POP  implements java.io.Serializable {
    private java.lang.String nighttime;

    private java.lang.String daytime;

    public POP() {
    }

    public POP(
           java.lang.String nighttime,
           java.lang.String daytime) {
           this.nighttime = nighttime;
           this.daytime = daytime;
    }


    /**
     * Gets the nighttime value for this POP.
     * 
     * @return nighttime
     */
    public java.lang.String getNighttime() {
        return nighttime;
    }


    /**
     * Sets the nighttime value for this POP.
     * 
     * @param nighttime
     */
    public void setNighttime(java.lang.String nighttime) {
        this.nighttime = nighttime;
    }


    /**
     * Gets the daytime value for this POP.
     * 
     * @return daytime
     */
    public java.lang.String getDaytime() {
        return daytime;
    }


    /**
     * Sets the daytime value for this POP.
     * 
     * @param daytime
     */
    public void setDaytime(java.lang.String daytime) {
        this.daytime = daytime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof POP)) return false;
        POP other = (POP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nighttime==null && other.getNighttime()==null) || 
             (this.nighttime!=null &&
              this.nighttime.equals(other.getNighttime()))) &&
            ((this.daytime==null && other.getDaytime()==null) || 
             (this.daytime!=null &&
              this.daytime.equals(other.getDaytime())));
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
        if (getNighttime() != null) {
            _hashCode += getNighttime().hashCode();
        }
        if (getDaytime() != null) {
            _hashCode += getDaytime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(POP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "POP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nighttime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Nighttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daytime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Daytime"));
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
