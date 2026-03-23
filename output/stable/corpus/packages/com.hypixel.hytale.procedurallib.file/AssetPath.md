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

Also in this package: AssetLoader, DefaultIOFileSystem, FileIO, FileIOSystem, PathArray, Provider

Complete API:
  public AssetPath rename(String filename)
  public Path path()
  public Path filepath()
  public String getFileName()
  public String toString()
  public int hashCode()
  public boolean equals(Object obj)
  public static AssetPath fromAbsolute(Path root, Path filepath)
  public static AssetPath fromRelative(Path root, Path assetPath)

Fields:
private final Path path
private final Path filepath
private final transient int hash
public static final Comparator<AssetPath> COMPARATOR
