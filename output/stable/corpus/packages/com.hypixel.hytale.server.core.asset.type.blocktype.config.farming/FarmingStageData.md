# FarmingStageData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming

public abstract class FarmingStageData

## Fields

- @Nonnull public static CodecMapCodec<FarmingStageData> CODEC
- protected Rangef duration
- @Nullable protected String soundEventId
- protected transient int soundEventIndex

## Methods

- @Nullable public Rangef getDuration()
- @Nullable public String getSoundEventId()
- public int getSoundEventIndex()
- public boolean implementsShouldStop()
- public boolean shouldStop(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)
- public void apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int x,
        int y,
        int z,
        @Nullable FarmingStageData previousStage)` |
| `public` | `void` | `remove(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
