package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Debit or Credit flag for the network transaction. A Debit deducts funds from a user. A credit adds funds to a user.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T23:46:54.159924+05:30[Asia/Kolkata]", comments = "Generator version: 7.5.0")
public enum DebitCredit {
  
  DEBIT("DEBIT"),
  
  CREDIT("CREDIT");

  private String value;

  DebitCredit(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DebitCredit fromValue(String value) {
    for (DebitCredit b : DebitCredit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

