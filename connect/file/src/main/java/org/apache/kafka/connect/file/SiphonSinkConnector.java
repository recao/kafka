package org.apache.kafka.connect.file;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;
import org.apache.kafka.common.utils.AppInfoParser;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.sink.SinkConnector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Very simple connector that works with the console. This connector supports both source and
 * sink modes via its 'mode' setting.
 */
public class SiphonSinkConnector extends SinkConnector {

    @Override
    public String version() {
        return AppInfoParser.getVersion();
    }

    @Override
    public void start(Map<String, String> props) {
        // do nothing
    }

    @Override
    public Class<? extends Task> taskClass() {
        return FileStreamSinkTask.class;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        ArrayList<Map<String, String>> configs = new ArrayList<>();
        return configs;
    }

    @Override
    public void stop() {
        // do nothing
    }

    @Override
    public ConfigDef config() {
        return new ConfigDef();
    }
}
