# KillSpawnBeaconObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task | Extends: KillObjectiveTask

public class KillSpawnBeaconObjectiveTask extends KillObjectiveTask

Extends `KillObjectiveTask` to provide KillSpawnBeaconObjectiveTask functionality.

## Methods

- public KillSpawnBeaconObjectiveTask(@Nonnull KillSpawnBeaconObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected KillSpawnBeaconObjectiveTask()
- @Nonnull public KillSpawnBeaconObjectiveTaskAsset getAsset()
- @Nonnull @Override protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- @Nonnull private TransactionRecord[] setupSpawnBeacons(@Nonnull Objective objective, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull @Override public String toString()

Also in this package: BountyObjectiveTask, KillNPCObjectiveTask, KillObjectiveTask, KillSpawnMarkerObjectiveTask, KillTask

Complete API:
  public KillSpawnBeaconObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  private TransactionRecord[] setupSpawnBeacons(Objective objective, World world, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()

Fields:
public static final BuilderCodec<KillSpawnBeaconObjectiveTask> CODEC
