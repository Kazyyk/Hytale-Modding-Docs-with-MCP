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
