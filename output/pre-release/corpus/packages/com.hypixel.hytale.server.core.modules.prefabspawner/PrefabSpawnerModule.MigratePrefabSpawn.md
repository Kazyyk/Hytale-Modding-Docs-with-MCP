# PrefabSpawnerModule.MigratePrefabSpawn

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner | Extends: BlockModule.MigrationSystem

public static class PrefabSpawnerModule.MigratePrefabSpawn extends BlockModule.MigrationSystem

Migration system that moves legacy prefab spawner data from unknown components to the typed `PrefabSpawnerBlock` component. Queries entities with unknown components and extracts `"prefabspawner"` data using the `PrefabSpawnerBlock.CODEC`.

## Methods

- void onEntityAdd(@Nonnull Holder<ChunkStore> holder, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store)
- void onEntityRemoved(@Nonnull Holder<ChunkStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store)
- @Nullable Query<ChunkStore> getQuery()

## See Also

- PrefabSpawnerModule

Also in this package: PrefabSpawnerBlock, PrefabSpawnerModule, PrefabSpawnerSettingsPage, PrefabSpawnerSettingsPageEventData

Complete API:
  public void onEntityAdd(Holder<ChunkStore> holder, AddReason reason, Store<ChunkStore> store)
  public void onEntityRemoved(Holder<ChunkStore> holder, RemoveReason reason, Store<ChunkStore> store)
  public Query<ChunkStore> getQuery()
