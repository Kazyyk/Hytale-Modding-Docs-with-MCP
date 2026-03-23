# PrefabSpawnerModule

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner | Extends: JavaPlugin

public class PrefabSpawnerModule extends JavaPlugin

Core plugin module that manages prefab spawner blocks. Registers the `PrefabSpawnerBlock` component type on the chunk store, the `PrefabSpawnerCommand`, and a migration system for legacy prefab spawner data.

## Static Methods

- static PrefabSpawnerModule get()

## Methods

- ComponentType<ChunkStore, PrefabSpawnerBlock> getPrefabSpawnerBlockType()

## Inner Types

- PrefabSpawnerModule.MigratePrefabSpawn -- migration system for legacy data

Also in this package: MigratePrefabSpawn, PrefabSpawnerBlock, PrefabSpawnerSettingsPage, PrefabSpawnerSettingsPageEventData

Complete API:
  public static PrefabSpawnerModule get()
  protected void setup()
  public ComponentType<ChunkStore,PrefabSpawnerBlock> getPrefabSpawnerBlockType()

Fields:
public static final PluginManifest MANIFEST
private static PrefabSpawnerModule INSTANCE
private ComponentType<ChunkStore,PrefabSpawnerBlock> prefabSpawnerBlockType
