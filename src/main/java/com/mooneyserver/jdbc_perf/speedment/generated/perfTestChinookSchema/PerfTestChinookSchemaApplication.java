package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema;

import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Album.impl.AlbumManagerImpl;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Artist.impl.ArtistManagerImpl;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Genre.impl.GenreManagerImpl;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.MediaType.impl.MediaTypeManagerImpl;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track.impl.TrackManagerImpl;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.schema_version.impl.SchemaVersionManagerImpl;
import com.speedment.internal.core.runtime.SpeedmentApplicationLifecycle;
import javax.annotation.Generated;

/**
 * A {@link
 * com.speedment.internal.core.runtime.SpeedmentApplicationLifecycle} class
 * for the {@link com.speedment.config.Project} named perfTestChinookSchema.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class PerfTestChinookSchemaApplication extends SpeedmentApplicationLifecycle<PerfTestChinookSchemaApplication> {
    
    public PerfTestChinookSchemaApplication() {
        setSpeedmentApplicationMetadata(new PerfTestChinookSchemaApplicationMetadata());
    }
    
    @Override
    protected void onInit() {
        loadAndSetProject();
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Album.impl.AlbumManagerImpl(speedment));
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Artist.impl.ArtistManagerImpl(speedment));
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Genre.impl.GenreManagerImpl(speedment));
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.MediaType.impl.MediaTypeManagerImpl(speedment));
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Track.impl.TrackManagerImpl(speedment));
        put(new com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.schema_version.impl.SchemaVersionManagerImpl(speedment));
        super.onInit();
    }
}