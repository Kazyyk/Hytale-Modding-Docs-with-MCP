# KillNPCObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task | Extends: KillObjectiveTask

public class KillNPCObjectiveTask extends KillObjectiveTask

Extends `KillObjectiveTask` to provide KillNPCObjectiveTask functionality.

## Methods

- public KillNPCObjectiveTask(@Nonnull KillObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected KillNPCObjectiveTask()
- @Nonnull @Override protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- @Nonnull @Override public String toString()

Also in this package: BountyObjectiveTask, KillObjectiveTask, KillSpawnBeaconObjectiveTask, KillSpawnMarkerObjectiveTask, KillTask

Complete API:
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<KillNPCObjectiveTask> CODEC
