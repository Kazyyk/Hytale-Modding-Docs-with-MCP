# VoidInvasionPortalsSpawnSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent | Extends: DelayedEntitySystem<EntityStore>

public class VoidInvasionPortalsSpawnSystem extends DelayedEntitySystem<EntityStore>

Delayed entity system (2.0s interval) that spawns invasion portals during void events. Searches for valid positions near random players using spatial queries with clustering constraints. Limited to 24 portals.

## Fields

- private static final | int | MAX_PORTALS | Maximum invasion portals (24)

## Methods

- public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()
