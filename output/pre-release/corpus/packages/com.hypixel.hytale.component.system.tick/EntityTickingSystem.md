# EntityTickingSystem

Type: class | Package: com.hypixel.hytale.component.system.tick | Extends: ArchetypeTickingSystem<ECS_TYPE>

public abstract class EntityTickingSystem<ECS_TYPE> extends ArchetypeTickingSystem<ECS_TYPE>

## Methods

- protected static boolean maybeUseParallel(int archetypeChunkSize, int taskCount)
- protected static boolean useParallel(int archetypeChunkSize, int taskCount)
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- @Override public void tick(float dt, @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk, @Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer)
- public abstract void tick(float var1, int var2, @Nonnull ArchetypeChunk<ECS_TYPE> var3, @Nonnull Store<ECS_TYPE> var4, @Nonnull CommandBuffer<ECS_TYPE> var5)
- public static <ECS_TYPE> void doTick(@Nonnull EntityTickingSystem<ECS_TYPE> system,
        float dt,
        @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk,
        @Nonnull Store<ECS_TYPE> store,
        @Nonnull CommandBuffer<ECS_TYPE> commandBuffer)` |

## Inner Types

- `EntityTickingSystem.SystemTaskData`

Known subclasses: AddToVisible, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyKnockback, ApplyPlayerKnockback, BlockEntityTrackerSystem, BlockHealthSystem, Capture, CaptureKnockbackInput, Changes, CheckDespawn, ClearChanges, ClearEntityViewers, ClearPreviouslyVisible, ClearUsedTeleporterSystem, CollectVisible, CoopResidentTicking, CorpseRemoval, CraftingTickingSystem, DelayedEntitySystem, DeployableOwnerTicker, DeployableTicker, DespawnSystem, DropDeathItems, DynamicLightTracker, EffectControllerSystem, EnsureVisibleComponent, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EntityTrackerUpdate, EvaluatorTick, FallDamageNPCs, FallDamagePlayers, FlockDebugSystem, GatherMemoriesSystem, GenericVelocityInstructionSystem, HackKnockbackValues, HandleMountInput, InventoryChangeEventSystem, ItemMergeSystem, ItemPhysicsSystem, ItemPrePhysicsSystem, LegacyArmorChangeStatSystem, LegacyEntityModel, LegacyEntitySkin, LegacyEquipment, LegacyHideFromEntity, LegacyHotbarChangeStatSystem, LegacyLODCull, LegacyUtilityChangeStatSystem, LivingEntityEffectClearChangesSystem, LivingEntityEffectSystem, LoadTimeDelay, LocalSpawnForceTriggerSystem, NPCVelocityInstructionSystem, NewSpawnEntityTrackerUpdate, NewSpawnTick, PickupItemSystem, PlayerConnectionFlushSystem, PlayerItemEntityPickupSystem, PlayerPingSystem, PlayerProcessMovementSystem, PlayerSendInventorySystem, PlayerVelocityInstructionSystem, PositionSelectorUpdate, PreTick, ProcessPlayerInput, ProcessingBenchTick, RandomTickSystem, Recalculate, Regenerate, RemoveEmptyVisibleComponent, ReplicateChanges, ReplicateChanges, RepulsionTicker, Resize, RotateObjectSystem, SendPackets, SimulateKnockback, SpawnControllerSystem, SpawnJobSystem, SpawnMarkerTickHeartbeat, SprintStaminaEffectSystem, StandardPhysicsTickSystem, StateEvaluatorSystem, StepCleanupSystem, SteppableTickingSystem, Tick, TickCorpseRemoval, TickHeartbeat, TickHeldInteractionsSystem, TickInteractionManagerSystem, TickMovementAudio, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, Ticking, TickingSpawnBeaconSystem, TickingSpawnMarkerSystem, TickingSystem, TickingSystem, TickingSystem, TickingSystem, TickingSystem, TickingSystem, TrackerSystem, TrackerTickSystem, TrackerUpdate, Update, UpdateMovementStateBoundingBox, UpdatePlayerRef, UpdateSystem

Also in this package: ArchetypeTickingSystem, Data, DelayedEntitySystem, RunWhenPausedSystem, SystemTaskData, TickableSystem, TickingSystem

Complete API:
  protected static boolean maybeUseParallel(int archetypeChunkSize, int taskCount)
  protected static boolean useParallel(int archetypeChunkSize, int taskCount)
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, ArchetypeChunk<ECS_TYPE> archetypeChunk, Store<ECS_TYPE> store, CommandBuffer<ECS_TYPE> commandBuffer)
  public abstract void tick(float var1, int var2, ArchetypeChunk<ECS_TYPE> var3, Store<ECS_TYPE> var4, CommandBuffer<ECS_TYPE> var5)
  public static void doTick(EntityTickingSystem<ECS_TYPE> system, float dt, ArchetypeChunk<ECS_TYPE> archetypeChunk, Store<ECS_TYPE> store, CommandBuffer<ECS_TYPE> commandBuffer)
