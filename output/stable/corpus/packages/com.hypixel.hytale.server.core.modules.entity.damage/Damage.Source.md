# Damage.Source

Type: interface | Package: com.hypixel.hytale.server.core.modules.entity.damage

public interface Damage.Source

Interface for identifying the origin of a Damage event and generating a localized death message. Implementations include Damage.EntitySource, Damage.ProjectileSource, Damage.CommandSource, and Damage.EnvironmentSource. The null source (`Damage.NULL_SOURCE`) is an anonymous implementation used for sourceless damage such as fall damage or drowning.

## Methods


@Nonnull
default Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns a localized death message for the kill feed. The default implementation looks up the `DamageCause` by index and produces a translation key of the form `server.general.killedBy` parameterized with the cause name. Implementations override this to provide source-specific messages (e.g., "killed by [player]" or "killed by command").

## Related Types

- Damage -- the damage event that carries a source
- Damage.EntitySource -- entity-originated damage
- Damage.CommandSource -- command-originated damage
- Damage.EnvironmentSource -- environment-originated damage
- DamageCause -- asset used in the default death message

Known implementors: ActiveEntityEffect, CommandSource, EntitySource, EnvironmentSource

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  default Message getDeathMessage(Damage info, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
