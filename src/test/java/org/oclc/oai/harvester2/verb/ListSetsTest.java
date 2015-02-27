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

public class ListSetsTest {

    @Test
    public void test11() throws Exception {
        ListSets listSets = new ListSets(OAI11_TEST_URL);
        assertTrue(ListSets.SCHEMA_LOCATION_V1_1_LIST_SETS.equals(listSets.getSchemaLocation()));
    }

    @Test
    public void test20() throws Exception {
        ListSets listSets = new ListSets(OAI2_TEST_URL);
        assertTrue(ListSets.SCHEMA_LOCATION_V2_0.equals(listSets.getSchemaLocation()));
        listSets = new ListSets(OAI2_TEST_URL, "foo");
        assertTrue(ListSets.SCHEMA_LOCATION_V2_0.equals(listSets.getSchemaLocation()));
    }
}
