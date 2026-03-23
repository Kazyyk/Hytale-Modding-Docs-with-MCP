# KillSpawnMarkerObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task | Extends: KillObjectiveTask

public class KillSpawnMarkerObjectiveTask extends KillObjectiveTask

Extends `KillObjectiveTask` to provide KillSpawnMarkerObjectiveTask functionality.

## Constants

- private static final ComponentType<EntityStore, SpawnMarkerEntity> SPAWN_MARKER_COMPONENT_TYPE
- @Nonnull private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE

## Methods

- public KillSpawnMarkerObjectiveTask(@Nonnull KillSpawnMarkerObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected KillSpawnMarkerObjectiveTask()
- @Nonnull public KillSpawnMarkerObjectiveTaskAsset getAsset()
- @Nonnull @Override protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- @Nonnull @Override public String toString()

Also in this package: BountyObjectiveTask, KillNPCObjectiveTask, KillObjectiveTask, KillSpawnBeaconObjectiveTask, KillTask

Complete API:
  public KillSpawnMarkerObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<KillSpawnMarkerObjectiveTask> CODEC
private static final ComponentType<EntityStore,SpawnMarkerEntity> SPAWN_MARKER_COMPONENT_TYPE
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
