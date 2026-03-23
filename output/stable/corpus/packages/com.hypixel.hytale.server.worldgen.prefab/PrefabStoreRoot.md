# PrefabStoreRoot

Type: enum | Package: com.hypixel.hytale.server.worldgen.prefab

public enum PrefabStoreRoot

Enumerates the root directories for prefab storage: `ASSETS` (from the asset prefabs path) and `WORLD_GEN` (from the data folder Prefabs directory).

## Constants

- ASSETS | Asset prefabs path
- WORLD_GEN | Data folder Prefabs directory

## Fields

- public static final | PrefabStoreRoot | DEFAULT | Default root (WORLD_GEN)

## Methods

- public static Path resolvePrefabStore(PrefabStoreRoot store, Path dataFolder)

Also in this package: PrefabCategory, PrefabLoadingCache, PrefabPasteBuffer, PrefabPasteUtil, PrefabPatternGenerator

Complete API:
  public static Path resolvePrefabStore(PrefabStoreRoot store, Path dataFolder)

Fields:
public static final PrefabStoreRoot DEFAULT
