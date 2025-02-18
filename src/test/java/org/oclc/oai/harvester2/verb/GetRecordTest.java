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
import org.junit.Ignore;
import org.junit.Test;
import static org.oclc.oai.harvester2.verb.Constants.OAI11_TEST_URL;
import static org.oclc.oai.harvester2.verb.Constants.OAI2_TEST_URL;
import static org.oclc.oai.harvester2.verb.Constants.OAI2_GETRECORD_ID;

public class GetRecordTest {

    @Test
    public void testv11() throws Exception {
        if (OAI11_TEST_URL != null && !OAI11_TEST_URL.isEmpty()) {
            GetRecord getRecord = new GetRecord(OAI11_TEST_URL, "oai:VTETD:etd-3345131939761081", "oai_dc");
            assertTrue(GetRecord.SCHEMA_LOCATION_V1_1_GET_RECORD.equals(getRecord.getSchemaLocation()));
            //System.out.println(getRecord.getIdentifier());
            assertTrue("oai:VTETD:etd-3345131939761081".equals(getRecord.getIdentifier()));
        }
    }

    @Test
    public void testv20() throws Exception {
        GetRecord getRecord = new GetRecord(OAI2_TEST_URL, OAI2_GETRECORD_ID, "oai_dc");
        assertTrue(GetRecord.SCHEMA_LOCATION_V2_0.equals(getRecord.getSchemaLocation()));
        assertTrue(OAI2_GETRECORD_ID.equals(getRecord.getIdentifier()));
    }
}
