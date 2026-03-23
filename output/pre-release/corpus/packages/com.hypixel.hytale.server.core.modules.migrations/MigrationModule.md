# MigrationModule

Type: class | Package: com.hypixel.hytale.server.core.modules.migrations | Extends: JavaPlugin

public class MigrationModule extends JavaPlugin

Server module providing modules functionality.

## Fields

- instance | MigrationModule | Static MigrationModule field.
- chunkColumnMigrationSystem | SystemType<ChunkStore, ChunkColumnMigrationSystem> | SystemType<ChunkStore, ChunkColumnMigrationSystem> field.
- chunkSectionMigrationSystem | SystemType<ChunkStore, ChunkSectionMigrationSystem> | SystemType<ChunkStore, ChunkSectionMigrationSystem> field.

## Constructors

- MigrationModule(@Nonnull JavaPluginInit init) | Creates a new MigrationModule instance.

## Methods

- get() | MigrationModule | static public method.
- setup() | void | protected method.
- getChunkColumnMigrationSystem() | SystemType<ChunkStore, ChunkColumnMigrationSystem> | public method.
- getChunkSectionMigrationSystem() | SystemType<ChunkStore, ChunkSectionMigrationSystem> | public method.
- register(String id, Function<Path, Migration> migration) | void | public method.
- runMigrations() | void | public method.
