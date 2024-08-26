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
import org.openapitools.client.model.Cache;
import org.openapitools.client.model.DummyPolicy;
import org.openapitools.client.model.DummyPolicyRequest;
import org.openapitools.client.model.EventMatcherPolicy;
import org.openapitools.client.model.EventMatcherPolicyRequest;
import org.openapitools.client.model.ExpressionPolicy;
import org.openapitools.client.model.ExpressionPolicyRequest;
import org.openapitools.client.model.GenericError;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PaginatedDummyPolicyList;
import org.openapitools.client.model.PaginatedEventMatcherPolicyList;
import org.openapitools.client.model.PaginatedExpressionPolicyList;
import org.openapitools.client.model.PaginatedPasswordExpiryPolicyList;
import org.openapitools.client.model.PaginatedPasswordPolicyList;
import org.openapitools.client.model.PaginatedPolicyBindingList;
import org.openapitools.client.model.PaginatedPolicyList;
import org.openapitools.client.model.PaginatedReputationList;
import org.openapitools.client.model.PaginatedReputationPolicyList;
import org.openapitools.client.model.PasswordExpiryPolicy;
import org.openapitools.client.model.PasswordExpiryPolicyRequest;
import org.openapitools.client.model.PasswordPolicy;
import org.openapitools.client.model.PasswordPolicyRequest;
import org.openapitools.client.model.PatchedDummyPolicyRequest;
import org.openapitools.client.model.PatchedEventMatcherPolicyRequest;
import org.openapitools.client.model.PatchedExpressionPolicyRequest;
import org.openapitools.client.model.PatchedPasswordExpiryPolicyRequest;
import org.openapitools.client.model.PatchedPasswordPolicyRequest;
import org.openapitools.client.model.PatchedPolicyBindingRequest;
import org.openapitools.client.model.PatchedReputationPolicyRequest;
import org.openapitools.client.model.Policy;
import org.openapitools.client.model.PolicyBinding;
import org.openapitools.client.model.PolicyBindingRequest;
import org.openapitools.client.model.PolicyTestRequest;
import org.openapitools.client.model.PolicyTestResult;
import org.openapitools.client.model.Reputation;
import org.openapitools.client.model.ReputationPolicy;
import org.openapitools.client.model.ReputationPolicyRequest;
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
 * API tests for PoliciesApi
 */
@Disabled
public class PoliciesApiTest {

    private final PoliciesApi api = new PoliciesApi();

