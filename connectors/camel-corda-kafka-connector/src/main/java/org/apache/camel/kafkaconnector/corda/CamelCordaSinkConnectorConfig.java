/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.corda;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCordaSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CORDA_PATH_NODE_CONF = "camel.sink.path.node";
    public static final String CAMEL_SINK_CORDA_PATH_NODE_DOC = "The url for the corda node";
    public static final String CAMEL_SINK_CORDA_PATH_NODE_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_OPERATION_DOC = "Operation to use";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_DOC = "Password for login";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_USERNAME_DOC = "Username for login";
    public static final String CAMEL_SINK_CORDA_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_CONF = "camel.component.corda.configuration";
    public static final String CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_DOC = "To use a shared configuration.";
    public static final String CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.corda.lazyStartProducer";
    public static final String CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CORDA_COMPONENT_OPERATION_CONF = "camel.component.corda.operation";
    public static final String CAMEL_SINK_CORDA_COMPONENT_OPERATION_DOC = "Operation to use";
    public static final String CAMEL_SINK_CORDA_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.corda.basicPropertyBinding";
    public static final String CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CORDA_COMPONENT_PASSWORD_CONF = "camel.component.corda.password";
    public static final String CAMEL_SINK_CORDA_COMPONENT_PASSWORD_DOC = "Password for login";
    public static final String CAMEL_SINK_CORDA_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_CORDA_COMPONENT_USERNAME_CONF = "camel.component.corda.username";
    public static final String CAMEL_SINK_CORDA_COMPONENT_USERNAME_DOC = "Username for login";
    public static final String CAMEL_SINK_CORDA_COMPONENT_USERNAME_DEFAULT = null;

    public CamelCordaSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCordaSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CORDA_PATH_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_PATH_NODE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CORDA_PATH_NODE_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_CORDA_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_CORDA_COMPONENT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CORDA_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CORDA_COMPONENT_USERNAME_DOC);
        return conf;
    }
}