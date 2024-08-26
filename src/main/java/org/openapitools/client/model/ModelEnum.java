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
 * Gets or Sets ModelEnum
 */
@JsonAdapter(ModelEnum.Adapter.class)
public enum ModelEnum {
  
  TENANTS_DOMAIN("authentik_tenants.domain"),
  
  CRYPTO_CERTIFICATEKEYPAIR("authentik_crypto.certificatekeypair"),
  
  FLOWS_FLOW("authentik_flows.flow"),
  
  FLOWS_FLOWSTAGEBINDING("authentik_flows.flowstagebinding"),
  
  OUTPOSTS_DOCKERSERVICECONNECTION("authentik_outposts.dockerserviceconnection"),
  
  OUTPOSTS_KUBERNETESSERVICECONNECTION("authentik_outposts.kubernetesserviceconnection"),
  
  OUTPOSTS_OUTPOST("authentik_outposts.outpost"),
  
  POLICIES_DUMMY_DUMMYPOLICY("authentik_policies_dummy.dummypolicy"),
  
  POLICIES_EVENT_MATCHER_EVENTMATCHERPOLICY("authentik_policies_event_matcher.eventmatcherpolicy"),
  
  POLICIES_EXPIRY_PASSWORDEXPIRYPOLICY("authentik_policies_expiry.passwordexpirypolicy"),
  
  POLICIES_EXPRESSION_EXPRESSIONPOLICY("authentik_policies_expression.expressionpolicy"),
  
  POLICIES_PASSWORD_PASSWORDPOLICY("authentik_policies_password.passwordpolicy"),
  
  POLICIES_REPUTATION_REPUTATIONPOLICY("authentik_policies_reputation.reputationpolicy"),
  
  POLICIES_POLICYBINDING("authentik_policies.policybinding"),
  
  PROVIDERS_LDAP_LDAPPROVIDER("authentik_providers_ldap.ldapprovider"),
  
  PROVIDERS_OAUTH2_SCOPEMAPPING("authentik_providers_oauth2.scopemapping"),
  
  PROVIDERS_OAUTH2_OAUTH2PROVIDER("authentik_providers_oauth2.oauth2provider"),
  
  PROVIDERS_PROXY_PROXYPROVIDER("authentik_providers_proxy.proxyprovider"),
  
  PROVIDERS_RADIUS_RADIUSPROVIDER("authentik_providers_radius.radiusprovider"),
  
  PROVIDERS_SAML_SAMLPROVIDER("authentik_providers_saml.samlprovider"),
  
  PROVIDERS_SAML_SAMLPROPERTYMAPPING("authentik_providers_saml.samlpropertymapping"),
  
  PROVIDERS_SCIM_SCIMPROVIDER("authentik_providers_scim.scimprovider"),
  
  PROVIDERS_SCIM_SCIMMAPPING("authentik_providers_scim.scimmapping"),
  
  RBAC_ROLE("authentik_rbac.role"),
  
  SOURCES_LDAP_LDAPSOURCE("authentik_sources_ldap.ldapsource"),
  
  SOURCES_LDAP_LDAPPROPERTYMAPPING("authentik_sources_ldap.ldappropertymapping"),
  
  SOURCES_OAUTH_OAUTHSOURCE("authentik_sources_oauth.oauthsource"),
  
  SOURCES_OAUTH_USEROAUTHSOURCECONNECTION("authentik_sources_oauth.useroauthsourceconnection"),
  
  SOURCES_PLEX_PLEXSOURCE("authentik_sources_plex.plexsource"),
  
  SOURCES_PLEX_PLEXSOURCECONNECTION("authentik_sources_plex.plexsourceconnection"),
  
  SOURCES_SAML_SAMLSOURCE("authentik_sources_saml.samlsource"),
  
  SOURCES_SAML_USERSAMLSOURCECONNECTION("authentik_sources_saml.usersamlsourceconnection"),
  
  SOURCES_SCIM_SCIMSOURCE("authentik_sources_scim.scimsource"),
  
  STAGES_AUTHENTICATOR_DUO_AUTHENTICATORDUOSTAGE("authentik_stages_authenticator_duo.authenticatorduostage"),
  
  STAGES_AUTHENTICATOR_DUO_DUODEVICE("authentik_stages_authenticator_duo.duodevice"),
  
  STAGES_AUTHENTICATOR_SMS_AUTHENTICATORSMSSTAGE("authentik_stages_authenticator_sms.authenticatorsmsstage"),
  
  STAGES_AUTHENTICATOR_SMS_SMSDEVICE("authentik_stages_authenticator_sms.smsdevice"),
  
  STAGES_AUTHENTICATOR_STATIC_AUTHENTICATORSTATICSTAGE("authentik_stages_authenticator_static.authenticatorstaticstage"),
  
  STAGES_AUTHENTICATOR_STATIC_STATICDEVICE("authentik_stages_authenticator_static.staticdevice"),
  
