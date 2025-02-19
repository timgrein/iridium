/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package software.iridium.cli.generator;

import java.util.HashMap;
import java.util.Map;

public class PersistenePropertyGenerator extends AbstractGenerator {

  public static Map<String, String> generatePersistenceProperties(
      final String host, final String port, final String user, final char[] password) {
    Map<String, String> addedOrOverridenProperties = new HashMap<>();
    addedOrOverridenProperties.put(
        "jakarta.persistence.jdbc.url", "jdbc:mysql://" + host + ":" + port + "/identities");
    addedOrOverridenProperties.put("jakarta.persistence.jdbc.user", user);
    addedOrOverridenProperties.put("jakarta.persistence.jdbc.password", new String(password));
    return addedOrOverridenProperties;
  }
}
