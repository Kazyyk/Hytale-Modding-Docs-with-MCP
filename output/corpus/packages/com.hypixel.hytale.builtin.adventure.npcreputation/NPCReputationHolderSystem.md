# NPCReputationHolderSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcreputation | Extends: HolderSystem

public class NPCReputationHolderSystem extends HolderSystem

## Fields

- private final ComponentType<EntityStore,ReputationGroupComponent> reputationGroupComponentType
- private final ComponentType<EntityStore,NPCEntity> npcEntityComponentType
- private final Query<EntityStore> query

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
- @Override public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
