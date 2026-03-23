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
