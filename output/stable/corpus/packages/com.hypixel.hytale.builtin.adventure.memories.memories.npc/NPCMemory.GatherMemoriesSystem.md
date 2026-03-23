# NPCMemory.GatherMemoriesSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.memories.npc | Extends: EntityTickingSystem

public static class GatherMemoriesSystem extends EntityTickingSystem<EntityStore>

## Fields

- private final ComponentType<EntityStore, TransformComponent> transformComponentType
- private final ComponentType<EntityStore, Player> playerComponentType
- private final ComponentType<EntityStore, PlayerRef> playerRefComponentType
- private final ComponentType<EntityStore, PlayerMemories> playerMemoriesComponentType
- private final Query<EntityStore> query
- private final double radius

## Methods

- public GatherMemoriesSystem( @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType, @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType, @Nonnull ComponentType<EntityStore, PlayerMemories> playerMemoriesComponentType, double radius )
- public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static String findLocationZoneName(@Nonnull World world, @Nonnull Vector3d position)
- private static void displayCatchEntityParticles( @Nonnull MemoriesGameplayConfig memoriesGameplayConfig, @Nonnull Vector3d targetPosition, @Nonnull Ref<EntityStore> targetRef, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public Query<EntityStore> getQuery()
