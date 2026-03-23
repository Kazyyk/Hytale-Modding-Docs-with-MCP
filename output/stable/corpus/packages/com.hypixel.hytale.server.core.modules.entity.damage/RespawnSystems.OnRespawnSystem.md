# RespawnSystems.OnRespawnSystem

Type: abstract class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RefChangeSystem<EntityStore, DeathComponent>

public abstract static class RespawnSystems.OnRespawnSystem extends RefChangeSystem<EntityStore, DeathComponent>

Abstract base class for systems that react to `DeathComponent` removal (respawn). Extends `RefChangeSystem` parameterized with `DeathComponent`. Subclasses override `onComponentRemoved()` to handle respawn. The `onComponentAdded()` and `onComponentSet()` methods are no-ops by default.

## Methods


@Nonnull
@Override
public ComponentType<EntityStore, DeathComponent> componentType()

Returns `DeathComponent.getComponentType()`.

## Related Types

- RespawnSystems -- parent class
- DeathComponent -- the component tracked
- DeathSystems.OnDeathSystem -- similar base that reacts to addition
