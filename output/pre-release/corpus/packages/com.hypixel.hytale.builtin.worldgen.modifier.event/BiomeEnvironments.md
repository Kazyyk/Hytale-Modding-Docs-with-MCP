# ModifyEvents.BiomeEnvironments

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomeEnvironments(

ModifyEvent record for biome environment entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<EnvironmentContainer.EnvironmentContainerEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<EnvironmentContainer.EnvironmentContainerEntry> loader
