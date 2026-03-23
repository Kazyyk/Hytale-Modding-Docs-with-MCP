# DamageSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class DamageSystems

Container class for all ECS systems that process damage events on the `EntityStore`. Provides static utility methods for dispatching damage and defines inner system classes organized into three groups: gather (damage generation), filter (damage modification/cancellation), and inspect (post-damage effects). All systems are registered by DamageModule.

## Static Fields

- DEFAULT_DAMAGE_DELAY | float | Default delay between damage ticks: `1.0` seconds.

## Static Methods


public static void executeDamage(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Damage damage)

Dispatches a damage event to the specified entity via a `ComponentAccessor`.


public static void executeDamage(int index, @Nonnull ArchetypeChunk<EntityStore> chunk, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)

Dispatches a damage event to the entity at the given index within an archetype chunk.


public static void executeDamage(@Nonnull Ref<EntityStore> ref, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Damage damage)

Dispatches a damage event to the specified entity via a `CommandBuffer`.

## Inner Types -- Gather Group

- DamageSystems.CanBreathe -- drowning and suffocation damage
- DamageSystems.OutOfWorldDamage -- damage from falling below the world
- DamageSystems.FallDamagePlayers -- fall damage for players
- DamageSystems.FallDamageNPCs -- fall damage for NPCs

## Inner Types -- Filter Group

- DamageSystems.FilterPlayerWorldConfig -- cancels player damage when disabled
- DamageSystems.FilterNPCWorldConfig -- cancels NPC damage when disabled
- DamageSystems.FilterUnkillable -- cancels damage on dead, invulnerable, or intangible entities
- DamageSystems.PlayerDamageFilterSystem -- spawn protection and PvP checks
- DamageSystems.ArmorDamageReduction -- reduces damage based on armor resistances
- DamageSystems.ArmorKnockbackReduction -- reduces knockback based on armor
- DamageSystems.WieldingDamageReduction -- reduces damage when blocking
- DamageSystems.WieldingKnockbackReduction -- reduces knockback when blocking
- DamageSystems.HackKnockbackValues -- scales knockback velocity

## Inner Types -- Inspect Group

- DamageSystems.ApplyDamage -- subtracts health and triggers death
- DamageSystems.ApplyParticles -- spawns impact particles
- DamageSystems.ApplySoundEffects -- plays impact sounds
- DamageSystems.HitAnimation -- plays hurt animations
- DamageSystems.DamageArmor -- reduces armor durability
- DamageSystems.DamageAttackerTool -- reduces attacker weapon durability
- DamageSystems.DamageStamina -- drains stamina on blocked hits
- DamageSystems.RecordLastCombat -- records combat timestamps
- DamageSystems.TrackLastDamage -- records last damage time
- DamageSystems.PlayerHitIndicators -- sends hit indicator packets
- DamageSystems.ReticleEvents -- sends reticle hit/kill events
- DamageSystems.EntityUIEvents -- sends combat text UI updates

## Related Types

- Damage -- the event processed by these systems
- DamageEventSystem -- abstract base for most inner systems
- DamageModule -- registers all these systems
- DeathSystems -- handles death after damage kills an entity

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public static void executeDamage(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, Damage damage)
  public static void executeDamage(int index, ArchetypeChunk<EntityStore> chunk, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public static void executeDamage(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, Damage damage)

Fields:
public static final float DEFAULT_DAMAGE_DELAY
private static final Query<EntityStore> NPCS_QUERY
