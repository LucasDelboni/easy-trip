/**
 * WeatherReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class WeatherReturn  implements java.io.Serializable {
    private boolean success;

    private java.lang.String responseText;

    private java.lang.String state;

    private java.lang.String city;

    private java.lang.String weatherStationCity;

    private short weatherID;

    private java.lang.String description;

    private java.lang.String temperature;

    private java.lang.String relativeHumidity;

    private java.lang.String wind;

    private java.lang.String pressure;

    private java.lang.String visibility;

    private java.lang.String windChill;

    private java.lang.String remarks;

    public WeatherReturn() {
    }

    public WeatherReturn(
           boolean success,
           java.lang.String responseText,
           java.lang.String state,
           java.lang.String city,
           java.lang.String weatherStationCity,
           short weatherID,
           java.lang.String description,
           java.lang.String temperature,
           java.lang.String relativeHumidity,
           java.lang.String wind,
           java.lang.String pressure,
           java.lang.String visibility,
           java.lang.String windChill,
           java.lang.String remarks) {
           this.success = success;
           this.responseText = responseText;
           this.state = state;
           this.city = city;
           this.weatherStationCity = weatherStationCity;
           this.weatherID = weatherID;
           this.description = description;
           this.temperature = temperature;
           this.relativeHumidity = relativeHumidity;
           this.wind = wind;
           this.pressure = pressure;
           this.visibility = visibility;
           this.windChill = windChill;
           this.remarks = remarks;
    }


    /**
     * Gets the success value for this WeatherReturn.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this WeatherReturn.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the responseText value for this WeatherReturn.
     * 
     * @return responseText
     */
    public java.lang.String getResponseText() {
        return responseText;
    }


    /**
     * Sets the responseText value for this WeatherReturn.
     * 
     * @param responseText
     */
    public void setResponseText(java.lang.String responseText) {
        this.responseText = responseText;
    }


    /**
     * Gets the state value for this WeatherReturn.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this WeatherReturn.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this WeatherReturn.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this WeatherReturn.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the weatherStationCity value for this WeatherReturn.
     * 
     * @return weatherStationCity
     */
    public java.lang.String getWeatherStationCity() {
        return weatherStationCity;
    }


    /**
     * Sets the weatherStationCity value for this WeatherReturn.
     * 
     * @param weatherStationCity
     */
    public void setWeatherStationCity(java.lang.String weatherStationCity) {
        this.weatherStationCity = weatherStationCity;
    }


    /**
     * Gets the weatherID value for this WeatherReturn.
     * 
     * @return weatherID
     */
    public short getWeatherID() {
        return weatherID;
    }


    /**
     * Sets the weatherID value for this WeatherReturn.
     * 
     * @param weatherID
     */
    public void setWeatherID(short weatherID) {
        this.weatherID = weatherID;
    }


    /**
     * Gets the description value for this WeatherReturn.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WeatherReturn.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the temperature value for this WeatherReturn.
     * 
     * @return temperature
     */
    public java.lang.String getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this WeatherReturn.
     * 
     * @param temperature
     */
    public void setTemperature(java.lang.String temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the relativeHumidity value for this WeatherReturn.
     * 
     * @return relativeHumidity
     */
    public java.lang.String getRelativeHumidity() {
        return relativeHumidity;
    }


    /**
     * Sets the relativeHumidity value for this WeatherReturn.
     * 
     * @param relativeHumidity
     */
    public void setRelativeHumidity(java.lang.String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }


    /**
     * Gets the wind value for this WeatherReturn.
     * 
     * @return wind
     */
    public java.lang.String getWind() {
        return wind;
    }


    /**
     * Sets the wind value for this WeatherReturn.
     * 
     * @param wind
     */
    public void setWind(java.lang.String wind) {
        this.wind = wind;
    }


    /**
     * Gets the pressure value for this WeatherReturn.
     * 
     * @return pressure
     */
    public java.lang.String getPressure() {
        return pressure;
    }


    /**
     * Sets the pressure value for this WeatherReturn.
     * 
     * @param pressure
     */
    public void setPressure(java.lang.String pressure) {
        this.pressure = pressure;
    }


    /**
     * Gets the visibility value for this WeatherReturn.
     * 
     * @return visibility
     */
    public java.lang.String getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this WeatherReturn.
     * 
     * @param visibility
     */
    public void setVisibility(java.lang.String visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the windChill value for this WeatherReturn.
     * 
     * @return windChill
     */
    public java.lang.String getWindChill() {
        return windChill;
    }


    /**
     * Sets the windChill value for this WeatherReturn.
     * 
     * @param windChill
     */
    public void setWindChill(java.lang.String windChill) {
        this.windChill = windChill;
    }


    /**
     * Gets the remarks value for this WeatherReturn.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this WeatherReturn.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherReturn)) return false;
        WeatherReturn other = (WeatherReturn) obj;
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
            this.weatherID == other.getWeatherID() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.temperature==null && other.getTemperature()==null) || 
             (this.temperature!=null &&
              this.temperature.equals(other.getTemperature()))) &&
            ((this.relativeHumidity==null && other.getRelativeHumidity()==null) || 
             (this.relativeHumidity!=null &&
              this.relativeHumidity.equals(other.getRelativeHumidity()))) &&
            ((this.wind==null && other.getWind()==null) || 
             (this.wind!=null &&
              this.wind.equals(other.getWind()))) &&
            ((this.pressure==null && other.getPressure()==null) || 
             (this.pressure!=null &&
              this.pressure.equals(other.getPressure()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility()))) &&
            ((this.windChill==null && other.getWindChill()==null) || 
             (this.windChill!=null &&
              this.windChill.equals(other.getWindChill()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        _hashCode += getWeatherID();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTemperature() != null) {
            _hashCode += getTemperature().hashCode();
        }
        if (getRelativeHumidity() != null) {
            _hashCode += getRelativeHumidity().hashCode();
        }
        if (getWind() != null) {
            _hashCode += getWind().hashCode();
        }
        if (getPressure() != null) {
            _hashCode += getPressure().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        if (getWindChill() != null) {
            _hashCode += getWindChill().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeatherReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherReturn"));
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
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Temperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "RelativeHumidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Wind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pressure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Pressure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windChill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WindChill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "Remarks"));
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
