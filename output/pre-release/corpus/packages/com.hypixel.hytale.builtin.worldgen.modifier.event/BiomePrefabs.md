# ModifyEvents.BiomePrefabs

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomePrefabs(

ModifyEvent record for biome prefab entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<PrefabContainer.PrefabContainerEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<PrefabContainer.PrefabContainerEntry> loader
