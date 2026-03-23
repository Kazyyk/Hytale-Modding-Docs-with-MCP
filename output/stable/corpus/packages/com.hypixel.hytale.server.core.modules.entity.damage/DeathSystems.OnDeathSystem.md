# DeathSystems.OnDeathSystem

Type: abstract class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RefChangeSystem<EntityStore, DeathComponent>

public abstract static class DeathSystems.OnDeathSystem extends RefChangeSystem<EntityStore, DeathComponent>

Abstract base class for systems that react to `DeathComponent` lifecycle changes. Extends `RefChangeSystem` parameterized with `DeathComponent`. Subclasses override `onComponentAdded()` to handle death. The `onComponentSet()` and `onComponentRemoved()` methods are no-ops by default.

## Methods


@Nonnull
@Override
public ComponentType<EntityStore, DeathComponent> componentType()

Returns `DeathComponent.getComponentType()`.


public void onComponentSet(@Nonnull Ref<EntityStore> ref, DeathComponent oldComponent, @Nonnull DeathComponent newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

No-op default. Called when the component is replaced.


public void onComponentRemoved(@Nonnull Ref<EntityStore> ref, @Nonnull DeathComponent component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

No-op default. Called when the component is removed (respawn).

## Related Types

- DeathSystems -- parent class
- DeathComponent -- the component tracked
- RespawnSystems.OnRespawnSystem -- similar base that reacts to removal
