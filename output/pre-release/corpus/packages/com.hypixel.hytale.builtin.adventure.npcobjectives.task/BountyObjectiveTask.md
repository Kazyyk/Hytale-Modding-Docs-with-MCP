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