    /**
     * Clear policy cache
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllCacheClearCreateTest() throws ApiException {
        api.policiesAllCacheClearCreate();
        // TODO: test validations
    }

    /**
     * Info about cached policies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllCacheInfoRetrieveTest() throws ApiException {
        Cache response = api.policiesAllCacheInfoRetrieve();
        // TODO: test validations
    }

    /**
     * Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesAllDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllListTest() throws ApiException {
        Boolean bindingsIsnull = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        Boolean promptstageIsnull = null;
        String search = null;
        PaginatedPolicyList response = api.policiesAllList(bindingsIsnull, ordering, page, pageSize, promptstageIsnull, search);
        // TODO: test validations
    }

    /**
     * Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        Policy response = api.policiesAllRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Test policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllTestCreateTest() throws ApiException {
        UUID policyUuid = null;
        PolicyTestRequest policyTestRequest = null;
        PolicyTestResult response = api.policiesAllTestCreate(policyUuid, policyTestRequest);
        // TODO: test validations
    }

    /**
     * Get all creatable types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllTypesListTest() throws ApiException {
        List<TypeCreate> response = api.policiesAllTypesList();
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesAllUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesAllUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsCreateTest() throws ApiException {
        PolicyBindingRequest policyBindingRequest = null;
        PolicyBinding response = api.policiesBindingsCreate(policyBindingRequest);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsDestroyTest() throws ApiException {
        UUID policyBindingUuid = null;
        api.policiesBindingsDestroy(policyBindingUuid);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsListTest() throws ApiException {
        Boolean enabled = null;
        Integer order = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policy = null;
        Boolean policyIsnull = null;
        String search = null;
        UUID target = null;
        List<UUID> targetIn = null;
        Integer timeout = null;
        PaginatedPolicyBindingList response = api.policiesBindingsList(enabled, order, ordering, page, pageSize, policy, policyIsnull, search, target, targetIn, timeout);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsPartialUpdateTest() throws ApiException {
        UUID policyBindingUuid = null;
        PatchedPolicyBindingRequest patchedPolicyBindingRequest = null;
        PolicyBinding response = api.policiesBindingsPartialUpdate(policyBindingUuid, patchedPolicyBindingRequest);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsRetrieveTest() throws ApiException {
        UUID policyBindingUuid = null;
        PolicyBinding response = api.policiesBindingsRetrieve(policyBindingUuid);
        // TODO: test validations
    }

    /**
     * PolicyBinding Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsUpdateTest() throws ApiException {
        UUID policyBindingUuid = null;
        PolicyBindingRequest policyBindingRequest = null;
        PolicyBinding response = api.policiesBindingsUpdate(policyBindingUuid, policyBindingRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesBindingsUsedByListTest() throws ApiException {
        UUID policyBindingUuid = null;
        List<UsedBy> response = api.policiesBindingsUsedByList(policyBindingUuid);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyCreateTest() throws ApiException {
        DummyPolicyRequest dummyPolicyRequest = null;
        DummyPolicy response = api.policiesDummyCreate(dummyPolicyRequest);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesDummyDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyListTest() throws ApiException {
        OffsetDateTime created = null;
        Boolean executionLogging = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policyUuid = null;
        Boolean result = null;
        String search = null;
        Integer waitMax = null;
        Integer waitMin = null;
        PaginatedDummyPolicyList response = api.policiesDummyList(created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, result, search, waitMax, waitMin);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedDummyPolicyRequest patchedDummyPolicyRequest = null;
        DummyPolicy response = api.policiesDummyPartialUpdate(policyUuid, patchedDummyPolicyRequest);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        DummyPolicy response = api.policiesDummyRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Dummy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyUpdateTest() throws ApiException {
        UUID policyUuid = null;
        DummyPolicyRequest dummyPolicyRequest = null;
        DummyPolicy response = api.policiesDummyUpdate(policyUuid, dummyPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesDummyUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesDummyUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherCreateTest() throws ApiException {
        EventMatcherPolicyRequest eventMatcherPolicyRequest = null;
        EventMatcherPolicy response = api.policiesEventMatcherCreate(eventMatcherPolicyRequest);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesEventMatcherDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherListTest() throws ApiException {
        String action = null;
        String app = null;
        String clientIp = null;
        OffsetDateTime created = null;
        Boolean executionLogging = null;
        OffsetDateTime lastUpdated = null;
        String model = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policyUuid = null;
        String search = null;
        PaginatedEventMatcherPolicyList response = api.policiesEventMatcherList(action, app, clientIp, created, executionLogging, lastUpdated, model, name, ordering, page, pageSize, policyUuid, search);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedEventMatcherPolicyRequest patchedEventMatcherPolicyRequest = null;
        EventMatcherPolicy response = api.policiesEventMatcherPartialUpdate(policyUuid, patchedEventMatcherPolicyRequest);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        EventMatcherPolicy response = api.policiesEventMatcherRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Event Matcher Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherUpdateTest() throws ApiException {
        UUID policyUuid = null;
        EventMatcherPolicyRequest eventMatcherPolicyRequest = null;
        EventMatcherPolicy response = api.policiesEventMatcherUpdate(policyUuid, eventMatcherPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesEventMatcherUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesEventMatcherUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionCreateTest() throws ApiException {
        ExpressionPolicyRequest expressionPolicyRequest = null;
        ExpressionPolicy response = api.policiesExpressionCreate(expressionPolicyRequest);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesExpressionDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionListTest() throws ApiException {
        OffsetDateTime created = null;
        Boolean executionLogging = null;
        String expression = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policyUuid = null;
        String search = null;
        PaginatedExpressionPolicyList response = api.policiesExpressionList(created, executionLogging, expression, lastUpdated, name, ordering, page, pageSize, policyUuid, search);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedExpressionPolicyRequest patchedExpressionPolicyRequest = null;
        ExpressionPolicy response = api.policiesExpressionPartialUpdate(policyUuid, patchedExpressionPolicyRequest);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        ExpressionPolicy response = api.policiesExpressionRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Source Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionUpdateTest() throws ApiException {
        UUID policyUuid = null;
        ExpressionPolicyRequest expressionPolicyRequest = null;
        ExpressionPolicy response = api.policiesExpressionUpdate(policyUuid, expressionPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesExpressionUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesExpressionUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordCreateTest() throws ApiException {
        PasswordPolicyRequest passwordPolicyRequest = null;
        PasswordPolicy response = api.policiesPasswordCreate(passwordPolicyRequest);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesPasswordDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryCreateTest() throws ApiException {
        PasswordExpiryPolicyRequest passwordExpiryPolicyRequest = null;
        PasswordExpiryPolicy response = api.policiesPasswordExpiryCreate(passwordExpiryPolicyRequest);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesPasswordExpiryDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryListTest() throws ApiException {
        OffsetDateTime created = null;
        Integer days = null;
        Boolean denyOnly = null;
        Boolean executionLogging = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policyUuid = null;
        String search = null;
        PaginatedPasswordExpiryPolicyList response = api.policiesPasswordExpiryList(created, days, denyOnly, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedPasswordExpiryPolicyRequest patchedPasswordExpiryPolicyRequest = null;
        PasswordExpiryPolicy response = api.policiesPasswordExpiryPartialUpdate(policyUuid, patchedPasswordExpiryPolicyRequest);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        PasswordExpiryPolicy response = api.policiesPasswordExpiryRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Expiry Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PasswordExpiryPolicyRequest passwordExpiryPolicyRequest = null;
        PasswordExpiryPolicy response = api.policiesPasswordExpiryUpdate(policyUuid, passwordExpiryPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordExpiryUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesPasswordExpiryUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordListTest() throws ApiException {
        Integer amountDigits = null;
        Integer amountLowercase = null;
        Integer amountSymbols = null;
        Integer amountUppercase = null;
        Boolean checkHaveIBeenPwned = null;
        Boolean checkStaticRules = null;
        Boolean checkZxcvbn = null;
        OffsetDateTime created = null;
        String errorMessage = null;
        Boolean executionLogging = null;
        Integer hibpAllowedCount = null;
        OffsetDateTime lastUpdated = null;
        Integer lengthMin = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        String passwordField = null;
        UUID policyUuid = null;
        String search = null;
        String symbolCharset = null;
        Integer zxcvbnScoreThreshold = null;
        PaginatedPasswordPolicyList response = api.policiesPasswordList(amountDigits, amountLowercase, amountSymbols, amountUppercase, checkHaveIBeenPwned, checkStaticRules, checkZxcvbn, created, errorMessage, executionLogging, hibpAllowedCount, lastUpdated, lengthMin, name, ordering, page, pageSize, passwordField, policyUuid, search, symbolCharset, zxcvbnScoreThreshold);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedPasswordPolicyRequest patchedPasswordPolicyRequest = null;
        PasswordPolicy response = api.policiesPasswordPartialUpdate(policyUuid, patchedPasswordPolicyRequest);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        PasswordPolicy response = api.policiesPasswordRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Password Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PasswordPolicyRequest passwordPolicyRequest = null;
        PasswordPolicy response = api.policiesPasswordUpdate(policyUuid, passwordPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesPasswordUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesPasswordUsedByList(policyUuid);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationCreateTest() throws ApiException {
        ReputationPolicyRequest reputationPolicyRequest = null;
        ReputationPolicy response = api.policiesReputationCreate(reputationPolicyRequest);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationDestroyTest() throws ApiException {
        UUID policyUuid = null;
        api.policiesReputationDestroy(policyUuid);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationListTest() throws ApiException {
        Boolean checkIp = null;
        Boolean checkUsername = null;
        OffsetDateTime created = null;
        Boolean executionLogging = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        UUID policyUuid = null;
        String search = null;
        Integer threshold = null;
        PaginatedReputationPolicyList response = api.policiesReputationList(checkIp, checkUsername, created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search, threshold);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationPartialUpdateTest() throws ApiException {
        UUID policyUuid = null;
        PatchedReputationPolicyRequest patchedReputationPolicyRequest = null;
        ReputationPolicy response = api.policiesReputationPartialUpdate(policyUuid, patchedReputationPolicyRequest);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationRetrieveTest() throws ApiException {
        UUID policyUuid = null;
        ReputationPolicy response = api.policiesReputationRetrieve(policyUuid);
        // TODO: test validations
    }

    /**
     * Reputation Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationScoresDestroyTest() throws ApiException {
        UUID reputationUuid = null;
        api.policiesReputationScoresDestroy(reputationUuid);
        // TODO: test validations
    }

    /**
     * Reputation Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationScoresListTest() throws ApiException {
        String identifier = null;
        List<String> identifierIn = null;
        String ip = null;
        String ordering = null;
        Integer page = null;
        Integer pageSize = null;
        Integer score = null;
        String search = null;
        PaginatedReputationList response = api.policiesReputationScoresList(identifier, identifierIn, ip, ordering, page, pageSize, score, search);
        // TODO: test validations
    }

    /**
     * Reputation Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationScoresRetrieveTest() throws ApiException {
        UUID reputationUuid = null;
        Reputation response = api.policiesReputationScoresRetrieve(reputationUuid);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationScoresUsedByListTest() throws ApiException {
        UUID reputationUuid = null;
        List<UsedBy> response = api.policiesReputationScoresUsedByList(reputationUuid);
        // TODO: test validations
    }

    /**
     * Reputation Policy Viewset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationUpdateTest() throws ApiException {
        UUID policyUuid = null;
        ReputationPolicyRequest reputationPolicyRequest = null;
        ReputationPolicy response = api.policiesReputationUpdate(policyUuid, reputationPolicyRequest);
        // TODO: test validations
    }

    /**
     * Get a list of all objects that use this object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesReputationUsedByListTest() throws ApiException {
        UUID policyUuid = null;
        List<UsedBy> response = api.policiesReputationUsedByList(policyUuid);
        // TODO: test validations
    }

}
