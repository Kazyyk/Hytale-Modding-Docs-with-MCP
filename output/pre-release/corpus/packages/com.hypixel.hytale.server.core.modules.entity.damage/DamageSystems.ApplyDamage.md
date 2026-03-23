# DamageSystems.ApplyDamage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem | Implements: EntityStatsSystems.StatModifyingSystem

public static class DamageSystems.ApplyDamage extends DamageEventSystem implements EntityStatsSystems.StatModifyingSystem

The core damage application system. Runs after the gather and filter groups and before the inspect group. Rounds the final damage amount, subtracts it from the entity's health stat, and triggers death (by adding a DeathComponent) if health reaches the minimum. Cancels damage if the entity is already dead.

## Methods


public void handle(int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)

If the entity already has a `DeathComponent`, cancels the damage. Otherwise rounds the amount to a whole number, subtracts from health, and adds a `DeathComponent` if health drops to the minimum.

## Related Types

- DamageSystems -- parent class
- Damage -- the event processed
- DeathComponent -- added when an entity dies
- DamageEventSystem -- base class
