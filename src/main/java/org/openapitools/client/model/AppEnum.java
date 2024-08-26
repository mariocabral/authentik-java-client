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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AppEnum
 */
@JsonAdapter(AppEnum.Adapter.class)
public enum AppEnum {
  
  TENANTS("authentik.tenants"),
  
  ADMIN("authentik.admin"),
  
  API("authentik.api"),
  
  CRYPTO("authentik.crypto"),
  
  FLOWS("authentik.flows"),
  
  OUTPOSTS("authentik.outposts"),
  
  POLICIES_DUMMY("authentik.policies.dummy"),
  
  POLICIES_EVENT_MATCHER("authentik.policies.event_matcher"),
  
  POLICIES_EXPIRY("authentik.policies.expiry"),
  
  POLICIES_EXPRESSION("authentik.policies.expression"),
  
  POLICIES_PASSWORD("authentik.policies.password"),
  
  POLICIES_REPUTATION("authentik.policies.reputation"),
  
  POLICIES("authentik.policies"),
  
  PROVIDERS_LDAP("authentik.providers.ldap"),
  
  PROVIDERS_OAUTH2("authentik.providers.oauth2"),
  
  PROVIDERS_PROXY("authentik.providers.proxy"),
  
  PROVIDERS_RADIUS("authentik.providers.radius"),
  
  PROVIDERS_SAML("authentik.providers.saml"),
  
  PROVIDERS_SCIM("authentik.providers.scim"),
  
  RBAC("authentik.rbac"),
  
  RECOVERY("authentik.recovery"),
  
  SOURCES_LDAP("authentik.sources.ldap"),
  
  SOURCES_OAUTH("authentik.sources.oauth"),
  
  SOURCES_PLEX("authentik.sources.plex"),
  
  SOURCES_SAML("authentik.sources.saml"),
  
  SOURCES_SCIM("authentik.sources.scim"),
  
  STAGES_AUTHENTICATOR("authentik.stages.authenticator"),
  
  STAGES_AUTHENTICATOR_DUO("authentik.stages.authenticator_duo"),
  
  STAGES_AUTHENTICATOR_SMS("authentik.stages.authenticator_sms"),
  
  STAGES_AUTHENTICATOR_STATIC("authentik.stages.authenticator_static"),
  
  STAGES_AUTHENTICATOR_TOTP("authentik.stages.authenticator_totp"),
  
  STAGES_AUTHENTICATOR_VALIDATE("authentik.stages.authenticator_validate"),
  
  STAGES_AUTHENTICATOR_WEBAUTHN("authentik.stages.authenticator_webauthn"),
  
  STAGES_CAPTCHA("authentik.stages.captcha"),
  
  STAGES_CONSENT("authentik.stages.consent"),
  
  STAGES_DENY("authentik.stages.deny"),
  
  STAGES_DUMMY("authentik.stages.dummy"),
  
  STAGES_EMAIL("authentik.stages.email"),
  
  STAGES_IDENTIFICATION("authentik.stages.identification"),
  
  STAGES_INVITATION("authentik.stages.invitation"),
  
  STAGES_PASSWORD("authentik.stages.password"),
  
  STAGES_PROMPT("authentik.stages.prompt"),
  
  STAGES_USER_DELETE("authentik.stages.user_delete"),
  
  STAGES_USER_LOGIN("authentik.stages.user_login"),
  
  STAGES_USER_LOGOUT("authentik.stages.user_logout"),
  
  STAGES_USER_WRITE("authentik.stages.user_write"),
  
  BRANDS("authentik.brands"),
  
  BLUEPRINTS("authentik.blueprints"),
  
  CORE("authentik.core"),
  
  ENTERPRISE("authentik.enterprise"),
  
  ENTERPRISE_AUDIT("authentik.enterprise.audit"),
  
  ENTERPRISE_PROVIDERS_GOOGLE_WORKSPACE("authentik.enterprise.providers.google_workspace"),
  
  ENTERPRISE_PROVIDERS_MICROSOFT_ENTRA("authentik.enterprise.providers.microsoft_entra"),
  
  ENTERPRISE_PROVIDERS_RAC("authentik.enterprise.providers.rac"),
  
  ENTERPRISE_STAGES_SOURCE("authentik.enterprise.stages.source"),
  
  EVENTS("authentik.events");

  private String value;

  AppEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AppEnum fromValue(String value) {
    for (AppEnum b : AppEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AppEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AppEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AppEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AppEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AppEnum.fromValue(value);
  }
}

