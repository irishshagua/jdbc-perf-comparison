/*************************************
 * 
 * SQL Schema provided by:
 * https://chinookdatabase.codeplex.com/
 * 
 *************************************/

CREATE TABLE `Album`
(
    `AlbumId` INT NOT NULL,
    `Title` NVARCHAR(160) NOT NULL,
    `ArtistId` INT NOT NULL,
    CONSTRAINT `PK_Album` PRIMARY KEY  (`AlbumId`)
);

CREATE TABLE `Artist`
(
    `ArtistId` INT NOT NULL,
    `Name` NVARCHAR(120),
    CONSTRAINT `PK_Artist` PRIMARY KEY  (`ArtistId`)
);

CREATE TABLE `Genre`
(
    `GenreId` INT NOT NULL,
    `Name` NVARCHAR(120),
    CONSTRAINT `PK_Genre` PRIMARY KEY  (`GenreId`)
);

CREATE TABLE `MediaType`
(
    `MediaTypeId` INT NOT NULL,
    `Name` NVARCHAR(120),
    CONSTRAINT `PK_MediaType` PRIMARY KEY  (`MediaTypeId`)
);

CREATE TABLE `Track`
(
    `TrackId` INT NOT NULL,
    `Name` NVARCHAR(200) NOT NULL,
    `AlbumId` INT,
    `MediaTypeId` INT NOT NULL,
    `GenreId` INT,
    `Composer` NVARCHAR(220),
    `Milliseconds` INT NOT NULL,
    `Bytes` INT,
    `UnitPrice` NUMERIC(10,2) NOT NULL,
    CONSTRAINT `PK_Track` PRIMARY KEY  (`TrackId`)
);
