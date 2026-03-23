# MountSystems.OnMinecartHit

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: DamageEventSystem

public static class OnMinecartHit extends DamageEventSystem

Handles damage to minecart entities. After 3 hits, the minecart is destroyed. If 10 seconds pass since the last hit without further damage, the hit counter resets.

## Constants

- HIT_RESET_TIME | Duration.ofSeconds(10) | Time after which the hit counter resets.
- NUMBER_OF_HITS | 3 | Hits required to destroy the minecart.

## Query

Matches entities with both MinecartComponent and `TransformComponent`.

## Dependencies

Ordered `AFTER` `DamageModule.getGatherDamageGroup()` and `DamageModule.getFilterDamageGroup()`, and `BEFORE` `DamageModule.getInspectDamageGroup()`.

## Behavior

On each damage event:
1. If the last hit was more than 10 seconds ago, resets the hit counter and timestamp.
2. If damage amount is positive, increments the hit counter and records the timestamp.
3. On the 3rd hit, removes the minecart entity.
4. If the damage source is a player in non-Creative mode and the minecart has a source item, drops an item entity at the minecart's position.

## Related Types

- MountSystems -- enclosing class
- MinecartComponent -- the component tracking hit state
- MountSystems.EnsureMinecartComponents -- ensures supporting components

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private static final Duration HIT_RESET_TIME
private static final int NUMBER_OF_HITS
private final ComponentType<EntityStore,MinecartComponent> minecartComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,Player> playerComponentType
private final ResourceType<EntityStore,TimeResource> timeResourceType
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
