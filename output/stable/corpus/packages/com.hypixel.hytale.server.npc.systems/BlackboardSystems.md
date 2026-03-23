# BlackboardSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class BlackboardSystems

Container class for four ECS systems that manage the shared `Blackboard` resource. The Blackboard provides structured world-state views (block types, events, attitudes, resources, interactions) to NPC sensors.

## Inner Systems

### BlackboardSystems.InitSystem


public static class InitSystem extends StoreSystem<EntityStore>

Initializes and tears down the `Blackboard` resource when the system is added to or removed from the store.


@Override
public void onSystemAddedToStore(@Nonnull Store<EntityStore> store)

Calls `Blackboard.init(world)` to set up all blackboard views for the world.


@Override
public void onSystemRemovedFromStore(@Nonnull Store<EntityStore> store)

Calls `Blackboard.onWorldRemoved()` to clean up all views.

### BlackboardSystems.TickingSystem


public static class TickingSystem extends DelayedSystem<EntityStore>

Periodically cleans up stale blackboard view data. Runs every 5 seconds (`SYSTEM_INTERVAL = 5.0F`).


@Override
public void delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)

Calls `Blackboard.cleanupViews()`.

### BlackboardSystems.BreakBlockEventSystem


public static class BreakBlockEventSystem extends EntityEventSystem<EntityStore, BreakBlockEvent>

Forwards `BreakBlockEvent` ECS events to the blackboard. Calls `Blackboard.onEntityBreakBlock(ref, event)`.

### BlackboardSystems.DamageBlockEventSystem


public static class DamageBlockEventSystem extends EntityEventSystem<EntityStore, DamageBlockEvent>

Forwards `DamageBlockEvent` ECS events to the blackboard. Calls `Blackboard.onEntityDamageBlock(ref, event)`.

## Related Types

- RoleSystems -- uses blackboard data during behavior ticks
- PositionCacheSystems -- spatial queries that complement blackboard views
