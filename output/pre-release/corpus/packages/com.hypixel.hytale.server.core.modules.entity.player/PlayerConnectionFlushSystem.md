# PlayerConnectionFlushSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public class PlayerConnectionFlushSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that flushes outbound network packets for each player connection. Runs as the last system in the tick (after `SEND_PACKET_GROUP` and `PlayerPingSystem`). Only executes if `Constants.FORCE_NETWORK_FLUSH` is enabled. Implements `RunWhenPausedSystem` so it runs even when the game is paused.

## Related Types

- PlayerPingSystem -- runs before this system in the flush chain

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
public static final Set<Dependency<EntityStore>> DEPENDENCIES
private final ComponentType<EntityStore,PlayerRef> componentType
