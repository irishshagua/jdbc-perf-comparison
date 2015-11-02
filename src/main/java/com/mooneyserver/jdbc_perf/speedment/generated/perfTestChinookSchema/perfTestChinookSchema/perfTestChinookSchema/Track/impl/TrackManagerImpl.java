package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track.impl;

import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track.Track;
import com.speedment.Speedment;
import com.speedment.component.ProjectComponent;
import com.speedment.config.Column;
import com.speedment.config.Table;
import com.speedment.config.mapper.TypeMapper;
import com.speedment.exception.SpeedmentException;
import com.speedment.internal.core.config.mapper.identity.BigDecimalIdentityMapper;
import com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper;
import com.speedment.internal.core.config.mapper.identity.StringIdentityMapper;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in
 * the Table
 * 'perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class TrackManagerImpl extends AbstractSqlManager<Track> {
    
    private final TypeMapper<Integer, Integer> trackIdTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<String, String> nameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<Integer, Integer> albumIdTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<Integer, Integer> mediaTypeIdTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<Integer, Integer> genreIdTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<String, String> composerTypeMapper = new StringIdentityMapper();
    private final TypeMapper<Integer, Integer> millisecondsTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<Integer, Integer> bytesTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<BigDecimal, BigDecimal> unitPriceTypeMapper = new BigDecimalIdentityMapper();
    
    public TrackManagerImpl(Speedment speedment) {
        super(speedment);
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public Class<Track> getEntityClass() {
        return Track.class;
    }
    
    @Override
    public Object get(Track entity, Column column) {
        switch (column.getName()) {
            case "TrackId" : return entity.getTrackId();
            case "Name" : return entity.getName();
            case "AlbumId" : return entity.getAlbumId();
            case "MediaTypeId" : return entity.getMediaTypeId();
            case "GenreId" : return entity.getGenreId();
            case "Composer" : return entity.getComposer();
            case "Milliseconds" : return entity.getMilliseconds();
            case "Bytes" : return entity.getBytes();
            case "UnitPrice" : return entity.getUnitPrice();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    public void set(Track entity, Column column, Object value) {
        switch (column.getName()) {
            case "TrackId" : entity.setTrackId((Integer) value); break;
            case "Name" : entity.setName((String) value); break;
            case "AlbumId" : entity.setAlbumId((Integer) value); break;
            case "MediaTypeId" : entity.setMediaTypeId((Integer) value); break;
            case "GenreId" : entity.setGenreId((Integer) value); break;
            case "Composer" : entity.setComposer((String) value); break;
            case "Milliseconds" : entity.setMilliseconds((Integer) value); break;
            case "Bytes" : entity.setBytes((Integer) value); break;
            case "UnitPrice" : entity.setUnitPrice((BigDecimal) value); break;
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    public Table getTable() {
        return speedment.get(ProjectComponent.class).getProject().findTableByName("perfTestChinookSchema.perfTestChinookSchema.Track");
    }
    
    protected Track defaultReadEntity(ResultSet resultSet) {
        final Track entity = newInstance();
        try {
            entity.setTrackId(trackIdTypeMapper.toJavaType(resultSet.getInt("TrackId")));
            entity.setName(nameTypeMapper.toJavaType(resultSet.getString("Name")));
            entity.setAlbumId(albumIdTypeMapper.toJavaType(getInt(resultSet, "AlbumId")));
            entity.setMediaTypeId(mediaTypeIdTypeMapper.toJavaType(resultSet.getInt("MediaTypeId")));
            entity.setGenreId(genreIdTypeMapper.toJavaType(getInt(resultSet, "GenreId")));
            entity.setComposer(composerTypeMapper.toJavaType(resultSet.getString("Composer")));
            entity.setMilliseconds(millisecondsTypeMapper.toJavaType(resultSet.getInt("Milliseconds")));
            entity.setBytes(bytesTypeMapper.toJavaType(getInt(resultSet, "Bytes")));
            entity.setUnitPrice(unitPriceTypeMapper.toJavaType(resultSet.getBigDecimal("UnitPrice")));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Track newInstance() {
        return new TrackImpl(speedment);
    }
    
    @Override
    public Integer primaryKeyFor(Track entity) {
        return entity.getTrackId();
    }
}