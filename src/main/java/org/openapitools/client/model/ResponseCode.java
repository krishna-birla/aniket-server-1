/*
 * Transaction Service
 * #### Notes  * Allows for the loading of funds to a user's account. * Handles the authorization of a transaction based on a user's balance. * Requires realtime synchronous calculation of balance on request. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The response code sent back to the network for the merchant. Multiple declines reasons may exist but only one will be sent back to the network. Advice messages will include the response code that was sent on our behalf.
 */
@JsonAdapter(ResponseCode.Adapter.class)
public enum ResponseCode {
  
  APPROVED("APPROVED"),
  
  DECLINED("DECLINED");

  private String value;

  ResponseCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseCode fromValue(String value) {
    for (ResponseCode b : ResponseCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResponseCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseCode.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ResponseCode.fromValue(value);
  }
}

