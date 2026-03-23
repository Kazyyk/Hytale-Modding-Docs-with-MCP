# MovementStatesSystems

Type: class | Package: com.hypixel.hytale.server.core.entity.movement

public class MovementStatesSystems

## Fields

- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType
- private final Query<EntityStore> query
- private final ComponentType<EntityStore, Player> playerComponentType
- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType
- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType
- private final Query<EntityStore> query

## Methods

- public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- public Query<EntityStore> getQuery()
- public void onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public Query<EntityStore> getQuery()
- public SystemGroup<EntityStore> getGroup()
- public Query<EntityStore> getQuery()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static void queueUpdatesFor( @Nonnull Ref<EntityStore> ref, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo, @Nonnull MovementStatesComponent movementStatesComponent )
- public static void copyMovementStatesFrom(@Nonnull MovementStates from, @Nonnull MovementStates to)

Also in this package: AddSystem, MovementStatesComponent, PlayerInitSystem, TickingSystem
