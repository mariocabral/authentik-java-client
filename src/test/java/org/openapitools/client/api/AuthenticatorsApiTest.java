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
import org.openapitools.client.model.Device;
import org.openapitools.client.model.DuoDevice;
import org.openapitools.client.model.DuoDeviceRequest;
import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.PaginatedDuoDeviceList;
import org.openapitools.client.model.PaginatedSMSDeviceList;
import org.openapitools.client.model.PaginatedStaticDeviceList;
import org.openapitools.client.model.PaginatedTOTPDeviceList;
import org.openapitools.client.model.PaginatedWebAuthnDeviceList;
import org.openapitools.client.model.PatchedDuoDeviceRequest;
import org.openapitools.client.model.PatchedSMSDeviceRequest;
import org.openapitools.client.model.PatchedStaticDeviceRequest;
import org.openapitools.client.model.PatchedTOTPDeviceRequest;
import org.openapitools.client.model.PatchedWebAuthnDeviceRequest;
import org.openapitools.client.model.SMSDevice;
import org.openapitools.client.model.SMSDeviceRequest;
import org.openapitools.client.model.StaticDevice;
import org.openapitools.client.model.StaticDeviceRequest;
import org.openapitools.client.model.TOTPDevice;
import org.openapitools.client.model.TOTPDeviceRequest;
import org.openapitools.client.model.UsedBy;
import org.openapitools.client.model.ValidationError;
import org.openapitools.client.model.WebAuthnDevice;
import org.openapitools.client.model.WebAuthnDeviceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticatorsApi
 */
@Disabled
public class AuthenticatorsApiTest {

    private final AuthenticatorsApi api = new AuthenticatorsApi();

