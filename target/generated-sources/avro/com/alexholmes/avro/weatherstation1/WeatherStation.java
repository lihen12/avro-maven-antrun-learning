/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.alexholmes.avro.weatherstation1;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface WeatherStation {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"WeatherStation\",\"namespace\":\"com.alexholmes.avro.weatherstation1\",\"version\":\"1.0.5\",\"types\":[{\"type\":\"record\",\"name\":\"Station\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}],\"messages\":{\"getReading\":{\"request\":[],\"response\":\"string\"}}}");
  java.lang.CharSequence getReading() throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends WeatherStation {
    public static final org.apache.avro.Protocol PROTOCOL = com.alexholmes.avro.weatherstation1.WeatherStation.PROTOCOL;
    void getReading(org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
  }
}