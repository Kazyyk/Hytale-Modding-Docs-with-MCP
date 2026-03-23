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

Also in this package: ChunkColumnMigrationSystem, ChunkSectionMigrationSystem, EntityMigration, Migration

Complete API:
  public static MigrationModule get()
  protected void setup()
  public SystemType<ChunkStore,ChunkColumnMigrationSystem> getChunkColumnMigrationSystem()
  public SystemType<ChunkStore,ChunkSectionMigrationSystem> getChunkSectionMigrationSystem()
  public void register(String id, Function<Path,Migration> migration)
  public void runMigrations()

Fields:
public static final PluginManifest MANIFEST
protected static MigrationModule instance
private final Map<String,Function<Path,Migration>> migrationCtors
private SystemType<ChunkStore,ChunkColumnMigrationSystem> chunkColumnMigrationSystem
private SystemType<ChunkStore,ChunkSectionMigrationSystem> chunkSectionMigrationSystem
