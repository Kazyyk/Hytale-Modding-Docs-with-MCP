# MovementStatesSystems.TickingSystem

Type: class | Package: com.hypixel.hytale.server.core.entity.movement | Extends: EntityTickingSystem

public static class TickingSystem extends EntityTickingSystem<EntityStore>

## Fields

- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType
- private final Query<EntityStore> query

## Methods

- public TickingSystem( @Nonnull ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType )
- public SystemGroup<EntityStore> getGroup()
- public Query<EntityStore> getQuery()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static void queueUpdatesFor( @Nonnull Ref<EntityStore> ref, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo, @Nonnull MovementStatesComponent movementStatesComponent )
- public static void copyMovementStatesFrom(@Nonnull MovementStates from, @Nonnull MovementStates to)
