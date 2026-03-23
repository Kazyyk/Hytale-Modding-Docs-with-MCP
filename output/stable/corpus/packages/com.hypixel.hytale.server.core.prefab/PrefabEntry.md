# PrefabEntry

Type: record | Package: com.hypixel.hytale.server.core.prefab

public record PrefabEntry(@Nonnull Path path, @Nonnull Path relativePath, @Nullable AssetPack pack, @Nonnull String displayName)

Record representing a reference to a prefab file on disk. Tracks the absolute path, relative path within the prefab directory, the owning `AssetPack` (nullable for server prefabs), and a display name. Provides utility methods to determine source (base pack vs. mod pack vs. server) and format display names.

## Methods

- public boolean isFromBasePack()
- public boolean isFromAssetPack()
- @Nonnull public String getPackName()
- @Nonnull public String getFileName()
- @Nonnull public String getDisplayNameWithPack()