    /**
     * Get all devices for current user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminAllListTest() throws ApiException {
        Integer user = null;
        List<Device> response = api.authenticatorsAdminAllList(user);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoCreateTest() throws ApiException {
        DuoDeviceRequest duoDeviceRequest = null;
        DuoDevice response = api.authenticatorsAdminDuoCreate(duoDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsAdminDuoDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedDuoDeviceList response = api.authenticatorsAdminDuoList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedDuoDeviceRequest patchedDuoDeviceRequest = null;
        DuoDevice response = api.authenticatorsAdminDuoPartialUpdate(id, patchedDuoDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoRetrieveTest() throws ApiException {
        Integer id = null;
        DuoDevice response = api.authenticatorsAdminDuoRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminDuoUpdateTest() throws ApiException {
        Integer id = null;
        DuoDeviceRequest duoDeviceRequest = null;
        DuoDevice response = api.authenticatorsAdminDuoUpdate(id, duoDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsCreateTest() throws ApiException {
        SMSDeviceRequest smSDeviceRequest = null;
        SMSDevice response = api.authenticatorsAdminSmsCreate(smSDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsAdminSmsDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedSMSDeviceList response = api.authenticatorsAdminSmsList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedSMSDeviceRequest patchedSMSDeviceRequest = null;
        SMSDevice response = api.authenticatorsAdminSmsPartialUpdate(id, patchedSMSDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsRetrieveTest() throws ApiException {
        Integer id = null;
        SMSDevice response = api.authenticatorsAdminSmsRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminSmsUpdateTest() throws ApiException {
        Integer id = null;
        SMSDeviceRequest smSDeviceRequest = null;
        SMSDevice response = api.authenticatorsAdminSmsUpdate(id, smSDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticCreateTest() throws ApiException {
        StaticDeviceRequest staticDeviceRequest = null;
        StaticDevice response = api.authenticatorsAdminStaticCreate(staticDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsAdminStaticDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedStaticDeviceList response = api.authenticatorsAdminStaticList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedStaticDeviceRequest patchedStaticDeviceRequest = null;
        StaticDevice response = api.authenticatorsAdminStaticPartialUpdate(id, patchedStaticDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticRetrieveTest() throws ApiException {
        Integer id = null;
        StaticDevice response = api.authenticatorsAdminStaticRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminStaticUpdateTest() throws ApiException {
        Integer id = null;
        StaticDeviceRequest staticDeviceRequest = null;
        StaticDevice response = api.authenticatorsAdminStaticUpdate(id, staticDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpCreateTest() throws ApiException {
        TOTPDeviceRequest toTPDeviceRequest = null;
        TOTPDevice response = api.authenticatorsAdminTotpCreate(toTPDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsAdminTotpDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedTOTPDeviceList response = api.authenticatorsAdminTotpList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedTOTPDeviceRequest patchedTOTPDeviceRequest = null;
        TOTPDevice response = api.authenticatorsAdminTotpPartialUpdate(id, patchedTOTPDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpRetrieveTest() throws ApiException {
        Integer id = null;
        TOTPDevice response = api.authenticatorsAdminTotpRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminTotpUpdateTest() throws ApiException {
        Integer id = null;
        TOTPDeviceRequest toTPDeviceRequest = null;
        TOTPDevice response = api.authenticatorsAdminTotpUpdate(id, toTPDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnCreateTest() throws ApiException {
        WebAuthnDeviceRequest webAuthnDeviceRequest = null;
        WebAuthnDevice response = api.authenticatorsAdminWebauthnCreate(webAuthnDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsAdminWebauthnDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedWebAuthnDeviceList response = api.authenticatorsAdminWebauthnList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedWebAuthnDeviceRequest patchedWebAuthnDeviceRequest = null;
        WebAuthnDevice response = api.authenticatorsAdminWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnRetrieveTest() throws ApiException {
        Integer id = null;
        WebAuthnDevice response = api.authenticatorsAdminWebauthnRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices (for admins)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAdminWebauthnUpdateTest() throws ApiException {
        Integer id = null;
        WebAuthnDeviceRequest webAuthnDeviceRequest = null;
        WebAuthnDevice response = api.authenticatorsAdminWebauthnUpdate(id, webAuthnDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get all devices for current user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsAllListTest() throws ApiException {
        List<Device> response = api.authenticatorsAllList();
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsDuoDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedDuoDeviceList response = api.authenticatorsDuoList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedDuoDeviceRequest patchedDuoDeviceRequest = null;
        DuoDevice response = api.authenticatorsDuoPartialUpdate(id, patchedDuoDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoRetrieveTest() throws ApiException {
        Integer id = null;
        DuoDevice response = api.authenticatorsDuoRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for Duo authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoUpdateTest() throws ApiException {
        Integer id = null;
        DuoDeviceRequest duoDeviceRequest = null;
        DuoDevice response = api.authenticatorsDuoUpdate(id, duoDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsDuoUsedByListTest() throws ApiException {
        Integer id = null;
        List<UsedBy> response = api.authenticatorsDuoUsedByList(id);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsSmsDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedSMSDeviceList response = api.authenticatorsSmsList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedSMSDeviceRequest patchedSMSDeviceRequest = null;
        SMSDevice response = api.authenticatorsSmsPartialUpdate(id, patchedSMSDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsRetrieveTest() throws ApiException {
        Integer id = null;
        SMSDevice response = api.authenticatorsSmsRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for sms authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsUpdateTest() throws ApiException {
        Integer id = null;
        SMSDeviceRequest smSDeviceRequest = null;
        SMSDevice response = api.authenticatorsSmsUpdate(id, smSDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsSmsUsedByListTest() throws ApiException {
        Integer id = null;
        List<UsedBy> response = api.authenticatorsSmsUsedByList(id);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsStaticDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedStaticDeviceList response = api.authenticatorsStaticList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedStaticDeviceRequest patchedStaticDeviceRequest = null;
        StaticDevice response = api.authenticatorsStaticPartialUpdate(id, patchedStaticDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticRetrieveTest() throws ApiException {
        Integer id = null;
        StaticDevice response = api.authenticatorsStaticRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for static authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticUpdateTest() throws ApiException {
        Integer id = null;
        StaticDeviceRequest staticDeviceRequest = null;
        StaticDevice response = api.authenticatorsStaticUpdate(id, staticDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsStaticUsedByListTest() throws ApiException {
        Integer id = null;
        List<UsedBy> response = api.authenticatorsStaticUsedByList(id);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsTotpDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedTOTPDeviceList response = api.authenticatorsTotpList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedTOTPDeviceRequest patchedTOTPDeviceRequest = null;
        TOTPDevice response = api.authenticatorsTotpPartialUpdate(id, patchedTOTPDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpRetrieveTest() throws ApiException {
        Integer id = null;
        TOTPDevice response = api.authenticatorsTotpRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for totp authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpUpdateTest() throws ApiException {
        Integer id = null;
        TOTPDeviceRequest toTPDeviceRequest = null;
        TOTPDevice response = api.authenticatorsTotpUpdate(id, toTPDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsTotpUsedByListTest() throws ApiException {
        Integer id = null;
        List<UsedBy> response = api.authenticatorsTotpUsedByList(id);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnDestroyTest() throws ApiException {
        Integer id = null;
        api.authenticatorsWebauthnDestroy(id);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnListTest() throws ApiException {
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        PaginatedWebAuthnDeviceList response = api.authenticatorsWebauthnList(name, ordering, page, pageSize, search);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnPartialUpdateTest() throws ApiException {
        Integer id = null;
        PatchedWebAuthnDeviceRequest patchedWebAuthnDeviceRequest = null;
        WebAuthnDevice response = api.authenticatorsWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnRetrieveTest() throws ApiException {
        Integer id = null;
        WebAuthnDevice response = api.authenticatorsWebauthnRetrieve(id);
        // TODO: test validations
    }

    /**
     * Viewset for WebAuthn authenticator devices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnUpdateTest() throws ApiException {
        Integer id = null;
        WebAuthnDeviceRequest webAuthnDeviceRequest = null;
        WebAuthnDevice response = api.authenticatorsWebauthnUpdate(id, webAuthnDeviceRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticatorsWebauthnUsedByListTest() throws ApiException {
        Integer id = null;
        List<UsedBy> response = api.authenticatorsWebauthnUsedByList(id);
        // TODO: test validations
    }

}
