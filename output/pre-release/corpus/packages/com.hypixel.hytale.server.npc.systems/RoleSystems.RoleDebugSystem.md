# RoleSystems.RoleDebugSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.server.npc.systems.SteppableTickingSystem

public static class RoleDebugSystem extends SteppableTickingSystem

Inner class of `RoleSystems`. Renders debug visualizations for NPC roles including sensor ranges (discs/sectors), leash position tethers, path waypoints, and marked target arrows. Uses `DebugUtils` to draw shapes, spheres, lines, and arrows in the world.

## Constructors

- RoleDebugSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType, @Nonnull Set<Dependency<EntityStore>> dependencies)

## Methods

- public Set<Dependency<EntityStore>> getDependencies()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public Query<EntityStore> getQuery()
- public void steppedTick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
