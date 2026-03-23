# DamageEventSystem

Type: abstract class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityEventSystem<EntityStore, Damage>

public abstract class DamageEventSystem extends EntityEventSystem<EntityStore, Damage>

Abstract base class for ECS systems that process Damage events on the `EntityStore`. Parameterizes `EntityEventSystem` with `Damage.class` so subclasses only need to implement the `handle()` method to react to incoming damage events. Nearly all damage processing systems in DamageSystems extend this class.

## Constructor


protected DamageEventSystem()

Calls `super(Damage.class)` to register this system as a handler for `Damage` events.

## Related Types

- Damage -- the event type this system processes
- DamageSystems -- contains the concrete implementations
- DamageCalculatorSystems.SequenceModifier -- another subclass
- DamageModule -- registers all damage event systems
