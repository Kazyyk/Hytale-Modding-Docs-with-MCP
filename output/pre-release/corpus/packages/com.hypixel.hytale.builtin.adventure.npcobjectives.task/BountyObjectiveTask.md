# BountyObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.task | Extends: ObjectiveTask | Implements: KillTask

public class BountyObjectiveTask extends ObjectiveTask implements KillTask

Extends `ObjectiveTask` to provide BountyObjectiveTask functionality.

## Constants

- @Nonnull private static final HytaleLogger LOGGER

## Methods

- public BountyObjectiveTask(@Nonnull ObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected BountyObjectiveTask()
- @Nonnull public BountyObjectiveTaskAsset getAsset()
- @Nullable @Override protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- @Override public boolean checkCompletion()
- @Nonnull public static String getBountyMarkerIDFromUUID(@Nonnull UUID uuid)
- @Override public void checkKilledEntity(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef, @Nonnull Objective objective, @Nonnull NPCEntity npc, @Nonnull Damage damageInfo)
- @Nonnull public com.hypixel.hytale.protocol.ObjectiveTask toPacket(@Nonnull Objective objective)
- @Nonnull @Override public String toString()

Also in this package: KillNPCObjectiveTask, KillObjectiveTask, KillSpawnBeaconObjectiveTask, KillSpawnMarkerObjectiveTask, KillTask

Complete API:
  public BountyObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public boolean checkCompletion()
  public static String getBountyMarkerIDFromUUID(UUID uuid)
  public void checkKilledEntity(Store<EntityStore> store, Ref<EntityStore> npcRef, Objective objective, NPCEntity npc, Damage damageInfo)
  public com.hypixel.hytale.protocol.ObjectiveTask toPacket(Objective objective)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<BountyObjectiveTask> CODEC
boolean completed
UUID entityUuid
