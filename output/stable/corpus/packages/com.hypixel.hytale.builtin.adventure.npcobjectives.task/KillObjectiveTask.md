# KillObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task | Extends: CountObjectiveTask | Implements: KillTask

public abstract class KillObjectiveTask extends CountObjectiveTask implements KillTask

Abstract base class extending `CountObjectiveTask` that provides shared logic for KillObjectiveTask subclasses.

## Constants

- @Nonnull public static final BuilderCodec<KillObjectiveTask> CODEC

## Methods

- public KillObjectiveTask(@Nonnull KillObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected KillObjectiveTask()
- @Nonnull public KillObjectiveTaskAsset getAsset()
- @Override public void checkKilledEntity(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef, @Nonnull Objective objective, @Nonnull NPCEntity npc, @Nonnull Damage info)

Known subclasses: KillNPCObjectiveTask, KillSpawnBeaconObjectiveTask, KillSpawnMarkerObjectiveTask

Also in this package: BountyObjectiveTask, KillNPCObjectiveTask, KillSpawnBeaconObjectiveTask, KillSpawnMarkerObjectiveTask, KillTask

Complete API:
  public KillObjectiveTaskAsset getAsset()
  public void checkKilledEntity(Store<EntityStore> store, Ref<EntityStore> npcRef, Objective objective, NPCEntity npc, Damage info)

Fields:
public static final BuilderCodec<KillObjectiveTask> CODEC
