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

Also in this package: AssetPackPrefabPath, PrefabCopyableComponent, PrefabLoadException, PrefabRotation, PrefabSaveException, PrefabStore, PrefabWeights, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  public boolean isFromBasePack()
  public boolean isFromAssetPack()
  public String getPackName()
  public String getFileName()
  public String getDisplayNameWithPack()
  private static String buildDisplayName(Path relativePath, AssetPack pack)
