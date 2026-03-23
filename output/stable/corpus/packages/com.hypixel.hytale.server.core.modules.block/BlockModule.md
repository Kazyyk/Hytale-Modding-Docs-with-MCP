# BlockModule

Type: class | Package: com.hypixel.hytale.server.core.modules.block | Extends: com.hypixel.hytale.server.core.plugin.JavaPlugin

public class BlockModule extends JavaPlugin

Server plugin responsible for block-level ECS components and systems. Registers `ChunkStore` component types for block state information, launch pads, respawn blocks, and block map markers. Also handles entity creation for block entities on chunk load and provides static utilities for looking up block components by world position.

## Fields

- MANIFEST | PluginManifest | Core plugin manifest; depends on `LegacyModule`.

## Methods

- get() | BlockModule | Returns the singleton instance.
- ensureBlockEntity(WorldChunk chunk, int x, int y, int z) | Ref<ChunkStore> | Deprecated. Ensures a block entity exists at the given position, creating one from the block type's definition if needed.
- getBlockEntity(World world, int x, int y, int z) | Ref<ChunkStore> | Returns the block entity reference at the given world coordinates, or null.
- getComponent(ComponentType<ChunkStore, T> componentType, World world, int x, int y, int z) | T | Returns a specific component from the block entity at the given world coordinates.
- getMigrationSystemType() | SystemType<ChunkStore, MigrationSystem> | Returns the migration system type.
- getBlockStateInfoComponentType() | ComponentType<ChunkStore, BlockStateInfo> | Returns the block state info component type.
- getLaunchPadComponentType() | ComponentType<ChunkStore, LaunchPad> | Returns the launch pad component type.
- getRespawnBlockComponentType() | ComponentType<ChunkStore, RespawnBlock> | Returns the respawn block component type.
- getBlockMapMarkerComponentType() | ComponentType<ChunkStore, BlockMapMarker> | Returns the block map marker component type.
- getBlockMapMarkersResourceType() | ResourceType<ChunkStore, BlockMapMarkersResource> | Returns the block map markers resource type.
- getBlockStateInfoNeedRebuildResourceType() | ResourceType<ChunkStore, BlockStateInfoNeedRebuild> | Returns the block state info rebuild resource type.

## Inner Classes

### BlockStateInfo


public static class BlockStateInfo implements Component<ChunkStore>

ECS component linking a block entity to its chunk position. Stores a block index and a reference to the parent chunk.

### BlockStateInfoNeedRebuild


public static class BlockStateInfoNeedRebuild implements Resource<ChunkStore>

ECS resource flag indicating whether block state info needs rebuilding. Provides `markAsNeedRebuild()` and `invalidateAndReturnIfNeedRebuild()`.

### BlockStateInfoRefSystem


public static class BlockStateInfoRefSystem extends RefSystem<ChunkStore>

ECS ref system that manages block entity references within `BlockComponentChunk` when entities are added or removed.

### MigrationSystem


public abstract static class MigrationSystem extends HolderSystem<ChunkStore>

Abstract base for block data migration systems.

### MigrateLaunchPad


@Deprecated(forRemoval = true)
public static class MigrateLaunchPad extends MigrationSystem

Deprecated migration system that moves legacy `launchPad` unknown component data into the typed `LaunchPad` component.

Also in this package: BlockStateInfo, BlockStateInfoNeedRebuild, BlockStateInfoRefSystem, MigrateLaunchPad, MigrationSystem

Complete API:
  public static BlockModule get()
  protected void setup()
  public static Ref<ChunkStore> ensureBlockEntity(WorldChunk chunk, int x, int y, int z)
  private static void onChunkPreLoadProcessEnsureBlockEntity(ChunkPreLoadProcessEvent event)
  public SystemType<ChunkStore,BlockModule.MigrationSystem> getMigrationSystemType()
  public ComponentType<ChunkStore,BlockModule.BlockStateInfo> getBlockStateInfoComponentType()
  public ComponentType<ChunkStore,LaunchPad> getLaunchPadComponentType()
  public ComponentType<ChunkStore,RespawnBlock> getRespawnBlockComponentType()
  public ComponentType<ChunkStore,BlockMapMarker> getBlockMapMarkerComponentType()
  public ResourceType<ChunkStore,BlockMapMarkersResource> getBlockMapMarkersResourceType()
  public ResourceType<ChunkStore,BlockModule.BlockStateInfoNeedRebuild> getBlockStateInfoNeedRebuildResourceType()
  public static Ref<ChunkStore> getBlockEntity(World world, int x, int y, int z)
  public static T getComponent(ComponentType<ChunkStore,T> componentType, World world, int x, int y, int z)

Fields:
public static final PluginManifest MANIFEST
private static BlockModule instance
private SystemType<ChunkStore,BlockModule.MigrationSystem> migrationSystemType
private ComponentType<ChunkStore,LaunchPad> launchPadComponentType
private ComponentType<ChunkStore,RespawnBlock> respawnBlockComponentType
private ComponentType<ChunkStore,BlockMapMarker> blockMapMarkerComponentType
private ResourceType<ChunkStore,BlockMapMarkersResource> blockMapMarkersResourceType
private ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
private ResourceType<ChunkStore,BlockModule.BlockStateInfoNeedRebuild> blockStateInfoNeedRebuildResourceType
