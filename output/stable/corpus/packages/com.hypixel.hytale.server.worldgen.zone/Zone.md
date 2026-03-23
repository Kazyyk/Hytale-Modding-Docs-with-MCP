# Zone

Type: record | Package: com.hypixel.hytale.server.worldgen.zone

public record Zone( int id, @Nonnull String name, @Nonnull ZoneDiscoveryConfig discoveryConfig, @Nullable CaveGenerator caveGenerator, @Nonnull BiomePatternGenerator biomePatternGenerator, @Nonnull UniquePrefabContainer uniquePrefabContainer )

## Record Components

- int id
- String name
- ZoneDiscoveryConfig discoveryConfig
- CaveGenerator caveGenerator
- BiomePatternGenerator biomePatternGenerator
- UniquePrefabContainer uniquePrefabContainer

## Methods

- @Override public int hashCode()
- @Nonnull @Override public String toString()

## Inner Types

- `Zone.Unique`
- `Zone.UniqueCandidate`
- `Zone.UniqueEntry`
