/*
 * authentik
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2024.6.3
 * Contact: hello@goauthentik.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * KubernetesServiceConnection Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedKubernetesServiceConnectionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local;

  public static final String SERIALIZED_NAME_KUBECONFIG = "kubeconfig";
  @SerializedName(SERIALIZED_NAME_KUBECONFIG)
  private Object kubeconfig = null;

  public static final String SERIALIZED_NAME_VERIFY_SSL = "verify_ssl";
  @SerializedName(SERIALIZED_NAME_VERIFY_SSL)
  private Boolean verifySsl;

  public PatchedKubernetesServiceConnectionRequest() {
  }

  public PatchedKubernetesServiceConnectionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PatchedKubernetesServiceConnectionRequest local(Boolean local) {
    this.local = local;
    return this;
  }

  /**
   * If enabled, use the local connection. Required Docker socket/Kubernetes Integration
   * @return local
   */
  @javax.annotation.Nullable
  public Boolean getLocal() {
    return local;
  }

  public void setLocal(Boolean local) {
    this.local = local;
  }


  public PatchedKubernetesServiceConnectionRequest kubeconfig(Object kubeconfig) {
    this.kubeconfig = kubeconfig;
    return this;
  }

  /**
   * Paste your kubeconfig here. authentik will automatically use the currently selected context.
   * @return kubeconfig
   */
  @javax.annotation.Nullable
  public Object getKubeconfig() {
    return kubeconfig;
  }

  public void setKubeconfig(Object kubeconfig) {
    this.kubeconfig = kubeconfig;
  }


  public PatchedKubernetesServiceConnectionRequest verifySsl(Boolean verifySsl) {
    this.verifySsl = verifySsl;
    return this;
  }

  /**
   * Verify SSL Certificates of the Kubernetes API endpoint
   * @return verifySsl
   */
  @javax.annotation.Nullable
  public Boolean getVerifySsl() {
    return verifySsl;
  }

  public void setVerifySsl(Boolean verifySsl) {
    this.verifySsl = verifySsl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedKubernetesServiceConnectionRequest patchedKubernetesServiceConnectionRequest = (PatchedKubernetesServiceConnectionRequest) o;
    return Objects.equals(this.name, patchedKubernetesServiceConnectionRequest.name) &&
        Objects.equals(this.local, patchedKubernetesServiceConnectionRequest.local) &&
        Objects.equals(this.kubeconfig, patchedKubernetesServiceConnectionRequest.kubeconfig) &&
        Objects.equals(this.verifySsl, patchedKubernetesServiceConnectionRequest.verifySsl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, local, kubeconfig, verifySsl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchedKubernetesServiceConnectionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    kubeconfig: ").append(toIndentedString(kubeconfig)).append("\n");
    sb.append("    verifySsl: ").append(toIndentedString(verifySsl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("local");
    openapiFields.add("kubeconfig");
    openapiFields.add("verify_ssl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedKubernetesServiceConnectionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedKubernetesServiceConnectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedKubernetesServiceConnectionRequest is not found in the empty JSON string", PatchedKubernetesServiceConnectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedKubernetesServiceConnectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedKubernetesServiceConnectionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedKubernetesServiceConnectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedKubernetesServiceConnectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedKubernetesServiceConnectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedKubernetesServiceConnectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedKubernetesServiceConnectionRequest>() {
           @Override
           public void write(JsonWriter out, PatchedKubernetesServiceConnectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedKubernetesServiceConnectionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedKubernetesServiceConnectionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedKubernetesServiceConnectionRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedKubernetesServiceConnectionRequest
   */
  public static PatchedKubernetesServiceConnectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedKubernetesServiceConnectionRequest.class);
  }

  /**
   * Convert an instance of PatchedKubernetesServiceConnectionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

