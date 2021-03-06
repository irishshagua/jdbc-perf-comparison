package com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema;

import com.speedment.internal.core.runtime.ApplicationMetadata;
import javax.annotation.Generated;

/**
 * A {@link com.speedment.internal.core.runtime.ApplicationMetadata} class
 * for the {@link com.speedment.config.Project} named perfTestChinookSchema.
 * This class contains the meta data present at code generation time.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class PerfTestChinookSchemaApplicationMetadata implements ApplicationMetadata {
    
    private final static StringBuilder METADATA = new StringBuilder();
    
    static {
        METADATA.append("import com.speedment.config.parameters.*\n");
        METADATA.append("\n");
        METADATA.append("name = \"perfTestChinookSchema\";\n");
        METADATA.append("packageLocation = \"src/main/java\";\n");
        METADATA.append("packageName = \"com.mooneyserver.jdbc_perf.speedment.generated\";\n");
        METADATA.append("enabled = true;\n");
        METADATA.append("dbms {\n");
        METADATA.append("    ipAddress = \"127.0.0.1\";\n");
        METADATA.append("    name = \"perfTestChinookSchema\";\n");
        METADATA.append("    port = 3306;\n");
        METADATA.append("    typeName = \"MySQL\";\n");
        METADATA.append("    username = \"root\";\n");
        METADATA.append("    enabled = true;\n");
        METADATA.append("    schema {\n");
        METADATA.append("        catalogName = \"perfTestChinookSchema\";\n");
        METADATA.append("        columnCompressionType = ColumnCompressionType.NONE;\n");
        METADATA.append("        fieldStorageType = FieldStorageType.WRAPPER;\n");
        METADATA.append("        name = \"perfTestChinookSchema\";\n");
        METADATA.append("        schemaName = \"perfTestChinookSchema\";\n");
        METADATA.append("        storageEngineType = StorageEngineType.ON_HEAP;\n");
        METADATA.append("        defaultSchema = false;\n");
        METADATA.append("        enabled = true;\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"Album\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"Album\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"AlbumId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Title\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"ArtistId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"AlbumId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"IFK_AlbumArtistId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"ArtistId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"AlbumId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            foreignKey {\n");
        METADATA.append("                name = \"FK_AlbumArtistId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                foreignKeyColumn {\n");
        METADATA.append("                    foreignColumnName = \"ArtistId\";\n");
        METADATA.append("                    foreignTableName = \"Artist\";\n");
        METADATA.append("                    name = \"ArtistId\";\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"Artist\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"Artist\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"ArtistId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Name\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"ArtistId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"ArtistId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"Genre\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"Genre\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"GenreId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Name\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"GenreId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"GenreId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"MediaType\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"MediaType\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"MediaTypeId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Name\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"MediaTypeId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"MediaTypeId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"Track\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"Track\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"TrackId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Name\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"AlbumId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"MediaTypeId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"GenreId\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Composer\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Milliseconds\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"Bytes\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"UnitPrice\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.BigDecimalIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"TrackId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"IFK_TrackAlbumId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"AlbumId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"IFK_TrackGenreId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"GenreId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"IFK_TrackMediaTypeId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"MediaTypeId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"TrackId\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            foreignKey {\n");
        METADATA.append("                name = \"FK_TrackAlbumId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                foreignKeyColumn {\n");
        METADATA.append("                    foreignColumnName = \"AlbumId\";\n");
        METADATA.append("                    foreignTableName = \"Album\";\n");
        METADATA.append("                    name = \"AlbumId\";\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            foreignKey {\n");
        METADATA.append("                name = \"FK_TrackGenreId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                foreignKeyColumn {\n");
        METADATA.append("                    foreignColumnName = \"GenreId\";\n");
        METADATA.append("                    foreignTableName = \"Genre\";\n");
        METADATA.append("                    name = \"GenreId\";\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            foreignKey {\n");
        METADATA.append("                name = \"FK_TrackMediaTypeId\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                foreignKeyColumn {\n");
        METADATA.append("                    foreignColumnName = \"MediaTypeId\";\n");
        METADATA.append("                    foreignTableName = \"MediaType\";\n");
        METADATA.append("                    name = \"MediaTypeId\";\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("        table {\n");
        METADATA.append("            columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("            fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("            name = \"schema_version\";\n");
        METADATA.append("            storageEngineType = StorageEngineType.INHERIT;\n");
        METADATA.append("            tableName = \"schema_version\";\n");
        METADATA.append("            enabled = true;\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"version_rank\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"installed_rank\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"version\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"description\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"type\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"script\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"checksum\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"installed_by\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"installed_on\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.TimestampIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"execution_time\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            column {\n");
        METADATA.append("                columnCompressionType = ColumnCompressionType.INHERIT;\n");
        METADATA.append("                fieldStorageType = FieldStorageType.INHERIT;\n");
        METADATA.append("                name = \"success\";\n");
        METADATA.append("                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;\n");
        METADATA.append("                autoincrement = false;\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                nullable = false;\n");
        METADATA.append("            }\n");
        METADATA.append("            primaryKeyColumn {\n");
        METADATA.append("                name = \"version\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"PRIMARY\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = true;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"version\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"schema_version_ir_idx\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"installed_rank\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"schema_version_s_idx\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"success\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("            index {\n");
        METADATA.append("                name = \"schema_version_vr_idx\";\n");
        METADATA.append("                enabled = true;\n");
        METADATA.append("                unique = false;\n");
        METADATA.append("                indexColumn {\n");
        METADATA.append("                    name = \"version_rank\";\n");
        METADATA.append("                    orderType = OrderType.ASC;\n");
        METADATA.append("                    enabled = true;\n");
        METADATA.append("                }\n");
        METADATA.append("            }\n");
        METADATA.append("        }\n");
        METADATA.append("    }\n");
        METADATA.append("}\n");
    }
    
    @Override
    public String getMetadata() {
        return METADATA.toString();
    }
}