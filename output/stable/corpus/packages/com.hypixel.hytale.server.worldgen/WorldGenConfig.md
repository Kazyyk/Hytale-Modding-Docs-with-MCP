# WorldGenConfig

Type: record | Package: com.hypixel.hytale.server.worldgen

public record WorldGenConfig(@Nonnull Path path, @Nonnull String name, @Nonnull Semver version)

An immutable record holding `path`, `name`, `version`.

## Components

- @Nonnull Path path
- @Nonnull String name
- @Nonnull Semver version

## Methods

- public record WorldGenConfig(@Nonnull Path path, @Nonnull String name, @Nonnull Semver version)
- public WorldGenConfig withOverride(@Nonnull Path path)

Also in this package: BiomeDataSystem, ChunkGeneratorResource, HytaleWorldGenProvider, SeedStringResource, WorldGenBuilderCodec, WorldGenConstants

Complete API:
  public WorldGenConfig withOverride(Path path)
