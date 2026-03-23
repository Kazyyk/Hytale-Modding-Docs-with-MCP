# UIComponentSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui

public class UIComponentSystems

## Fields

- private final ComponentType<EntityStore, UIComponentList> uiComponentListComponentType
- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final Query<EntityStore> query
- private final ComponentType<EntityStore, UIComponentList> uiComponentListComponentType
- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final ComponentType<EntityStore, UIComponentList> uiComponentListComponentType
- private final Query<EntityStore> query

## Methods

- @Override @Nonnull public Query<EntityStore> getQuery()
- @Override @Nonnull public ComponentType<EntityStore, UIComponentList> componentType()
- public void onComponentAdded( @Nonnull Ref<EntityStore> ref, @Nonnull UIComponentList component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onComponentSet( @Nonnull Ref<EntityStore> ref, UIComponentList oldComponent, @Nonnull UIComponentList newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onComponentRemoved( @Nonnull Ref<EntityStore> ref, @Nonnull UIComponentList component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- @Override public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- @Override public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- @Override @Nullable public SystemGroup<EntityStore> getGroup()
- @Override public boolean isParallel(int archetypeChunkSize, int taskCount)
- @Override public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static void queueUpdatesFor( Ref<EntityStore> ref, @Nonnull UIComponentList uiComponentList, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo )

## Inner Types

- `UIComponentSystems.Remove`
- `UIComponentSystems.Setup`
- `UIComponentSystems.Update`

Also in this package: EntityUIModule, Remove, Setup, UIComponentList, Update
