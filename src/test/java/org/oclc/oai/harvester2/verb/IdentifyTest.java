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
import static org.oclc.oai.harvester2.verb.Constants.OAI2_HTTPS_TEST_URL;
import static org.oclc.oai.harvester2.verb.Constants.OAI2_TEST_URL;

public class IdentifyTest {

    @Test
    public void test11() throws Exception {
        Identify identify = new Identify(OAI11_TEST_URL);
        assertTrue("1.1".equals(identify.getProtocolVersion()));
    }

    @Test
    public void test20() throws Exception {
        Identify identify = new Identify(OAI2_TEST_URL);
        assertTrue("2.0".equals(identify.getProtocolVersion()));
    }

    @Test
    public void testhttps() throws Exception {
        Identify identify = new Identify(OAI2_HTTPS_TEST_URL);
        assertTrue("2.0".equals(identify.getProtocolVersion()));
    }
}
