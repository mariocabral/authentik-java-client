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
import org.openapitools.client.model.DockerServiceConnection;
import org.openapitools.client.model.DockerServiceConnectionRequest;
import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.KubernetesServiceConnection;
import org.openapitools.client.model.KubernetesServiceConnectionRequest;
import org.openapitools.client.model.LDAPOutpostConfig;
import org.openapitools.client.model.Outpost;
import org.openapitools.client.model.OutpostDefaultConfig;
import org.openapitools.client.model.OutpostHealth;
import org.openapitools.client.model.OutpostRequest;
import org.openapitools.client.model.PaginatedDockerServiceConnectionList;
import org.openapitools.client.model.PaginatedKubernetesServiceConnectionList;
import org.openapitools.client.model.PaginatedLDAPOutpostConfigList;
import org.openapitools.client.model.PaginatedOutpostList;
import org.openapitools.client.model.PaginatedProxyOutpostConfigList;
import org.openapitools.client.model.PaginatedRadiusOutpostConfigList;
import org.openapitools.client.model.PaginatedServiceConnectionList;
import org.openapitools.client.model.PatchedDockerServiceConnectionRequest;
import org.openapitools.client.model.PatchedKubernetesServiceConnectionRequest;
import org.openapitools.client.model.PatchedOutpostRequest;
import org.openapitools.client.model.ProxyOutpostConfig;
import org.openapitools.client.model.RadiusOutpostConfig;
import org.openapitools.client.model.ServiceConnection;
import org.openapitools.client.model.ServiceConnectionState;
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
 * API tests for OutpostsApi
 */
@Disabled
public class OutpostsApiTest {

    private final OutpostsApi api = new OutpostsApi();

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesCreateTest() throws ApiException {
        OutpostRequest outpostRequest = null;
        Outpost response = api.outpostsInstancesCreate(outpostRequest);
        // TODO: test validations
    }

