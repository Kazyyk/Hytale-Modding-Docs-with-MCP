# KillTrackerSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.systems | Extends: OnDeathSystem

public class KillTrackerSystem extends OnDeathSystem

## Fields

- private final ComponentType<EntityStore,NPCEntity> npcEntityComponentType
- private final ResourceType<EntityStore,KillTrackerResource> killTrackerResourceType

## Methods

- @Nonnull @Override public Query<EntityStore> getQuery()
- public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Also in this package: SpawnBeaconCheckRemovalSystem

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,NPCEntity> npcEntityComponentType
private final ResourceType<EntityStore,KillTrackerResource> killTrackerResourceType
