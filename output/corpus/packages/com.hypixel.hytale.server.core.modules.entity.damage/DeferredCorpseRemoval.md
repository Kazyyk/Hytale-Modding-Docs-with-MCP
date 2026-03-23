# DeferredCorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Component<EntityStore>

public class DeferredCorpseRemoval implements Component<EntityStore>

An ECS component that adds a time delay before a dead entity's corpse is removed from the world. Used by DeathSystems.CorpseRemoval to keep corpses visible for a configured duration. The timer counts down each tick, and the corpse is removed when it reaches zero.

## Static Methods


public static ComponentType<EntityStore, DeferredCorpseRemoval> getComponentType()

Returns the registered component type from DamageModule.

## Constructor


public DeferredCorpseRemoval(double timeUntilCorpseRemoval)

Creates a deferred removal timer with the given duration in seconds.

## Methods


public boolean tick(float dt)

Decrements the remaining time by `dt`. Returns `true` when the timer has expired (time remaining <= 0).


@Nonnull
@Override
public Component<EntityStore> clone()

Creates a copy with the current remaining time.

## Fields

- timeRemaining | double | protected | Seconds remaining before corpse removal.

## Related Types

- DeathSystems.CorpseRemoval -- ticking system that checks this timer
- DamageModule -- registers this component type
