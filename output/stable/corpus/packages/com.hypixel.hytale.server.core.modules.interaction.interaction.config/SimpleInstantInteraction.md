# SimpleInstantInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Extends: SimpleInteraction

public abstract class SimpleInstantInteraction extends SimpleInteraction

Abstract interaction that executes its logic on the first tick only, then completes immediately.

## Constants

- BuilderCodec<SimpleInstantInteraction> CODEC

## Key Methods

- protected final void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected abstract void firstRun(@Nonnull InteractionType var1, @Nonnull InteractionContext var2, @Nonnull CooldownHandler var3)
- protected void simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public String toString()

Known subclasses: ApplyEffectInteraction, CameraShakeInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeStatBaseInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, ContextualUseNPCInteraction, CooldownConditionInteraction, DestroyBlockInteraction, EffectConditionInteraction, EquipItemInteraction, ExitInstanceInteraction, ExplodeInteraction, HubPortalInteraction, IncreaseBackpackCapacityInteraction, IncrementCooldownInteraction, InterruptInteraction, LaunchProjectileInteraction, LearnRecipeInteraction, ModifyInventoryInteraction, MountInteraction, OpenCustomUIInteraction, OpenItemStackContainerInteraction, OpenPageInteraction, PickupItemInteraction, PlacementCountConditionInteraction, PrefabSelectionInteraction, PrefabSetAnchorInteraction, ProjectileInteraction, RefillContainerInteraction, RemoveEntityInteraction, ResetCooldownInteraction, RunRootInteraction, SendMessageInteraction, SetMemoriesCapacityInteraction, SpawnDeployableAtHitLocationInteraction, SpawnDeployableFromRaycastInteraction, SpawnPrefabInteraction, StartObjectiveInteraction, StatsConditionBaseInteraction, TeleportInstanceInteraction, ToggleGliderInteraction, TriggerCooldownInteraction, TriggerSpawnMarkersInteraction, UseEntityInteraction, UseNPCInteraction

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInteraction

Complete API:
  protected final void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected abstract void firstRun(InteractionType var1, InteractionContext var2, CooldownHandler var3)
  protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<SimpleInstantInteraction> CODEC
