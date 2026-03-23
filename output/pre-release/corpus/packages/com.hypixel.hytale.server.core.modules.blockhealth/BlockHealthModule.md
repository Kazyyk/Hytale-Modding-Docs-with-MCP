# BlockHealthModule

Type: class | Package: com.hypixel.hytale.server.core.modules.blockhealth | Extends: JavaPlugin

public class BlockHealthModule extends JavaPlugin

Core plugin that manages block health, damage, repair, and fragility. Registers the BlockHealthChunk component and four ECS systems:

- **EnsureBlockHealthSystem** -- ensures every `WorldChunk` has a `BlockHealthChunk` component on creation.
- **BlockHealthSystem** -- ticks each chunk to decrement fragile block timers and regenerate damaged block health (0.1 HP/second after a 5-second delay since last damage).
- **BlockHealthPacketSystem** -- generates `UpdateBlockDamage` packets for player chunk loading.
- **PlaceBlockEventSystem** -- listens for `PlaceBlockEvent` and marks placed blocks as fragile per `WorldConfig.getBlockPlacementFragilityTimer()`.

## Fields

- @Nonnull public static final PluginManifest MANIFEST

## Methods

- public static BlockHealthModule get()
- public BlockHealthModule(@Nonnull JavaPluginInit init)
- protected void setup()
- public ComponentType<ChunkStore, BlockHealthChunk> getBlockHealthChunkComponentType()

## Related Types

- BlockHealthChunk -- per-chunk health tracking component
- BlockHealth -- per-block health state
- FragileBlock -- per-block fragility timer

Also in this package: BlockHealth, BlockHealthChunk, BlockHealthPacketSystem, BlockHealthSystem, EnsureBlockHealthSystem, FragileBlock, PlaceBlockEventSystem

Complete API:
  public static BlockHealthModule get()
  protected void setup()
  public ComponentType<ChunkStore,BlockHealthChunk> getBlockHealthChunkComponentType()

Fields:
public static final PluginManifest MANIFEST
private static final long SECONDS_UNTIL_REGENERATION
private static final float HEALING_PER_SECOND
private static BlockHealthModule instance
private ComponentType<ChunkStore,BlockHealthChunk> blockHealthChunkComponentType
