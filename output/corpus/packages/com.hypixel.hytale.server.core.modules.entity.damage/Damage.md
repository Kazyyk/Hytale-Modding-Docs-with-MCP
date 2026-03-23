# Damage

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: CancellableEcsEvent | Implements: IMetaStore<Damage>

public class Damage extends CancellableEcsEvent implements IMetaStore<Damage>

Represents a damage event dispatched through the ECS event system. `Damage` carries the amount, cause, and source of damage dealt to an entity, and supports cancellation. It implements `IMetaStore` to allow attaching arbitrary metadata (hit location, particles, sound effects, camera effects, knockback, etc.) via `MetaKey` entries on its `META_REGISTRY`.

## Meta Keys

- HIT_LOCATION | Vector4d | World-space coordinates of the hit point.
- HIT_ANGLE | Float | Angle of the hit for directional indicators.
- IMPACT_PARTICLES | Damage.Particles | Particle configuration spawned on impact.
- IMPACT_SOUND_EFFECT | Damage.SoundEffect | Sound effect played on impact for all nearby players.
- PLAYER_IMPACT_SOUND_EFFECT | Damage.SoundEffect | Sound effect played only for the damaged player.
- CAMERA_EFFECT | Damage.CameraEffect | Camera shake or effect triggered on hit.
- DEATH_ICON | String | Icon identifier displayed in the kill feed on death.
- BLOCKED | Boolean | Whether the damage was blocked (defaults to `false`).
- STAMINA_DRAIN_MULTIPLIER | Float | Multiplier applied to stamina drain when blocking.
- CAN_BE_PREDICTED | Boolean | Whether the client can predict this damage (defaults to `false`).
- KNOCKBACK_COMPONENT | KnockbackComponent | Knockback data attached to this damage event.

## Static Fields

- META_REGISTRY | MetaRegistry<Damage> | Registry for all damage metadata keys.
- NULL_SOURCE | Damage.Source | A no-op source used for environment or sourceless damage.

## Constructors


public Damage(@Nonnull Damage.Source source, @Nonnull DamageCause damageCause, float amount)

Creates a damage event from a source, a `DamageCause` asset, and an amount. The damage cause is resolved to an index via `DamageCause.getAssetMap()`.


public Damage(@Nonnull Damage.Source source, int damageCauseIndex, float amount)

Creates a damage event from a source, a raw damage cause index, and an amount.

## Methods


public int getDamageCauseIndex()

Returns the integer index of the damage cause in the asset map.


public void setDamageCauseIndex(int damageCauseIndex)

Overrides the damage cause index.


@Deprecated
@Nullable
public DamageCause getCause()

Returns the `DamageCause` asset for this damage event, or `null` if the index is invalid. Deprecated in favor of index-based lookups.


@Nonnull
public Damage.Source getSource()

Returns the Damage.Source that caused this damage.


public void setSource(@Nonnull Damage.Source source)

Replaces the damage source.


public float getAmount()

Returns the current damage amount. This value may be modified by filter systems before application.


public void setAmount(float amount)

Sets the damage amount. Used by damage reduction systems to modify the final value.


public float getInitialAmount()

Returns the original damage amount as set at construction time, before any modifications.


@Nonnull
public Message getDeathMessage(@Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Delegates to the source's `getDeathMessage()` to produce a localized death message for the kill feed.


@Nonnull
@Override
public IMetaStoreImpl<Damage> getMetaStore()

Returns the `DynamicMetaStore` backing this damage event's metadata.

## Inner Types

- Damage.Source -- interface for damage source identification and death messages
- Damage.EntitySource -- damage from another entity
- Damage.ProjectileSource -- damage from a projectile with a shooter
- Damage.CommandSource -- damage from a command
- Damage.EnvironmentSource -- damage from an environment type
- Damage.Particles -- impact particle configuration
- Damage.SoundEffect -- impact sound effect wrapper
- Damage.CameraEffect -- camera effect record

## Related Types

- DamageCause -- asset defining the type of damage
- DamageEventSystem -- base class for systems that handle damage events
- DamageSystems -- collection of systems that process damage
- DeathComponent -- component added when damage kills an entity
- DamageModule -- module that registers all damage systems
