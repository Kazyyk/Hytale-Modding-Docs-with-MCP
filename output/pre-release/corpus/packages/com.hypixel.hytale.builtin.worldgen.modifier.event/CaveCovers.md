# ModifyEvents.CaveCovers

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record CaveCovers(

ModifyEvent record for cave cover entries.

## Record Components


@Nonnull CaveFileContext file,
        @Nonnull List<CaveNodeType.CaveNodeCoverEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<CaveNodeType.CaveNodeCoverEntry> loader
