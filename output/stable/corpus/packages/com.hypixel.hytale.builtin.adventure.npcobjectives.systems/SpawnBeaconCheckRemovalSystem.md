# SpawnBeaconCheckRemovalSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.systems | Extends: HolderSystem

public class SpawnBeaconCheckRemovalSystem extends HolderSystem

## Fields

- private final ComponentType<EntityStore,LegacySpawnBeaconEntity> legacySpawnBeaconEntityComponentType

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Also in this package: KillTrackerSystem

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> legacySpawnBeaconEntityComponentType