    /**
     * Global default outpost config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesDefaultSettingsRetrieveTest() throws ApiException {
        OutpostDefaultConfig response = api.outpostsInstancesDefaultSettingsRetrieve();
        // TODO: test validations
    }

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesDestroyTest() throws ApiException {
        UUID uuid = null;
        api.outpostsInstancesDestroy(uuid);
        // TODO: test validations
    }

    /**
     * Get outposts current health
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesHealthListTest() throws ApiException {
        UUID uuid = null;
        String managedIcontains = null;
        String managedIexact = null;
        String nameIcontains = null;
        String nameIexact = null;
        String ordering = null;
        Boolean providersIsnull = null;
        List<Integer> providersByPk = null;
        String search = null;
        String serviceConnectionNameIcontains = null;
        String serviceConnectionNameIexact = null;
        List<OutpostHealth> response = api.outpostsInstancesHealthList(uuid, managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact);
        // TODO: test validations
    }

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesListTest() throws ApiException {
        String managedIcontains = null;
        String managedIexact = null;
        String nameIcontains = null;
        String nameIexact = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        Boolean providersIsnull = null;
        List<Integer> providersByPk = null;
        String search = null;
        String serviceConnectionNameIcontains = null;
        String serviceConnectionNameIexact = null;
        PaginatedOutpostList response = api.outpostsInstancesList(managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, page, pageSize, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact);
        // TODO: test validations
    }

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedOutpostRequest patchedOutpostRequest = null;
        Outpost response = api.outpostsInstancesPartialUpdate(uuid, patchedOutpostRequest);
        // TODO: test validations
    }

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesRetrieveTest() throws ApiException {
        UUID uuid = null;
        Outpost response = api.outpostsInstancesRetrieve(uuid);
        // TODO: test validations
    }

    /**
     * Outpost Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesUpdateTest() throws ApiException {
        UUID uuid = null;
        OutpostRequest outpostRequest = null;
        Outpost response = api.outpostsInstancesUpdate(uuid, outpostRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsInstancesUsedByListTest() throws ApiException {
        UUID uuid = null;
        List<UsedBy> response = api.outpostsInstancesUsedByList(uuid);
        // TODO: test validations
    }

    /**
     * LDAPProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsLdapListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedLDAPOutpostConfigList response = api.outpostsLdapList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * LDAPProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsLdapRetrieveTest() throws ApiException {
        Integer id = null;
        LDAPOutpostConfig response = api.outpostsLdapRetrieve(id);
        // TODO: test validations
    }

    /**
     * ProxyProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsProxyListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedProxyOutpostConfigList response = api.outpostsProxyList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * ProxyProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsProxyRetrieveTest() throws ApiException {
        Integer id = null;
        ProxyOutpostConfig response = api.outpostsProxyRetrieve(id);
        // TODO: test validations
    }

    /**
     * RadiusProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsRadiusListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedRadiusOutpostConfigList response = api.outpostsRadiusList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * RadiusProvider Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsRadiusRetrieveTest() throws ApiException {
        Integer id = null;
        RadiusOutpostConfig response = api.outpostsRadiusRetrieve(id);
        // TODO: test validations
    }

    /**
     * ServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllDestroyTest() throws ApiException {
        UUID uuid = null;
        api.outpostsServiceConnectionsAllDestroy(uuid);
        // TODO: test validations
    }

    /**
     * ServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedServiceConnectionList response = api.outpostsServiceConnectionsAllList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * ServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllRetrieveTest() throws ApiException {
        UUID uuid = null;
        ServiceConnection response = api.outpostsServiceConnectionsAllRetrieve(uuid);
        // TODO: test validations
    }

    /**
     * Get the service connection&#39;s state
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllStateRetrieveTest() throws ApiException {
        UUID uuid = null;
        ServiceConnectionState response = api.outpostsServiceConnectionsAllStateRetrieve(uuid);
        // TODO: test validations
    }

    /**
     * Get all creatable types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllTypesListTest() throws ApiException {
        List<TypeCreate> response = api.outpostsServiceConnectionsAllTypesList();
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsAllUsedByListTest() throws ApiException {
        UUID uuid = null;
        List<UsedBy> response = api.outpostsServiceConnectionsAllUsedByList(uuid);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerCreateTest() throws ApiException {
        DockerServiceConnectionRequest dockerServiceConnectionRequest = null;
        DockerServiceConnection response = api.outpostsServiceConnectionsDockerCreate(dockerServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerDestroyTest() throws ApiException {
        UUID uuid = null;
        api.outpostsServiceConnectionsDockerDestroy(uuid);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerListTest() throws ApiException {
        Boolean local = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        UUID tlsAuthentication = null;
        UUID tlsVerification = null;
        String url = null;
        PaginatedDockerServiceConnectionList response = api.outpostsServiceConnectionsDockerList(local, name, ordering, page, pageSize, search, tlsAuthentication, tlsVerification, url);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedDockerServiceConnectionRequest patchedDockerServiceConnectionRequest = null;
        DockerServiceConnection response = api.outpostsServiceConnectionsDockerPartialUpdate(uuid, patchedDockerServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerRetrieveTest() throws ApiException {
        UUID uuid = null;
        DockerServiceConnection response = api.outpostsServiceConnectionsDockerRetrieve(uuid);
        // TODO: test validations
    }

    /**
     * DockerServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerUpdateTest() throws ApiException {
        UUID uuid = null;
        DockerServiceConnectionRequest dockerServiceConnectionRequest = null;
        DockerServiceConnection response = api.outpostsServiceConnectionsDockerUpdate(uuid, dockerServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsDockerUsedByListTest() throws ApiException {
        UUID uuid = null;
        List<UsedBy> response = api.outpostsServiceConnectionsDockerUsedByList(uuid);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesCreateTest() throws ApiException {
        KubernetesServiceConnectionRequest kubernetesServiceConnectionRequest = null;
        KubernetesServiceConnection response = api.outpostsServiceConnectionsKubernetesCreate(kubernetesServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesDestroyTest() throws ApiException {
        UUID uuid = null;
        api.outpostsServiceConnectionsKubernetesDestroy(uuid);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesListTest() throws ApiException {
        Boolean local = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedKubernetesServiceConnectionList response = api.outpostsServiceConnectionsKubernetesList(local, name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedKubernetesServiceConnectionRequest patchedKubernetesServiceConnectionRequest = null;
        KubernetesServiceConnection response = api.outpostsServiceConnectionsKubernetesPartialUpdate(uuid, patchedKubernetesServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesRetrieveTest() throws ApiException {
        UUID uuid = null;
        KubernetesServiceConnection response = api.outpostsServiceConnectionsKubernetesRetrieve(uuid);
        // TODO: test validations
    }

    /**
     * KubernetesServiceConnection Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesUpdateTest() throws ApiException {
        UUID uuid = null;
        KubernetesServiceConnectionRequest kubernetesServiceConnectionRequest = null;
        KubernetesServiceConnection response = api.outpostsServiceConnectionsKubernetesUpdate(uuid, kubernetesServiceConnectionRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outpostsServiceConnectionsKubernetesUsedByListTest() throws ApiException {
        UUID uuid = null;
        List<UsedBy> response = api.outpostsServiceConnectionsKubernetesUsedByList(uuid);
        // TODO: test validations
    }

}
