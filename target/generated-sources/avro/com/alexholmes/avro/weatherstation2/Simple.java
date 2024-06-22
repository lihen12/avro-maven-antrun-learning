/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.alexholmes.avro.weatherstation2;

@SuppressWarnings("all")
/** Protocol used for testing. */
@org.apache.avro.specific.AvroGenerated
public interface Simple {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Simple\",\"namespace\":\"com.alexholmes.avro.weatherstation2\",\"doc\":\"Protocol used for testing.\",\"version\":\"1.6.2\",\"types\":[{\"type\":\"record\",\"name\":\"WeatherStation\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}],\"messages\":{\"getReading\":{\"doc\":\"Get a weather reading.\",\"request\":[],\"response\":\"string\"}}}");
  /** Get a weather reading. */
  java.lang.CharSequence getReading() throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  /** Protocol used for testing. */
  public interface Callback extends Simple {
    public static final org.apache.avro.Protocol PROTOCOL = com.alexholmes.avro.weatherstation2.Simple.PROTOCOL;
    /** Get a weather reading. */
    void getReading(org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
  }
}