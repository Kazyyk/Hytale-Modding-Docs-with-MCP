# ModifyEvents.CavePrefabs

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record CavePrefabs(

ModifyEvent record for cave prefab entries.

## Record Components


@Nonnull CaveFileContext file,
        @Nonnull List<CavePrefabContainer.CavePrefabEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<CavePrefabContainer.CavePrefabEntry> loader
