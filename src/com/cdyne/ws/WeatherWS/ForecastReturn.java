/**
 * ForecastReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class ForecastReturn  implements java.io.Serializable {
    private boolean success;

    private java.lang.String responseText;

    private java.lang.String state;

    private java.lang.String city;

    private java.lang.String weatherStationCity;

    private com.cdyne.ws.WeatherWS.Forecast[] forecastResult;

    public ForecastReturn() {
    }

    public ForecastReturn(
           boolean success,
           java.lang.String responseText,
           java.lang.String state,
           java.lang.String city,
           java.lang.String weatherStationCity,
           com.cdyne.ws.WeatherWS.Forecast[] forecastResult) {
           this.success = success;
           this.responseText = responseText;
           this.state = state;
           this.city = city;
           this.weatherStationCity = weatherStationCity;
           this.forecastResult = forecastResult;
    }


    /**
     * Gets the success value for this ForecastReturn.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ForecastReturn.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the responseText value for this ForecastReturn.
     * 
     * @return responseText
     */
    public java.lang.String getResponseText() {
        return responseText;
    }


    /**
     * Sets the responseText value for this ForecastReturn.
     * 
     * @param responseText
     */
    public void setResponseText(java.lang.String responseText) {
        this.responseText = responseText;
    }


    /**
     * Gets the state value for this ForecastReturn.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ForecastReturn.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this ForecastReturn.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ForecastReturn.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the weatherStationCity value for this ForecastReturn.
     * 
     * @return weatherStationCity
     */
    public java.lang.String getWeatherStationCity() {
        return weatherStationCity;
    }


    /**
     * Sets the weatherStationCity value for this ForecastReturn.
     * 
     * @param weatherStationCity
     */
    public void setWeatherStationCity(java.lang.String weatherStationCity) {
        this.weatherStationCity = weatherStationCity;
    }


    /**
     * Gets the forecastResult value for this ForecastReturn.
     * 
     * @return forecastResult
     */
    public com.cdyne.ws.WeatherWS.Forecast[] getForecastResult() {
        return forecastResult;
    }


    /**
     * Sets the forecastResult value for this ForecastReturn.
     * 
     * @param forecastResult
     */
    public void setForecastResult(com.cdyne.ws.WeatherWS.Forecast[] forecastResult) {
        this.forecastResult = forecastResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastReturn)) return false;
        ForecastReturn other = (ForecastReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.success == other.isSuccess() &&
            ((this.responseText==null && other.getResponseText()==null) || 
             (this.responseText!=null &&
              this.responseText.equals(other.getResponseText()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.weatherStationCity==null && other.getWeatherStationCity()==null) || 
             (this.weatherStationCity!=null &&
              this.weatherStationCity.equals(other.getWeatherStationCity()))) &&
            ((this.forecastResult==null && other.getForecastResult()==null) || 
             (this.forecastResult!=null &&
              java.util.Arrays.equals(this.forecastResult, other.getForecastResult())));
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
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResponseText() != null) {
            _hashCode += getResponseText().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getWeatherStationCity() != null) {
            _hashCode += getWeatherStationCity().hashCode();
        }
        if (getForecastResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ForecastReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ResponseText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherStationCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherStationCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ForecastResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Forecast"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Forecast"));
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
