# DamageDataSetupSystem

Type: class | Package: com.hypixel.hytale.server.core.entity.damage | Extends: HolderSystem

public class DamageDataSetupSystem extends HolderSystem

## Fields

- private final ComponentType<EntityStore,DamageDataComponent> damageDataComponentType

## Methods

- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
- @Nonnull @Override public Query<EntityStore> getQuery()
