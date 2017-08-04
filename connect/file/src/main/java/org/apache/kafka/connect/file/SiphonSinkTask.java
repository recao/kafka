package org.apache.kafka.connect.file;

import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.connect.sink.SinkRecord;
import org.apache.kafka.connect.sink.SinkTask;
import java.util.Collection;
import java.util.Map;

public class SiphonSinkTask extends SinkTask {
    public SiphonSinkTask() {
    }

    @Override
    public String version() {
        return new SiphonSinkConnector().version();
    }

    @Override
    public void start(Map<String, String> props) {
        // do nothing
    }

    @Override
    public void put(Collection<SinkRecord> sinkRecords) {
        // do nothing
    }

    @Override
    public void flush(Map<TopicPartition, OffsetAndMetadata> offsets) {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}

