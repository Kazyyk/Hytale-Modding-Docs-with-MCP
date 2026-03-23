# RespawnSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class RespawnSystems

Container class for ECS systems triggered when an entity respawns (when the DeathComponent is removed). Systems handle stat reset, effect clearing, interaction cleanup, broken item checks, and UI cleanup.

## Inner Types

- RespawnSystems.OnRespawnSystem -- abstract base for respawn component-change systems
- RespawnSystems.ResetStatsRespawnSystem -- resets all entity stats
- RespawnSystems.ResetPlayerRespawnSystem -- records spawn time
- RespawnSystems.ClearEntityEffectsRespawnSystem -- clears active effects
- RespawnSystems.ClearInteractionsRespawnSystem -- clears interaction manager
- RespawnSystems.CheckBrokenItemsRespawnSystem -- warns about broken items
- RespawnSystems.ClearRespawnUI -- closes the respawn page

## Related Types

- DeathComponent -- removal of this component triggers respawn systems
- DeathSystems -- handles death (component addition)
- DamageModule -- registers all respawn systems

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)
