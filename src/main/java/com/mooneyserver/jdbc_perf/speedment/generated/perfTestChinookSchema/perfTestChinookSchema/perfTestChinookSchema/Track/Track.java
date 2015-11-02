package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track;

import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Album.Album;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Genre.Genre;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.MediaType.MediaType;
import com.speedment.Entity;
import com.speedment.field.ComparableField;
import com.speedment.field.ComparableForeignKeyField;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.ComparableForeignKeyFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import java.math.BigDecimal;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table
 * 'perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface Track extends Entity<Track> {
    
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getTrackId()} method.
     */
    public final static ComparableField<Track, Integer> TRACKID = new ComparableFieldImpl<>("TrackId", Track::getTrackId, Track::setTrackId);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getName()} method.
     */
    public final static StringField<Track> NAME = new StringFieldImpl<>("Name", Track::getName, Track::setName);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getAlbumId()} method.
     */
    public final static ComparableForeignKeyField<Track, Integer, Album> ALBUMID = new ComparableForeignKeyFieldImpl<>("AlbumId", o -> o.getAlbumId().orElse(null), Track::setAlbumId, fk -> fk.findAlbumId().orElse(null));
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getMediaTypeId()} method.
     */
    public final static ComparableForeignKeyField<Track, Integer, MediaType> MEDIATYPEID = new ComparableForeignKeyFieldImpl<>("MediaTypeId", Track::getMediaTypeId, Track::setMediaTypeId, Track::findMediaTypeId);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getGenreId()} method.
     */
    public final static ComparableForeignKeyField<Track, Integer, Genre> GENREID = new ComparableForeignKeyFieldImpl<>("GenreId", o -> o.getGenreId().orElse(null), Track::setGenreId, fk -> fk.findGenreId().orElse(null));
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getComposer()} method.
     */
    public final static StringField<Track> COMPOSER = new StringFieldImpl<>("Composer", o -> o.getComposer().orElse(null), Track::setComposer);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getMilliseconds()} method.
     */
    public final static ComparableField<Track, Integer> MILLISECONDS = new ComparableFieldImpl<>("Milliseconds", Track::getMilliseconds, Track::setMilliseconds);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getBytes()} method.
     */
    public final static ComparableField<Track, Integer> BYTES = new ComparableFieldImpl<>("Bytes", o -> o.getBytes().orElse(null), Track::setBytes);
    /**
     * This Field corresponds to the {@link Track} field that can be obtained
     * using the {@link Track#getUnitPrice()} method.
     */
    public final static ComparableField<Track, BigDecimal> UNITPRICE = new ComparableFieldImpl<>("UnitPrice", Track::getUnitPrice, Track::setUnitPrice);
    
    /**
     * Returns the trackId of this Track. The trackId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.TrackId.
     * 
     * @return the trackId of this Track
     */
    Integer getTrackId();
    
    /**
     * Returns the name of this Track. The name field corresponds to the database
     * column perfTestChinookSchema.perfTestChinookSchema.Track.Name.
     * 
     * @return the name of this Track
     */
    String getName();
    
    /**
     * Returns the albumId of this Track. The albumId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.AlbumId.
     * 
     * @return the albumId of this Track
     */
    Optional<Integer> getAlbumId();
    
    /**
     * Returns the mediaTypeId of this Track. The mediaTypeId field corresponds
     * to the database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.MediaTypeId.
     * 
     * @return the mediaTypeId of this Track
     */
    Integer getMediaTypeId();
    
    /**
     * Returns the genreId of this Track. The genreId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.GenreId.
     * 
     * @return the genreId of this Track
     */
    Optional<Integer> getGenreId();
    
    /**
     * Returns the composer of this Track. The composer field corresponds to the
     * database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.Composer.
     * 
     * @return the composer of this Track
     */
    Optional<String> getComposer();
    
    /**
     * Returns the milliseconds of this Track. The milliseconds field corresponds
     * to the database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.Milliseconds.
     * 
     * @return the milliseconds of this Track
     */
    Integer getMilliseconds();
    
    /**
     * Returns the bytes of this Track. The bytes field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.Bytes.
     * 
     * @return the bytes of this Track
     */
    Optional<Integer> getBytes();
    
    /**
     * Returns the unitPrice of this Track. The unitPrice field corresponds to
     * the database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.UnitPrice.
     * 
     * @return the unitPrice of this Track
     */
    BigDecimal getUnitPrice();
    
    /**
     * Sets the trackId of this Track. The trackId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.TrackId.
     * 
     * @param trackId to set of this Track
     * @return this Track instance
     */
    Track setTrackId(Integer trackId);
    
    /**
     * Sets the name of this Track. The name field corresponds to the database
     * column perfTestChinookSchema.perfTestChinookSchema.Track.Name.
     * 
     * @param name to set of this Track
     * @return this Track instance
     */
    Track setName(String name);
    
    /**
     * Sets the albumId of this Track. The albumId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.AlbumId.
     * 
     * @param albumId to set of this Track
     * @return this Track instance
     */
    Track setAlbumId(Integer albumId);
    
    /**
     * Sets the mediaTypeId of this Track. The mediaTypeId field corresponds to
     * the database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.MediaTypeId.
     * 
     * @param mediaTypeId to set of this Track
     * @return this Track instance
     */
    Track setMediaTypeId(Integer mediaTypeId);
    
    /**
     * Sets the genreId of this Track. The genreId field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Track.GenreId.
     * 
     * @param genreId to set of this Track
     * @return this Track instance
     */
    Track setGenreId(Integer genreId);
    
    /**
     * Sets the composer of this Track. The composer field corresponds to the
     * database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.Composer.
     * 
     * @param composer to set of this Track
     * @return this Track instance
     */
    Track setComposer(String composer);
    
    /**
     * Sets the milliseconds of this Track. The milliseconds field corresponds to
     * the database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.Milliseconds.
     * 
     * @param milliseconds to set of this Track
     * @return this Track instance
     */
    Track setMilliseconds(Integer milliseconds);
    
    /**
     * Sets the bytes of this Track. The bytes field corresponds to the database
     * column perfTestChinookSchema.perfTestChinookSchema.Track.Bytes.
     * 
     * @param bytes to set of this Track
     * @return this Track instance
     */
    Track setBytes(Integer bytes);
    
    /**
     * Sets the unitPrice of this Track. The unitPrice field corresponds to the
     * database column
     * perfTestChinookSchema.perfTestChinookSchema.Track.UnitPrice.
     * 
     * @param unitPrice to set of this Track
     * @return this Track instance
     */
    Track setUnitPrice(BigDecimal unitPrice);
    
    /**
     * Finds and returns the foreign key Entity {@link Album} referenced by the
     * field that can be obtained using {@link Track#getAlbumId()}.<p> N.B. The
     * current implementation only supports lazy-loading of the referenced
     * Entities. This means that if you traverse N Track entities and call this
     * method for each one, there will be N SQL-queries executed.
     * 
     * @return the foreign key Entity {@link Album} referenced by the field that
     * can be obtained using {@link Track#getAlbumId()}
     */
    Optional<Album> findAlbumId();
    
    /**
     * Finds and returns the foreign key Entity {@link Genre} referenced by the
     * field that can be obtained using {@link Track#getGenreId()}.<p> N.B. The
     * current implementation only supports lazy-loading of the referenced
     * Entities. This means that if you traverse N Track entities and call this
     * method for each one, there will be N SQL-queries executed.
     * 
     * @return the foreign key Entity {@link Genre} referenced by the field that
     * can be obtained using {@link Track#getGenreId()}
     */
    Optional<Genre> findGenreId();
    
    /**
     * Finds and returns the foreign key Entity {@link MediaType} referenced by
     * the field that can be obtained using {@link Track#getMediaTypeId()}.<p>
     * N.B. The current implementation only supports lazy-loading of the
     * referenced Entities. This means that if you traverse N Track entities and
     * call this method for each one, there will be N SQL-queries executed.
     * 
     * @return the foreign key Entity {@link MediaType} referenced by the field
     * that can be obtained using {@link Track#getMediaTypeId()}
     */
    MediaType findMediaTypeId();
}