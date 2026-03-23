# SimpleInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Extends: Interaction

public class SimpleInteraction extends Interaction

Basic interaction with optional next/failed branching. Extends Interaction with compile-time operation graph construction.

## Constants

- BuilderCodec<SimpleInteraction> CODEC

## Key Methods

- public WaitForDataFrom getWaitForDataFrom()
- protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public void compile(@Nonnull OperationsBuilder builder)
- public boolean walk(@Nonnull Collector collector, @Nonnull InteractionContext context)
- protected com.hypixel.hytale.protocol.Interaction generatePacket()
- protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
- public boolean needsRemoteSync()
- public String toString()

Known subclasses: ApplyEffectInteraction, ApplyForceInteraction, ApplyForceInteraction, BuilderToolInteraction, BuilderToolInteraction, CameraInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeStatInteraction, ClearEntityEffectInteraction, ConditionInteraction, ConditionInteraction, CooldownConditionInteraction, EffectConditionInteraction, IncrementCooldownInteraction, ModifyInventoryInteraction, MovementConditionInteraction, MovementConditionInteraction, PlaceBlockInteraction, PlaceBlockInteraction, ProjectileInteraction, RemoveEntityInteraction, RepeatInteraction, RepeatInteraction, ResetCooldownInteraction, RunOnBlockTypesInteraction, RunRootInteraction, SelectInteraction, SelectInteraction, SimpleBlockInteraction, SimpleBlockInteraction, SimpleInstantInteraction, SpawnDeployableFromRaycastInteraction, StatsConditionInteraction, ToggleGliderInteraction, TriggerCooldownInteraction, UseEntityInteraction

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void compile(OperationsBuilder builder)
  public boolean walk(Collector collector, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<SimpleInteraction> CODEC
private static final StringTag TAG_NEXT
private static final StringTag TAG_FAILED
private static final int FAILED_LABEL_INDEX
protected String next
protected String failed
