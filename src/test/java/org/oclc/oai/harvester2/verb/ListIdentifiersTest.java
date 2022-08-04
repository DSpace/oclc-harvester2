/**
 * Copyright 2006 OCLC, Online Computer Library Center Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package org.oclc.oai.harvester2.verb;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.oclc.oai.harvester2.verb.Constants.OAI11_TEST_URL;
import static org.oclc.oai.harvester2.verb.Constants.OAI2_TEST_URL;

public class ListIdentifiersTest {

    @Test
    public void testv11() throws Exception {
        if (OAI11_TEST_URL != null && !OAI11_TEST_URL.isEmpty()) {
            ListIdentifiers listIdentifiers = new ListIdentifiers(OAI11_TEST_URL, null, null, null, "oai_dc");
            assertTrue(
                ListIdentifiers.SCHEMA_LOCATION_V1_1_LIST_IDENTIFIERS.equals(listIdentifiers.getSchemaLocation()));
            String resumptionToken = listIdentifiers.getResumptionToken();
            //System.out.println("resumptionToken=" + resumptionToken);
            assertTrue(resumptionToken.equals("!!!!100"));
        }
    }

    @Test
    public void testv20() throws Exception {
        ListIdentifiers listIdentifiers = new ListIdentifiers(OAI2_TEST_URL, null, null, null, "oai_dc");
        assertTrue(ListIdentifiers.SCHEMA_LOCATION_V2_0.equals(listIdentifiers.getSchemaLocation()));
        String resumptionToken = listIdentifiers.getResumptionToken();
        //System.out.println("resumptionToken=" + resumptionToken);
        assertTrue(resumptionToken.equals("oai_dc////100"));
    }
}
