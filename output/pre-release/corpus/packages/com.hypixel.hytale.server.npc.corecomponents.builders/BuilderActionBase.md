# BuilderActionBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<Action>

public abstract class BuilderActionBase extends BuilderBase<Action>

## Fields

- protected boolean once

## Methods

- @Override public boolean canRequireFeature()
- @Nonnull @Override public Builder<Action> readCommonConfig(@Nonnull JsonElement data)
- @Nonnull @Override public final Class<Action> category()
- @Override public final boolean isEnabled(ExecutionContext context)
- public boolean isOnce()

Known subclasses: BuilderActionAddToTargetMemory, BuilderActionAppearance, BuilderActionApplyEntityEffect, BuilderActionAttack, BuilderActionBeacon, BuilderActionCombatAbility, BuilderActionCrouch, BuilderActionDelayDespawn, BuilderActionDespawn, BuilderActionDie, BuilderActionDisplayName, BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderActionFlockState, BuilderActionIgnoreForAvoidance, BuilderActionInventory, BuilderActionLockOnInteractionTarget, BuilderActionLog, BuilderActionMakePath, BuilderActionModelAttachment, BuilderActionMount, BuilderActionNothing, BuilderActionNotify, BuilderActionOpenBarterShop, BuilderActionOpenShop, BuilderActionOverrideAltitude, BuilderActionOverrideAttitude, BuilderActionParentState, BuilderActionPlaceBlock, BuilderActionPlayAnimation, BuilderActionPlaySound, BuilderActionRandom, BuilderActionRecomputePath, BuilderActionReleaseTarget, BuilderActionRemove, BuilderActionResetBlockSensors, BuilderActionResetInstructions, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionRole, BuilderActionSequence, BuilderActionSetAlarm, BuilderActionSetBlockToPlace, BuilderActionSetFlag, BuilderActionSetInteractable, BuilderActionSetLeashPosition, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderActionSpawn, BuilderActionSpawnParticles, BuilderActionStartObjective, BuilderActionState, BuilderActionStorePosition, BuilderActionTest, BuilderActionTimer, BuilderActionToggleStateEvaluator, BuilderActionTriggerSpawnBeacon, BuilderActionTriggerSpawners, BuilderActionWithDelay

Also in this package: BuilderActionWithDelay, BuilderBodyMotionBase, BuilderEntityFilterBase, BuilderEntityFilterWithToggle, BuilderHeadMotionBase, BuilderMotionBase, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderSensorWithEntityFilters, BuilderWeightedAction

Complete API:
  public boolean canRequireFeature()
  public Builder<Action> readCommonConfig(JsonElement data)
  public final Class<Action> category()
  public final boolean isEnabled(ExecutionContext context)
  public boolean isOnce()

Fields:
protected boolean once
protected final BooleanHolder enabled
