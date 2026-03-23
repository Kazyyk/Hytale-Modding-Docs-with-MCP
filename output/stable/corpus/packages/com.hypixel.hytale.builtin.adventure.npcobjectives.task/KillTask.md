# KillTask

Type: interface | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task

public interface KillTask

Defines the contract for KillTask operations. Implemented by objective tasks that track NPC kills for quest completion.

## Methods

- void checkKilledEntity(@Nonnull Store<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Objective var3, @Nonnull NPCEntity var4, @Nonnull Damage var5)

Known implementors: BountyObjectiveTask, KillObjectiveTask

Also in this package: BountyObjectiveTask, KillNPCObjectiveTask, KillObjectiveTask, KillSpawnBeaconObjectiveTask, KillSpawnMarkerObjectiveTask

Complete API:
  void checkKilledEntity(Store<EntityStore> var1, Ref<EntityStore> var2, Objective var3, NPCEntity var4, Damage var5)
