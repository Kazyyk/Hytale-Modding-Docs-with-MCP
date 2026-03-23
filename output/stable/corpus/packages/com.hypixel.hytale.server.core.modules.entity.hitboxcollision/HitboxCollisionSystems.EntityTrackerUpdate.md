# HitboxCollisionSystems.EntityTrackerUpdate

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision | Extends: EntityTickingSystem

public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

## Fields

- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final ComponentType<EntityStore, HitboxCollision> componentType
- private final Query<EntityStore> query

## Methods

- public EntityTrackerUpdate( ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, ComponentType<EntityStore, HitboxCollision> componentType )
- public SystemGroup<EntityStore> getGroup()
- public Query<EntityStore> getQuery()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static void queueUpdatesFor( Ref<EntityStore> ref, @Nonnull HitboxCollision hitboxCollision, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo )

Also in this package: EntityTrackerRemove, HitboxCollision, HitboxCollisionConfig, HitboxCollisionConfigPacketGenerator, HitboxCollisionSystems, Setup

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static void queueUpdatesFor(Ref<EntityStore> ref, HitboxCollision hitboxCollision, Map<Ref<EntityStore>,EntityTrackerSystems.EntityViewer> visibleTo)

Fields:
private final ComponentType<EntityStore,EntityTrackerSystems.Visible> visibleComponentType
private final ComponentType<EntityStore,HitboxCollision> componentType
private final Query<EntityStore> query
