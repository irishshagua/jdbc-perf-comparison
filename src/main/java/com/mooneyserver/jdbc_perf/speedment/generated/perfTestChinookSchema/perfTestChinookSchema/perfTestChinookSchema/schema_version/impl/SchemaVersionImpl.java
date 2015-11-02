package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.schema_version.impl;

import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.schema_version.SchemaVersion;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * An implementation representing an entity (for example, a row) in the Table
 * 'perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.schema_version'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public final class SchemaVersionImpl extends AbstractBaseEntity<SchemaVersion> implements SchemaVersion {
    
    private Integer versionRank;
    private Integer installedRank;
    private String version;
    private String description;
    private String type;
    private String script;
    private Integer checksum;
    private String installedBy;
    private Timestamp installedOn;
    private Integer executionTime;
    private Integer success;
    
    SchemaVersionImpl(Speedment speedment) {
        super(speedment);
    }
    
    public SchemaVersionImpl(Speedment speedment, final SchemaVersion schemaVersion) {
        super(speedment);
        setVersionRank(schemaVersion.getVersionRank());
        setInstalledRank(schemaVersion.getInstalledRank());
        setVersion(schemaVersion.getVersion());
        setDescription(schemaVersion.getDescription());
        setType(schemaVersion.getType());
        setScript(schemaVersion.getScript());
        schemaVersion.getChecksum().ifPresent(this::setChecksum);
        setInstalledBy(schemaVersion.getInstalledBy());
        setInstalledOn(schemaVersion.getInstalledOn());
        setExecutionTime(schemaVersion.getExecutionTime());
        setSuccess(schemaVersion.getSuccess());
    }
    
    @Override
    public Integer getVersionRank() {
        return versionRank;
    }
    
    @Override
    public Integer getInstalledRank() {
        return installedRank;
    }
    
    @Override
    public String getVersion() {
        return version;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public String getScript() {
        return script;
    }
    
    @Override
    public Optional<Integer> getChecksum() {
        return Optional.ofNullable(checksum);
    }
    
    @Override
    public String getInstalledBy() {
        return installedBy;
    }
    
    @Override
    public Timestamp getInstalledOn() {
        return installedOn;
    }
    
    @Override
    public Integer getExecutionTime() {
        return executionTime;
    }
    
    @Override
    public Integer getSuccess() {
        return success;
    }
    
    @Override
    public final SchemaVersionImpl setVersionRank(Integer versionRank) {
        this.versionRank = versionRank;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setVersion(String version) {
        this.version = version;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setType(String type) {
        this.type = type;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setScript(String script) {
        this.script = script;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setChecksum(Integer checksum) {
        this.checksum = checksum;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setInstalledOn(Timestamp installedOn) {
        this.installedOn = installedOn;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    
    @Override
    public final SchemaVersionImpl setSuccess(Integer success) {
        this.success = success;
        return this;
    }
    
    @Override
    public SchemaVersion copy() {
        return new SchemaVersionImpl(getSpeedment_(), this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("versionRank = "+Objects.toString(getVersionRank()));
        sj.add("installedRank = "+Objects.toString(getInstalledRank()));
        sj.add("version = "+Objects.toString(getVersion()));
        sj.add("description = "+Objects.toString(getDescription()));
        sj.add("type = "+Objects.toString(getType()));
        sj.add("script = "+Objects.toString(getScript()));
        sj.add("checksum = "+Objects.toString(getChecksum().orElse(null)));
        sj.add("installedBy = "+Objects.toString(getInstalledBy()));
        sj.add("installedOn = "+Objects.toString(getInstalledOn()));
        sj.add("executionTime = "+Objects.toString(getExecutionTime()));
        sj.add("success = "+Objects.toString(getSuccess()));
        return "SchemaVersionImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof SchemaVersion)) { return false; }
        @SuppressWarnings("unchecked")
        final SchemaVersion thatSchemaVersion = (SchemaVersion)that;
        if (!Objects.equals(this.getVersionRank(), thatSchemaVersion.getVersionRank())) {return false; }
        if (!Objects.equals(this.getInstalledRank(), thatSchemaVersion.getInstalledRank())) {return false; }
        if (!Objects.equals(this.getVersion(), thatSchemaVersion.getVersion())) {return false; }
        if (!Objects.equals(this.getDescription(), thatSchemaVersion.getDescription())) {return false; }
        if (!Objects.equals(this.getType(), thatSchemaVersion.getType())) {return false; }
        if (!Objects.equals(this.getScript(), thatSchemaVersion.getScript())) {return false; }
        if (!Objects.equals(this.getChecksum(), thatSchemaVersion.getChecksum())) {return false; }
        if (!Objects.equals(this.getInstalledBy(), thatSchemaVersion.getInstalledBy())) {return false; }
        if (!Objects.equals(this.getInstalledOn(), thatSchemaVersion.getInstalledOn())) {return false; }
        if (!Objects.equals(this.getExecutionTime(), thatSchemaVersion.getExecutionTime())) {return false; }
        if (!Objects.equals(this.getSuccess(), thatSchemaVersion.getSuccess())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getVersionRank());
        hash = 31 * hash + Objects.hashCode(getInstalledRank());
        hash = 31 * hash + Objects.hashCode(getVersion());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Objects.hashCode(getType());
        hash = 31 * hash + Objects.hashCode(getScript());
        hash = 31 * hash + Objects.hashCode(getChecksum());
        hash = 31 * hash + Objects.hashCode(getInstalledBy());
        hash = 31 * hash + Objects.hashCode(getInstalledOn());
        hash = 31 * hash + Objects.hashCode(getExecutionTime());
        hash = 31 * hash + Objects.hashCode(getSuccess());
        return hash;
    }
    
    @Override
    public Class<SchemaVersion> getEntityClass_() {
        return SchemaVersion.class;
    }
}