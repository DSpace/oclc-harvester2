/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oclc.oai.harvester2.verb;

/**
 *
 * @author Michal Hlavac <michal_hlavac@datalan.sk>
 */
public class Constants {

    // OAI 1.1 test URL. When set to empty string, all v1.1 tests are disabled
    // Currently, there are no known active OAI 1.1 sites to test with.
    public static final String OAI11_TEST_URL ="";

    // OAI 2.0 test URL (for HTTP).
    // For our purposes we don't have an HTTP test site, so this is same as our HTTPS tests (see below)
    public static final String OAI2_TEST_URL = "https://api7.dspace.org/server/oai/request";

    // OAI 2.0 test URL (for HTTPS).  Currently, using DSpace demo site for these tests.
    public static final String OAI2_HTTPS_TEST_URL = "https://api7.dspace.org/server/oai/request";

    // A valid OAI 2.0 object identifier to use for GetRecord tests
    public static final String OAI2_GETRECORD_ID = "oai:demo7.dspace.org:10673/10";
    
    private Constants() {
    }

}
