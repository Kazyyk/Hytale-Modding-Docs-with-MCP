# BlockHealthChunk

Type: class | Package: com.hypixel.hytale.server.core.modules.blockhealth | Implements: Component<ChunkStore>

public class BlockHealthChunk implements Component<ChunkStore>

A `ChunkStore` component that tracks per-block health and fragility within a chunk. Maintains two maps keyed by `Vector3i` block position: one for BlockHealth damage state and one for FragileBlock fragility timers.

Provides methods to damage blocks (reducing health and sending network updates), repair blocks (increasing health), remove block health tracking, and mark blocks as fragile. Serialized as versioned binary data (version 2 adds fragility support).

## Fields

- public static final BuilderCodec<BlockHealthChunk> CODEC

## Methods

- public Instant getLastRepairGameTime()
- public void setLastRepairGameTime(Instant lastRepairGameTime)
- @Nonnull public Map<Vector3i, BlockHealth> getBlockHealthMap()
- @Nonnull public Map<Vector3i, FragileBlock> getBlockFragilityMap()
- @Nonnull public BlockHealth damageBlock(Instant currentUptime, @Nonnull World world, @Nonnull Vector3i block, float health)
- @Nonnull public BlockHealth repairBlock(@Nonnull World world, @Nonnull Vector3i block, float progress)
- public void removeBlock(@Nonnull World world, @Nonnull Vector3i block)
- public void makeBlockFragile(Vector3i blockLocation, float fragileDuration)
- public boolean isBlockFragile(Vector3i block)
- public float getBlockHealth(Vector3i block)
- public void createBlockDamagePackets(@Nonnull List<ToClientPacket> list)
- @Nonnull public BlockHealthChunk clone()
