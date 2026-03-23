# PrefabRootDirectory

Type: enum | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.enums

public enum PrefabRootDirectory

Enumerates PrefabRootDirectory values: `SERVER`, `ASSET`, `WORLDGEN`, `ASSET_ROOT`.

## Enum Constants

- SERVER
- ASSET
- WORLDGEN
- ASSET_ROOT

## Fields

- private final Supplier<Path> prefabPath
- private final String localizationString
- private final boolean supportsMultiPack

## Methods

- public Path getPrefabPath()
- public String getLocalizationString()
- public boolean supportsMultiPack()
- @Nonnull public List<PrefabStore.AssetPackPrefabPath> getAllPrefabPaths()

Also in this package: PrefabAlignment, PrefabRowSplitMode, PrefabStackingAxis, WorldGenType

Complete API:
  public Path getPrefabPath()
  public String getLocalizationString()
  public boolean supportsMultiPack()
  public List<PrefabStore.AssetPackPrefabPath> getAllPrefabPaths()

Fields:
private final Supplier<Path> prefabPath
private final String localizationString
private final boolean supportsMultiPack
