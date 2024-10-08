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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.GoogleWorkspaceProviderMapping;
import org.openapitools.client.model.GoogleWorkspaceProviderMappingRequest;
import org.openapitools.client.model.LDAPPropertyMapping;
import org.openapitools.client.model.LDAPPropertyMappingRequest;
import org.openapitools.client.model.MicrosoftEntraProviderMapping;
import org.openapitools.client.model.MicrosoftEntraProviderMappingRequest;
import org.openapitools.client.model.NotificationWebhookMapping;
import org.openapitools.client.model.NotificationWebhookMappingRequest;
import org.openapitools.client.model.PaginatedGoogleWorkspaceProviderMappingList;
import org.openapitools.client.model.PaginatedLDAPPropertyMappingList;
import org.openapitools.client.model.PaginatedMicrosoftEntraProviderMappingList;
import org.openapitools.client.model.PaginatedNotificationWebhookMappingList;
import org.openapitools.client.model.PaginatedPropertyMappingList;
import org.openapitools.client.model.PaginatedRACPropertyMappingList;
import org.openapitools.client.model.PaginatedSAMLPropertyMappingList;
import org.openapitools.client.model.PaginatedSCIMMappingList;
import org.openapitools.client.model.PaginatedScopeMappingList;
import org.openapitools.client.model.PatchedGoogleWorkspaceProviderMappingRequest;
import org.openapitools.client.model.PatchedLDAPPropertyMappingRequest;
import org.openapitools.client.model.PatchedMicrosoftEntraProviderMappingRequest;
import org.openapitools.client.model.PatchedNotificationWebhookMappingRequest;
import org.openapitools.client.model.PatchedRACPropertyMappingRequest;
import org.openapitools.client.model.PatchedSAMLPropertyMappingRequest;
import org.openapitools.client.model.PatchedSCIMMappingRequest;
import org.openapitools.client.model.PatchedScopeMappingRequest;
import org.openapitools.client.model.PropertyMapping;
import org.openapitools.client.model.PropertyMappingTestRequest;
import org.openapitools.client.model.PropertyMappingTestResult;
import org.openapitools.client.model.RACPropertyMapping;
import org.openapitools.client.model.RACPropertyMappingRequest;
import org.openapitools.client.model.SAMLPropertyMapping;
import org.openapitools.client.model.SAMLPropertyMappingRequest;
import org.openapitools.client.model.SCIMMapping;
import org.openapitools.client.model.SCIMMappingRequest;
import org.openapitools.client.model.ScopeMapping;
import org.openapitools.client.model.ScopeMappingRequest;
import org.openapitools.client.model.TypeCreate;
import java.util.UUID;
import org.openapitools.client.model.UsedBy;
import org.openapitools.client.model.ValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PropertymappingsApi
 */
@Disabled
public class PropertymappingsApiTest {

    private final PropertymappingsApi api = new PropertymappingsApi();

