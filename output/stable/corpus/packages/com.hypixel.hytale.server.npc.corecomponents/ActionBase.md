# ActionBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: AnnotatedComponentBase | Implements: Action

public abstract class ActionBase extends AnnotatedComponentBase implements Action

## Fields

- protected boolean once
- protected boolean triggered
- protected boolean active

## Constructors

- public ActionBase(@Nonnull BuilderActionBase builderActionBase)

## Methods

- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public void activate(Role role, InfoProvider infoProvider)
- @Override public void deactivate(Role role, InfoProvider infoProvider)
- @Override public boolean isActivated()
- @Override public boolean isTriggered()
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean processDelay(float dt)

Known subclasses: ActionAddToTargetMemory, ActionAppearance, ActionApplyEntityEffect, ActionAttack, ActionBeacon, ActionCombatAbility, ActionCrouch, ActionDelayDespawn, ActionDespawn, ActionDie, ActionDisplayName, ActionFlockBeacon, ActionFlockJoin, ActionFlockLeave, ActionFlockSetTarget, ActionFlockState, ActionIgnoreForAvoidance, ActionInventory, ActionLockOnInteractionTarget, ActionLog, ActionMakePath, ActionModelAttachment, ActionMount, ActionNothing, ActionNotify, ActionOpenBarterShop, ActionOpenShop, ActionOverrideAltitude, ActionOverrideAttitude, ActionParentState, ActionPlaceBlock, ActionPlayAnimation, ActionPlaySound, ActionRandom, ActionRecomputePath, ActionReleaseTarget, ActionRemove, ActionResetBlockSensors, ActionResetInstructions, ActionResetPath, ActionResetSearchRays, ActionRole, ActionSequence, ActionSetAlarm, ActionSetBlockToPlace, ActionSetFlag, ActionSetInteractable, ActionSetLeashPosition, ActionSetMarkedTarget, ActionSetStat, ActionSpawn, ActionSpawnParticles, ActionStartObjective, ActionState, ActionStorePosition, ActionTest, ActionTimer, ActionToggleStateEvaluator, ActionTriggerSpawnBeacon, ActionTriggerSpawners, ActionWithDelay

Also in this package: ActionWithDelay, AnnotatedComponentBase, BlockTarget, BodyMotionBase, EntityFilterBase, HeadMotionBase, IEntityFilter, ISensorEntityCollector, ISensorEntityPrioritiser, MotionBase, SensorBase, SensorWithEntityFilters, WeightedAction

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void activate(Role role, InfoProvider infoProvider)
  public void deactivate(Role role, InfoProvider infoProvider)
  public boolean isActivated()
  public boolean isTriggered()
  public void clearOnce()
  public void setOnce()
  public boolean processDelay(float dt)

Fields:
protected boolean once
protected boolean triggered
protected boolean active
