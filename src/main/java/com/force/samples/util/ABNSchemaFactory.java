package com.force.samples.util;

import org.apache.openjpa.jdbc.conf.JDBCConfiguration;
import org.apache.openjpa.jdbc.identifier.DBIdentifier;
import org.apache.openjpa.jdbc.schema.DynamicSchemaFactory;
import org.apache.openjpa.jdbc.schema.Schema;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.jdbc.sql.DBDictionary;
import org.apache.openjpa.lib.conf.Configuration;

/**
 * ABNSchemaFactory
 */
public class ABNSchemaFactory extends DynamicSchemaFactory {

    @Override
    public void setConfiguration(Configuration conf) {
        JDBCConfiguration jconf = (JDBCConfiguration) conf;
        jconf.setSchema("TEST");
        super.setConfiguration(conf);
    }
    
}