    /**
     * PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsAllDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllListTest() throws ApiException {
        Boolean managedIsnull = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedPropertyMappingList response = api.propertymappingsAllList(managedIsnull, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        PropertyMapping response = api.propertymappingsAllRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * Test Property Mapping
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllTestCreateTest() throws ApiException {
        UUID pmUuid = null;
        Boolean formatResult = null;
        PropertyMappingTestRequest propertyMappingTestRequest = null;
        PropertyMappingTestResult response = api.propertymappingsAllTestCreate(pmUuid, formatResult, propertyMappingTestRequest);
        // TODO: test validations
    }

    /**
     * Get all creatable types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllTypesListTest() throws ApiException {
        List<TypeCreate> response = api.propertymappingsAllTypesList();
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsAllUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsAllUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapCreateTest() throws ApiException {
        LDAPPropertyMappingRequest ldAPPropertyMappingRequest = null;
        LDAPPropertyMapping response = api.propertymappingsLdapCreate(ldAPPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsLdapDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapListTest() throws ApiException {
        String expression = null;
        List<String> managed = null;
        String name = null;
        String objectField = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID pmUuid = null;
        String search = null;
        PaginatedLDAPPropertyMappingList response = api.propertymappingsLdapList(expression, managed, name, objectField, ordering, page, pageSize, pmUuid, search);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedLDAPPropertyMappingRequest patchedLDAPPropertyMappingRequest = null;
        LDAPPropertyMapping response = api.propertymappingsLdapPartialUpdate(pmUuid, patchedLDAPPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        LDAPPropertyMapping response = api.propertymappingsLdapRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * LDAP PropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapUpdateTest() throws ApiException {
        UUID pmUuid = null;
        LDAPPropertyMappingRequest ldAPPropertyMappingRequest = null;
        LDAPPropertyMapping response = api.propertymappingsLdapUpdate(pmUuid, ldAPPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsLdapUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsLdapUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationCreateTest() throws ApiException {
        NotificationWebhookMappingRequest notificationWebhookMappingRequest = null;
        NotificationWebhookMapping response = api.propertymappingsNotificationCreate(notificationWebhookMappingRequest);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsNotificationDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedNotificationWebhookMappingList response = api.propertymappingsNotificationList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedNotificationWebhookMappingRequest patchedNotificationWebhookMappingRequest = null;
        NotificationWebhookMapping response = api.propertymappingsNotificationPartialUpdate(pmUuid, patchedNotificationWebhookMappingRequest);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        NotificationWebhookMapping response = api.propertymappingsNotificationRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * NotificationWebhookMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationUpdateTest() throws ApiException {
        UUID pmUuid = null;
        NotificationWebhookMappingRequest notificationWebhookMappingRequest = null;
        NotificationWebhookMapping response = api.propertymappingsNotificationUpdate(pmUuid, notificationWebhookMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsNotificationUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsNotificationUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceCreateTest() throws ApiException {
        GoogleWorkspaceProviderMappingRequest googleWorkspaceProviderMappingRequest = null;
        GoogleWorkspaceProviderMapping response = api.propertymappingsProviderGoogleWorkspaceCreate(googleWorkspaceProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsProviderGoogleWorkspaceDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceListTest() throws ApiException {
        String expression = null;
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID pmUuid = null;
        String search = null;
        PaginatedGoogleWorkspaceProviderMappingList response = api.propertymappingsProviderGoogleWorkspaceList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspacePartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedGoogleWorkspaceProviderMappingRequest patchedGoogleWorkspaceProviderMappingRequest = null;
        GoogleWorkspaceProviderMapping response = api.propertymappingsProviderGoogleWorkspacePartialUpdate(pmUuid, patchedGoogleWorkspaceProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        GoogleWorkspaceProviderMapping response = api.propertymappingsProviderGoogleWorkspaceRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * GoogleWorkspaceProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceUpdateTest() throws ApiException {
        UUID pmUuid = null;
        GoogleWorkspaceProviderMappingRequest googleWorkspaceProviderMappingRequest = null;
        GoogleWorkspaceProviderMapping response = api.propertymappingsProviderGoogleWorkspaceUpdate(pmUuid, googleWorkspaceProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderGoogleWorkspaceUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsProviderGoogleWorkspaceUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraCreateTest() throws ApiException {
        MicrosoftEntraProviderMappingRequest microsoftEntraProviderMappingRequest = null;
        MicrosoftEntraProviderMapping response = api.propertymappingsProviderMicrosoftEntraCreate(microsoftEntraProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsProviderMicrosoftEntraDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraListTest() throws ApiException {
        String expression = null;
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID pmUuid = null;
        String search = null;
        PaginatedMicrosoftEntraProviderMappingList response = api.propertymappingsProviderMicrosoftEntraList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedMicrosoftEntraProviderMappingRequest patchedMicrosoftEntraProviderMappingRequest = null;
        MicrosoftEntraProviderMapping response = api.propertymappingsProviderMicrosoftEntraPartialUpdate(pmUuid, patchedMicrosoftEntraProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        MicrosoftEntraProviderMapping response = api.propertymappingsProviderMicrosoftEntraRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * MicrosoftEntraProviderMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraUpdateTest() throws ApiException {
        UUID pmUuid = null;
        MicrosoftEntraProviderMappingRequest microsoftEntraProviderMappingRequest = null;
        MicrosoftEntraProviderMapping response = api.propertymappingsProviderMicrosoftEntraUpdate(pmUuid, microsoftEntraProviderMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsProviderMicrosoftEntraUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsProviderMicrosoftEntraUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacCreateTest() throws ApiException {
        RACPropertyMappingRequest raCPropertyMappingRequest = null;
        RACPropertyMapping response = api.propertymappingsRacCreate(raCPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsRacDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacListTest() throws ApiException {
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedRACPropertyMappingList response = api.propertymappingsRacList(managed, name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedRACPropertyMappingRequest patchedRACPropertyMappingRequest = null;
        RACPropertyMapping response = api.propertymappingsRacPartialUpdate(pmUuid, patchedRACPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        RACPropertyMapping response = api.propertymappingsRacRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * RACPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacUpdateTest() throws ApiException {
        UUID pmUuid = null;
        RACPropertyMappingRequest raCPropertyMappingRequest = null;
        RACPropertyMapping response = api.propertymappingsRacUpdate(pmUuid, raCPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsRacUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsRacUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlCreateTest() throws ApiException {
        SAMLPropertyMappingRequest saMLPropertyMappingRequest = null;
        SAMLPropertyMapping response = api.propertymappingsSamlCreate(saMLPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsSamlDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlListTest() throws ApiException {
        String expression = null;
        String friendlyName = null;
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID pmUuid = null;
        String samlName = null;
        String search = null;
        PaginatedSAMLPropertyMappingList response = api.propertymappingsSamlList(expression, friendlyName, managed, name, ordering, page, pageSize, pmUuid, samlName, search);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedSAMLPropertyMappingRequest patchedSAMLPropertyMappingRequest = null;
        SAMLPropertyMapping response = api.propertymappingsSamlPartialUpdate(pmUuid, patchedSAMLPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        SAMLPropertyMapping response = api.propertymappingsSamlRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * SAMLPropertyMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlUpdateTest() throws ApiException {
        UUID pmUuid = null;
        SAMLPropertyMappingRequest saMLPropertyMappingRequest = null;
        SAMLPropertyMapping response = api.propertymappingsSamlUpdate(pmUuid, saMLPropertyMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsSamlUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsSamlUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimCreateTest() throws ApiException {
        SCIMMappingRequest scIMMappingRequest = null;
        SCIMMapping response = api.propertymappingsScimCreate(scIMMappingRequest);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsScimDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimListTest() throws ApiException {
        String expression = null;
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID pmUuid = null;
        String search = null;
        PaginatedSCIMMappingList response = api.propertymappingsScimList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimPartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedSCIMMappingRequest patchedSCIMMappingRequest = null;
        SCIMMapping response = api.propertymappingsScimPartialUpdate(pmUuid, patchedSCIMMappingRequest);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        SCIMMapping response = api.propertymappingsScimRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * SCIMMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimUpdateTest() throws ApiException {
        UUID pmUuid = null;
        SCIMMappingRequest scIMMappingRequest = null;
        SCIMMapping response = api.propertymappingsScimUpdate(pmUuid, scIMMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScimUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsScimUsedByList(pmUuid);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeCreateTest() throws ApiException {
        ScopeMappingRequest scopeMappingRequest = null;
        ScopeMapping response = api.propertymappingsScopeCreate(scopeMappingRequest);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeDestroyTest() throws ApiException {
        UUID pmUuid = null;
        api.propertymappingsScopeDestroy(pmUuid);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeListTest() throws ApiException {
        List<String> managed = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String scopeName = null;
        String search = null;
        PaginatedScopeMappingList response = api.propertymappingsScopeList(managed, name, ordering, page, pageSize, scopeName, search);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopePartialUpdateTest() throws ApiException {
        UUID pmUuid = null;
        PatchedScopeMappingRequest patchedScopeMappingRequest = null;
        ScopeMapping response = api.propertymappingsScopePartialUpdate(pmUuid, patchedScopeMappingRequest);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeRetrieveTest() throws ApiException {
        UUID pmUuid = null;
        ScopeMapping response = api.propertymappingsScopeRetrieve(pmUuid);
        // TODO: test validations
    }

    /**
     * ScopeMapping Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeUpdateTest() throws ApiException {
        UUID pmUuid = null;
        ScopeMappingRequest scopeMappingRequest = null;
        ScopeMapping response = api.propertymappingsScopeUpdate(pmUuid, scopeMappingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertymappingsScopeUsedByListTest() throws ApiException {
        UUID pmUuid = null;
        List<UsedBy> response = api.propertymappingsScopeUsedByList(pmUuid);
        // TODO: test validations
    }

}
