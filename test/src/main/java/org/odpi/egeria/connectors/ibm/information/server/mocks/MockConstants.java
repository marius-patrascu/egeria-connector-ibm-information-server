/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.information.server.mocks;

import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.JsonBody;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

/**
 * A set of constants that can be re-used across various modules' tests.
 */
public class MockConstants {

    public static final String IGC_HOST = "localhost";
    public static final String IGC_PORT = "1080";
    public static final String IGC_ENDPOINT = IGC_HOST + ":" + IGC_PORT;
    public static final String IGC_USER = "isadmin";
    public static final String IGC_PASS = "isadmin";

    public static final String EGERIA_USER = "admin";
    public static final int EGERIA_PAGESIZE = 100;

    public static final String EGERIA_GLOSSARY_TERM_TYPE_GUID = "0db3e6ec-f5ef-4d75-ae38-b7ee6fd6ec0a";
    public static final String EGERIA_GLOSSARY_TERM_TYPE_NAME = "GlossaryTerm";

    public static final String GLOSSARY_RID = "6662c0f2.ee6a64fe.00263pfar.1a0mm9a.lfjd3c.rmgl1cdd5fcd4bijur3g3";
    public static final String GLOSSARY_NAME = "Coco Pharmaceuticals";
    public static final String GLOSSARY_DESC = "This glossary contains Glossary Terms and Categories that are related to the Coco Pharmaceuticals data";

    // RIDs used for specific scenarios to test mappers
    public static final String CATEGORY_RID = "6662c0f2.ee6a64fe.o1h6evehs.j0f25pn.ihsrb3.m7984f1jgfencf15nopk0";
    public static final String TERM_RID = "6662c0f2.e1b1ec6c.00263shl8.8c6cjg1.thoiqd.g2jiimda7gvarsup8a3bb";
    public static final String DATABASE_RID = "b1c497ce.6e83759b.001mts4qn.7n9l0ef.4ov512.nfvlgdgsrggoc6hdlgic5";
    public static final String DATA_CONNECTION_RID = "b1c497ce.8e4c0a48.001mts4qn.7mouq34.s1cncq.51abs5f71epl37jke7irc";
    public static final String DATA_CONNECTION_RID_FS = "b1c497ce.8e4c0a48.001mts4ph.b7m0b1n.i2d31s.oaetfv0vaorabkeoccdc3";
    public static final String HOST_RID = "b1c497ce.354f5217.001mtr387.0nbvgbo.uh4485.rd8qffabbjgrsfjh2sheh";
    public static final String DATABASE_SCHEMA_RID = "b1c497ce.c1fb060b.001mts4qn.7n9ghn6.59e1lg.oeu3169u6dtpesgou6cqh";
    public static final String DATABASE_TABLE_RID = "b1c497ce.54bd3a08.001mts4qn.7n9a341.3l2hic.d867phul07pgt3478ctim";
    public static final String DATABASE_COLUMN_RID = "b1c497ce.60641b50.001mts4qn.7n94g9l.d6kb7r.l766qqrh375qc8dngkpni";
    public static final String DATA_CLASS_RID = "f4951817.e469fa50.001mtr2gq.i03lpp2.ff6ti2.b6ol04ugdbtt6u6eojunp";
    public static final String DATA_FILE_RID = "b1c497ce.6e76d866.001mts4ph.b7m5306.9nrsit.7gtv16ok5bkl9ulo5rq8b";
    public static final String DATA_FILE_RECORD_RID = "b1c497ce.54bd3a08.001mts4ph.b86utm6.a6meal.r7it9dr6jpapp50ad4ef4";
    public static final String DATA_FILE_FIELD_RID = "b1c497ce.60641b50.001mts4ph.b86ofl8.toj5lt.0vrgjai9knc4h9k0hpr08";
    public static final String SPINE_OBJECT_RID = "6662c0f2.e1b1ec6c.000mfkabd.cnqudif.58d1v3.mchnq8gmq5e3mo3kpev7l";
    public static final String SUBJECT_AREA_RID = "6662c0f2.ee6a64fe.o1h6evefs.3cd0db2.onm1g1.3auq0edm3j6k2gumuks96";
    public static final String INFORMATION_GOVERNANCE_POLICY_RID = "6662c0f2.8ed29152.000mfk806.3p93nta.95ttq9.gc3t9m9vfgg55hhm19vsp";
    public static final String USER_RID = "b1c497ce.285feb.001mts4th.dq2dkb2.ggbeni.vl04tnd0t0bjgmlg5a35vn0";
    public static final String GROUP_RID = "b1c497ce.8a5be154.001mts4th.nmdbb31.7flfke.0b7taja56pjhs73o553iq";

    /**
     * Create a mock IGC search request.
     * @return HttpRequest
     */
    public static HttpRequest searchRequest() {
        return request().withMethod("POST").withPath("/ibm/iis/igc-rest/v1/search");
    }

    /**
     * Create a mock IGC search request for the provided body.
     * @param body to search
     * @return HttpRequest
     */
    public static HttpRequest searchRequest(String body) {
        return searchRequest().withBody(body);
    }

    /**
     * Create a mock IGC search request for the provided JSON body.
     * @param body to search
     * @return HttpRequest
     */
    public static HttpRequest searchRequest(JsonBody body) {
        return searchRequest().withBody(body);
    }

    /**
     * Create a mock IGC type query request.
     * @return HttpRequest
     */
    public static HttpRequest typesRequest() {
        return request().withMethod("GET").withPath("/ibm/iis/igc-rest/v1/types");
    }

    /**
     * Create a mock IGC type query request.
     * @param typeName type name for which to retrieve details
     * @return HttpRequest
     */
    public static HttpRequest typesRequest(String typeName) {
        return request().withMethod("GET").withPath("/ibm/iis/igc-rest/v1/types/" + typeName);
    }

    /**
     * Create a mock IGC asset retrieval by RID request.
     * @param rid the RID for the asset to retrieve
     * @return HttpRequest
     */
    public static HttpRequest assetByRidRequest(String rid) {
        return request().withMethod("GET").withPath("/ibm/iis/igc-rest/v1/assets/" + rid);
    }

    /**
     * Create a mock IGC bundle query request.
     * @return HttpRequest
     */
    public static HttpRequest bundlesRequest() {
        return request().withMethod("GET").withPath("/ibm/iis/igc-rest/v1/bundles");
    }

    /**
     * Create a mock IGC bundle upsert request.
     * @return HttpRequest
     */
    public static HttpRequest upsertBundleRequest() {
        return request().withMethod("PUT").withPath("/ibm/iis/igc-rest/v1/bundles");
    }

    /**
     * Create a mock IGC request for the job synchronization rule.
     * @return HttpRequest
     */
    public static HttpRequest jobSyncRuleRequest() {
        return searchRequest("{\"types\":[\"information_governance_rule\"],\"properties\":[\"short_description\"],\"pageSize\":100,\"where\":{\"conditions\":[{\"property\":\"name\",\"operator\":\"=\",\"value\":\"Job metadata will be periodically synced through ODPi Egeria's Data Engine OMAS\"}],\"operator\":\"and\"}}");
    }

    /**
     * Create a mock IGC logout request.
     * @return HttpRequest
     */
    public static HttpRequest logoutRequest() {
        return request().withMethod("GET").withPath("/ibm/iis/igc-rest/v1/logout");
    }

    /**
     * Create a mock IGC response using the provided body.
     * @param body to respond with
     * @return HttpResponse
     */
    public static HttpResponse withResponse(String body) {
        return response().withBody(body);
    }

}
