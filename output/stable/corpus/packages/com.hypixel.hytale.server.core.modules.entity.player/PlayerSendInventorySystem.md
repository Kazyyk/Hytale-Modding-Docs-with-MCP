# PlayerSendInventorySystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public class PlayerSendInventorySystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that sends inventory updates to the client when the player's inventory is dirty. Each tick, checks `Inventory.consumeIsDirty()` and sends the full inventory packet if changes occurred. Also calls `WindowManager.updateWindows()` to synchronize open UI windows.

Queries entities with `Player` and `PlayerRef`.

## Related Types

- PlayerSystems -- other player systems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,Player> componentType
private final ComponentType<EntityStore,PlayerRef> refComponentType
private final Query<EntityStore> query
