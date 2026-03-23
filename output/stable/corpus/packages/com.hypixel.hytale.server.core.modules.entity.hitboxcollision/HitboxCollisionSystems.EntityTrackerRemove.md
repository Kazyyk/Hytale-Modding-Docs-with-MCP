# HitboxCollisionSystems.EntityTrackerRemove

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision | Extends: RefChangeSystem

public static class EntityTrackerRemove extends RefChangeSystem<EntityStore, HitboxCollision>

## Fields

- private final ComponentType<EntityStore, HitboxCollision> componentType
- private final ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType
- private final Query<EntityStore> query

## Methods

- public EntityTrackerRemove( ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, ComponentType<EntityStore, HitboxCollision> componentType )
- public Query<EntityStore> getQuery()
- public ComponentType<EntityStore, HitboxCollision> componentType()
- public void onComponentAdded( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onComponentSet( @Nonnull Ref<EntityStore> ref, HitboxCollision oldComponent, @Nonnull HitboxCollision newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onComponentRemoved( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )

Also in this package: EntityTrackerUpdate, HitboxCollision, HitboxCollisionConfig, HitboxCollisionConfigPacketGenerator, HitboxCollisionSystems, Setup

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,HitboxCollision> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, HitboxCollision component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, HitboxCollision oldComponent, HitboxCollision newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, HitboxCollision component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,HitboxCollision> componentType
private final ComponentType<EntityStore,EntityTrackerSystems.Visible> visibleComponentType
private final Query<EntityStore> query
