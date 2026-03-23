# HitboxCollisionSystems.Setup

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision | Extends: HolderSystem

public static class Setup extends HolderSystem<EntityStore>

## Fields

- private final ComponentType<EntityStore, HitboxCollision> componentType
- private final ComponentType<EntityStore, Player> playerComponentType
- private final Query<EntityStore> query

## Methods

- public Setup(ComponentType<EntityStore, HitboxCollision> componentType, ComponentType<EntityStore, Player> playerComponentType)
- public Query<EntityStore> getQuery()
- public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

Also in this package: EntityTrackerRemove, EntityTrackerUpdate, HitboxCollision, HitboxCollisionConfig, HitboxCollisionConfigPacketGenerator, HitboxCollisionSystems

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private final ComponentType<EntityStore,HitboxCollision> componentType
private final ComponentType<EntityStore,Player> playerComponentType
private final Query<EntityStore> query
