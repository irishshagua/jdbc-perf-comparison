package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Artist;

import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Album.Album;
import com.speedment.Entity;
import com.speedment.field.ComparableField;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table
 * 'perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Artist'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface Artist extends Entity<Artist> {
    
    /**
     * This Field corresponds to the {@link Artist} field that can be obtained
     * using the {@link Artist#getArtistId()} method.
     */
    public final static ComparableField<Artist, Integer> ARTISTID = new ComparableFieldImpl<>("ArtistId", Artist::getArtistId, Artist::setArtistId);
    /**
     * This Field corresponds to the {@link Artist} field that can be obtained
     * using the {@link Artist#getName()} method.
     */
    public final static StringField<Artist> NAME = new StringFieldImpl<>("Name", o -> o.getName().orElse(null), Artist::setName);
    
    /**
     * Returns the artistId of this Artist. The artistId field corresponds to the
     * database column
     * perfTestChinookSchema.perfTestChinookSchema.Artist.ArtistId.
     * 
     * @return the artistId of this Artist
     */
    Integer getArtistId();
    
    /**
     * Returns the name of this Artist. The name field corresponds to the
     * database column perfTestChinookSchema.perfTestChinookSchema.Artist.Name.
     * 
     * @return the name of this Artist
     */
    Optional<String> getName();
    
    /**
     * Sets the artistId of this Artist. The artistId field corresponds to the
     * database column
     * perfTestChinookSchema.perfTestChinookSchema.Artist.ArtistId.
     * 
     * @param artistId to set of this Artist
     * @return this Artist instance
     */
    Artist setArtistId(Integer artistId);
    
    /**
     * Sets the name of this Artist. The name field corresponds to the database
     * column perfTestChinookSchema.perfTestChinookSchema.Artist.Name.
     * 
     * @param name to set of this Artist
     * @return this Artist instance
     */
    Artist setName(String name);
    
    /**
     * Creates and returns a {@link Stream} of all {@link Album} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Album#getArtistId()}. The order of the Entities are undefined and
     * may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Album} Entities that references
     * this Entity by the foreign key field that can be obtained using {@link
     * Album#getArtistId()}
     */
    Stream<Album> findAlbumsByArtistId();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link
     * Album} Entities that references this Entity by a foreign key. The order of
     * the Entities are undefined and may change from time to time.
     * <p>
     * Note that the Stream is <em>distinct</em>, meaning that referencing
     * Entities will only appear once in the Stream, even though they may
     * reference this Entity by several columns.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a <em>distinct</em> {@link Stream} of all {@link Album} Entities
     * that references this Entity by a foreign key
     */
    Stream<Album> findAlbums();
}