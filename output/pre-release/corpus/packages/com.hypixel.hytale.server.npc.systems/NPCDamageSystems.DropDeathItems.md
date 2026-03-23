# NPCDamageSystems.DropDeathItems

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.component.system.tick.EntityTickingSystem

public static class DropDeathItems extends EntityTickingSystem<EntityStore>

Inner class of `NPCDamageSystems`. Ticking system that handles item drops on NPC death. Runs after `DeathSystems.TickCorpseRemoval` and before `DeathSystems.CorpseRemoval`. When an NPC dies with `ItemsLossMode.ALL`, drops inventory items and items from the configured drop list as item entities.

## Methods

- public Query<EntityStore> getQuery()
- public Set<Dependency<EntityStore>> getDependencies()
- public void tick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
