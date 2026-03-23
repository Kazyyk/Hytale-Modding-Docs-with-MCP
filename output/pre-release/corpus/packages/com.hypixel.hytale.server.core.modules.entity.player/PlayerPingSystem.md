# PlayerPingSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public class PlayerPingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that sends periodic ping packets to each connected player to measure round-trip latency. Runs as a last-priority system in the `SEND_PACKET_GROUP`. Implements `RunWhenPausedSystem` so ping continues during game pause. Calls `PacketHandler.tickPing(dt)` for each entity with a `PlayerRef`.

## Related Types

- PlayerConnectionFlushSystem -- flushes packets after ping

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public SystemGroup<EntityStore> getGroup()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,PlayerRef> PLAYER_REF_COMPONENT_TYPE
