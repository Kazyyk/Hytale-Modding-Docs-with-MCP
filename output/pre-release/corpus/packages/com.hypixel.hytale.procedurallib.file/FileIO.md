# FileIO

Type: interface | Package: com.hypixel.hytale.procedurallib.file

public interface FileIO

## Methods

- static void setDefaultRoot(@Nonnull Path path)
- @Nonnull static <FS extends FileIOSystem> FS openFileIOSystem(@Nonnull FS fs)
- static void closeFileIOSystem(@Nonnull FileIOSystem fs)
- static boolean exists(@Nonnull AssetPath path)
- static boolean exists(@Nonnull Path root, @Nonnull Path path)
- @Nonnull static AssetPath resolve(@Nonnull Path path)
- @Nonnull static <T> T load(@Nonnull AssetPath assetPath, @Nonnull AssetLoader<T> loader)
- @Nonnull static <T> T load(@Nonnull Path path, @Nonnull AssetLoader<T> loader)
- @Nonnull static List<AssetPath> list(@Nonnull Path path, @Nonnull Predicate<AssetPath> matcher, @Nonnull UnaryOperator<AssetPath> disableOp)
- static boolean startsWith(Path path, Path prefix)
- static Path relativize(Path child, Path parent)
- static Path append(Path root, Path path)
- static boolean equals(@Nullable Path a, @Nullable Path b)
- static int hashCode(@Nullable Path path)

Also in this package: AssetLoader, AssetPath, DefaultIOFileSystem, FileIOSystem, PathArray, Provider

Complete API:
  static void setDefaultRoot(Path path)
  static FS openFileIOSystem(FS fs)
  static void closeFileIOSystem(FileIOSystem fs)
  static boolean exists(AssetPath path)
  static boolean exists(Path root, Path path)
  static AssetPath resolve(Path path)
  static T load(AssetPath assetPath, AssetLoader<T> loader)
  static T load(Path path, AssetLoader<T> loader)
  static List<AssetPath> list(Path path, Predicate<AssetPath> matcher, UnaryOperator<AssetPath> disableOp)
  static boolean startsWith(Path path, Path prefix)
  static Path relativize(Path child, Path parent)
  static Path append(Path root, Path path)
  static boolean equals(Path a, Path b)
  static int hashCode(Path path)

Fields:
Strategy<Path> PATH_STRATEGY
