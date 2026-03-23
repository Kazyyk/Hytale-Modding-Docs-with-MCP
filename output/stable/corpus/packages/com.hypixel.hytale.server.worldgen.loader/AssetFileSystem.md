# AssetFileSystem

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: null | Implements: FileIOSystem

public class AssetFileSystem implements FileIOSystem

## Fields

- private static final Strategy<Path> PATH_STRATEGY
- private final Path root
- private final FileIOSystem.PathArray packRoots
- private final List<AssetPack> packs
- private final Object2ObjectMap<Path, AssetPath> files
- private final Object2ObjectMap<AssetPath, AssetFileSystem.Resource<?>> resources
- Path root
- Path assetPath
- Path relPath
- AssetPath assetPath
- AssetFileSystem.Resource<?> resource
- T value
- AssetModule assets
- Path versionsDir
- List<AssetPack> allPacks
- ObjectArrayList<AssetPack> packs
- AssetPack pack
- Path[] roots

## Constructors

- public AssetFileSystem(@Nonnull WorldGenConfig config)

## Methods

- public int hashCode(Path o)
- public boolean equals(Path a, Path b)
- public Path baseRoot()
- public FileIOSystem.PathArray roots()
- public AssetPath resolve(@Nonnull Path path)
- public <T> T load(@Nonnull AssetPath path, @Nonnull AssetLoader<T> loader)
- throw new IllegalStateException("Resource type mismatch: expected " + loader.type()
- public void close()
- public List<AssetPack> packs()
- public static List<AssetPack> getAssetPacks(@Nonnull WorldGenConfig config, @Nonnull Predicate<Path> filter)
- public static Path[] getAssetRoots(@Nonnull List<AssetPack> packs)

## Inner Types

- `AssetFileSystem.Resource`
