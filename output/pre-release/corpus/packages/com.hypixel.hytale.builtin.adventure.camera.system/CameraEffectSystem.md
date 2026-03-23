# CameraEffectSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.system | Extends: DamageEventSystem

public class CameraEffectSystem extends DamageEventSystem

## Fields

- private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
- private final ComponentType<EntityStore,EntityStatMap> entityStatMapComponentType
- private final Query<EntityStore> query

## Methods

- @Nullable @Override public SystemGroup<EntityStore> getGroup()
- @Nonnull @Override public Query<EntityStore> getQuery()
- public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,EntityStatMap> entityStatMapComponentType
private final Query<EntityStore> query
