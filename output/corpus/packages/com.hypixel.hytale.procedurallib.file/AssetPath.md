# AssetPath

Type: class | Package: com.hypixel.hytale.procedurallib.file

public final class AssetPath

## Fields

- private final Path path
- private final Path filepath
- private final transient int hash

## Constructors

- private AssetPath(@Nonnull Path path, @Nonnull Path filepath)

## Methods

- @Nonnull public AssetPath rename(@Nonnull String filename)
- @Nonnull public Path path()
- @Nonnull public Path filepath()
- @Nonnull public String getFileName()
- @Override public String toString()
- @Override public int hashCode()
- @Override public boolean equals(Object obj)
- public static AssetPath fromAbsolute(@Nonnull Path root, @Nonnull Path filepath)
- public static AssetPath fromRelative(@Nonnull Path root, @Nonnull Path assetPath)
