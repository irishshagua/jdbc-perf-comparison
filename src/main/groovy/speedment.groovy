import com.speedment.config.parameters.*

name = "perfTestChinookSchema";
packageLocation = "src/main/java";
packageName = "com.mooneyserver.jdbc_perf.speedment.generated";
enabled = true;
dbms {
    ipAddress = "127.0.0.1";
    name = "perfTestChinookSchema";
    port = 3306;
    typeName = "MySQL";
    username = "root";
    enabled = true;
    schema {
        catalogName = "perfTestChinookSchema";
        columnCompressionType = ColumnCompressionType.NONE;
        fieldStorageType = FieldStorageType.WRAPPER;
        name = "perfTestChinookSchema";
        schemaName = "perfTestChinookSchema";
        storageEngineType = StorageEngineType.ON_HEAP;
        defaultSchema = false;
        enabled = true;
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "Album";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "Album";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "AlbumId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Title";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "ArtistId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "AlbumId";
                enabled = true;
            }
            index {
                name = "IFK_AlbumArtistId";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "ArtistId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "AlbumId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            foreignKey {
                name = "FK_AlbumArtistId";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "ArtistId";
                    foreignTableName = "Artist";
                    name = "ArtistId";
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "Artist";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "Artist";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "ArtistId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Name";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            primaryKeyColumn {
                name = "ArtistId";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "ArtistId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "Genre";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "Genre";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "GenreId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Name";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            primaryKeyColumn {
                name = "GenreId";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "GenreId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "MediaType";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "MediaType";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "MediaTypeId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Name";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            primaryKeyColumn {
                name = "MediaTypeId";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "MediaTypeId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "Track";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "Track";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "TrackId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Name";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "AlbumId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "MediaTypeId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "GenreId";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Composer";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Milliseconds";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "Bytes";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "UnitPrice";
                typeMapper = com.speedment.internal.core.config.mapper.identity.BigDecimalIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "TrackId";
                enabled = true;
            }
            index {
                name = "IFK_TrackAlbumId";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "AlbumId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "IFK_TrackGenreId";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "GenreId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "IFK_TrackMediaTypeId";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "MediaTypeId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "TrackId";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            foreignKey {
                name = "FK_TrackAlbumId";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "AlbumId";
                    foreignTableName = "Album";
                    name = "AlbumId";
                    enabled = true;
                }
            }
            foreignKey {
                name = "FK_TrackGenreId";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "GenreId";
                    foreignTableName = "Genre";
                    name = "GenreId";
                    enabled = true;
                }
            }
            foreignKey {
                name = "FK_TrackMediaTypeId";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "MediaTypeId";
                    foreignTableName = "MediaType";
                    name = "MediaTypeId";
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "schema_version";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "schema_version";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "version_rank";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "installed_rank";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "version";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "description";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "type";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "script";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "checksum";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = true;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "installed_by";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "installed_on";
                typeMapper = com.speedment.internal.core.config.mapper.identity.TimestampIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "execution_time";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "success";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "version";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "version";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "schema_version_ir_idx";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "installed_rank";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "schema_version_s_idx";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "success";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "schema_version_vr_idx";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "version_rank";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
    }
}