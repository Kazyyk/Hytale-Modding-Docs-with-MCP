# HytaleWorldGenProvider

Type: class | Package: com.hypixel.hytale.server.worldgen | Implements: IWorldGenProvider

public class HytaleWorldGenProvider implements IWorldGenProvider

Provider supplying HytaleWorldGen values based on context.

## Constants

- public static final String ID
- public static final String DEFAULT_NAME
- public static final Semver MIN_VERSION

## Fields

- @Nonnull private String name
- @Nonnull private Semver version
- @Nullable private String path

## Methods

- @Nonnull public Semver getVersion()
- @Nonnull @Override public IWorldGen getGenerator()
- @Override public String toString()