  STAGES_AUTHENTICATOR_TOTP_AUTHENTICATORTOTPSTAGE("authentik_stages_authenticator_totp.authenticatortotpstage"),
  
  STAGES_AUTHENTICATOR_TOTP_TOTPDEVICE("authentik_stages_authenticator_totp.totpdevice"),
  
  STAGES_AUTHENTICATOR_VALIDATE_AUTHENTICATORVALIDATESTAGE("authentik_stages_authenticator_validate.authenticatorvalidatestage"),
  
  STAGES_AUTHENTICATOR_WEBAUTHN_AUTHENTICATORWEBAUTHNSTAGE("authentik_stages_authenticator_webauthn.authenticatorwebauthnstage"),
  
  STAGES_AUTHENTICATOR_WEBAUTHN_WEBAUTHNDEVICE("authentik_stages_authenticator_webauthn.webauthndevice"),
  
  STAGES_CAPTCHA_CAPTCHASTAGE("authentik_stages_captcha.captchastage"),
  
  STAGES_CONSENT_CONSENTSTAGE("authentik_stages_consent.consentstage"),
  
  STAGES_CONSENT_USERCONSENT("authentik_stages_consent.userconsent"),
  
  STAGES_DENY_DENYSTAGE("authentik_stages_deny.denystage"),
  
  STAGES_DUMMY_DUMMYSTAGE("authentik_stages_dummy.dummystage"),
  
  STAGES_EMAIL_EMAILSTAGE("authentik_stages_email.emailstage"),
  
  STAGES_IDENTIFICATION_IDENTIFICATIONSTAGE("authentik_stages_identification.identificationstage"),
  
  STAGES_INVITATION_INVITATIONSTAGE("authentik_stages_invitation.invitationstage"),
  
  STAGES_INVITATION_INVITATION("authentik_stages_invitation.invitation"),
  
  STAGES_PASSWORD_PASSWORDSTAGE("authentik_stages_password.passwordstage"),
  
  STAGES_PROMPT_PROMPT("authentik_stages_prompt.prompt"),
  
  STAGES_PROMPT_PROMPTSTAGE("authentik_stages_prompt.promptstage"),
  
  STAGES_USER_DELETE_USERDELETESTAGE("authentik_stages_user_delete.userdeletestage"),
  
  STAGES_USER_LOGIN_USERLOGINSTAGE("authentik_stages_user_login.userloginstage"),
  
  STAGES_USER_LOGOUT_USERLOGOUTSTAGE("authentik_stages_user_logout.userlogoutstage"),
  
  STAGES_USER_WRITE_USERWRITESTAGE("authentik_stages_user_write.userwritestage"),
  
  BRANDS_BRAND("authentik_brands.brand"),
  
  BLUEPRINTS_BLUEPRINTINSTANCE("authentik_blueprints.blueprintinstance"),
  
  CORE_GROUP("authentik_core.group"),
  
  CORE_USER("authentik_core.user"),
  
  CORE_APPLICATION("authentik_core.application"),
  
  CORE_TOKEN("authentik_core.token"),
  
  ENTERPRISE_LICENSE("authentik_enterprise.license"),
  
  PROVIDERS_GOOGLE_WORKSPACE_GOOGLEWORKSPACEPROVIDER("authentik_providers_google_workspace.googleworkspaceprovider"),
  
  PROVIDERS_GOOGLE_WORKSPACE_GOOGLEWORKSPACEPROVIDERMAPPING("authentik_providers_google_workspace.googleworkspaceprovidermapping"),
  
  PROVIDERS_MICROSOFT_ENTRA_MICROSOFTENTRAPROVIDER("authentik_providers_microsoft_entra.microsoftentraprovider"),
  
  PROVIDERS_MICROSOFT_ENTRA_MICROSOFTENTRAPROVIDERMAPPING("authentik_providers_microsoft_entra.microsoftentraprovidermapping"),
  
  PROVIDERS_RAC_RACPROVIDER("authentik_providers_rac.racprovider"),
  
  PROVIDERS_RAC_ENDPOINT("authentik_providers_rac.endpoint"),
  
  PROVIDERS_RAC_RACPROPERTYMAPPING("authentik_providers_rac.racpropertymapping"),
  
  STAGES_SOURCE_SOURCESTAGE("authentik_stages_source.sourcestage"),
  
  EVENTS_EVENT("authentik_events.event"),
  
  EVENTS_NOTIFICATIONTRANSPORT("authentik_events.notificationtransport"),
  
  EVENTS_NOTIFICATION("authentik_events.notification"),
  
  EVENTS_NOTIFICATIONRULE("authentik_events.notificationrule"),
  
  EVENTS_NOTIFICATIONWEBHOOKMAPPING("authentik_events.notificationwebhookmapping");

  private String value;

  ModelEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ModelEnum fromValue(String value) {
    for (ModelEnum b : ModelEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ModelEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ModelEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ModelEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ModelEnum.fromValue(value);
  }
}

