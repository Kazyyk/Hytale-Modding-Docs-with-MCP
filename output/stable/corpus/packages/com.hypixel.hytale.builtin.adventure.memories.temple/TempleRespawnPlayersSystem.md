# TempleRespawnPlayersSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.temple | Extends: DelayedEntitySystem

public class TempleRespawnPlayersSystem extends DelayedEntitySystem

## Fields

- private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
- private final ComponentType<EntityStore,TransformComponent> transformComponentType
- private final Query<EntityStore> query

## Methods

- @Override public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Nonnull @Override public Query<EntityStore> getQuery()
