# ModifyEvents.BiomeCovers

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomeCovers(

ModifyEvent record for biome cover entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<CoverContainer.CoverContainerEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<CoverContainer.CoverContainerEntry> loader
