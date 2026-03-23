# DamageCause

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, DamageCause>>

public class DamageCause implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, DamageCause>>

A JSON-driven asset defining a type of damage (physical, projectile, fall, drowning, etc.). Loaded from data files and indexed in an `IndexedLookupTableAssetMap`. Each cause can inherit from a parent cause, and controls properties such as whether it triggers durability loss, stamina loss, and whether it bypasses armor resistances. Also carries animation IDs for hurt and death animations.

## Deprecated Static Constants

These legacy constants reference well-known damage cause instances. They are deprecated in favor of index-based asset lookups.

- PHYSICAL | Melee physical damage.
- PROJECTILE | Ranged projectile damage.
- COMMAND | Damage from a server command.
- DROWNING | Damage from being submerged without oxygen.
- ENVIRONMENT | Damage from environmental hazards.
- FALL | Damage from falling.
- OUT_OF_WORLD | Damage from being below the world boundary.
- SUFFOCATION | Damage from being inside a solid block.

## Static Methods


@Nonnull
public static AssetStore<String, DamageCause, IndexedLookupTableAssetMap<String, DamageCause>> getAssetStore()

Returns the asset store containing all registered `DamageCause` instances. Lazily initialized from the `AssetRegistry`.


@Nonnull
public static IndexedLookupTableAssetMap<String, DamageCause> getAssetMap()

Returns the indexed lookup table for efficient integer-indexed access to damage causes.

## Constructors


public DamageCause()

Default constructor for codec deserialization.


public DamageCause(@Nonnull String id)

Creates a damage cause with the given string identifier.


public DamageCause(@Nonnull String id, @Nonnull String inherits, boolean durabilityLoss, boolean staminaLoss, boolean bypassResistances)

Creates a fully specified damage cause.

## Methods


public String getId()

Returns the string identifier for this damage cause.


public boolean isDurabilityLoss()

Returns `true` if this damage cause triggers durability loss on armor and weapons.


public boolean isStaminaLoss()

Returns `true` if this damage cause triggers stamina loss.


public boolean doesBypassResistances()

Returns `true` if this damage cause bypasses armor damage resistances.


public String getInherits()

Returns the parent damage cause identifier, or `null` if this cause has no parent. Used for resistance inheritance chains.


public String getAnimationId()

Returns the hurt animation identifier. Defaults to `"Hurt"`.


public String getDeathAnimationId()

Returns the death animation identifier. Defaults to `"Death"`.


@Nonnull
public com.hypixel.hytale.protocol.DamageCause toPacket()

Converts this damage cause to a protocol packet representation containing the ID and damage text color.

## Codec Fields

- Inherits | String | Parent damage cause ID for resistance inheritance.
- DurabilityLoss | boolean | Whether this cause triggers item durability loss.
- StaminaLoss | boolean | Whether this cause triggers stamina loss.
- BypassResistances | boolean | Whether this cause bypasses armor resistances.
- DamageTextColor | String | Color for combat text display.
- AnimationId | String | Hurt animation ID.
- DeathAnimationId | String | Death animation ID.

## Related Types

- Damage -- the damage event that references a cause
- DamageSystems.ArmorDamageReduction -- uses cause to look up resistances
- DamageSystems.FallDamageNPCs -- generates FALL damage
- DamageSystems.CanBreathe -- generates DROWNING and SUFFOCATION damage
- DeathComponent -- stores the cause of death

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public static AssetStore<String,DamageCause,IndexedLookupTableAssetMap<String,DamageCause>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,DamageCause> getAssetMap()
  public String getId()
  public boolean isDurabilityLoss()
  public boolean isStaminaLoss()
  public boolean doesBypassResistances()
  public String getInherits()
  public String getAnimationId()
  public String getDeathAnimationId()
  public com.hypixel.hytale.protocol.DamageCause toPacket()

Fields:
public static final AssetBuilderCodec<String,DamageCause> CODEC
private static AssetStore<String,DamageCause,IndexedLookupTableAssetMap<String,DamageCause>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
public static final Codec<String> CHILD_ASSET_CODEC
public static DamageCause PHYSICAL
public static DamageCause PROJECTILE
public static DamageCause COMMAND
public static DamageCause DROWNING
public static DamageCause ENVIRONMENT
public static DamageCause FALL
public static DamageCause OUT_OF_WORLD
public static DamageCause SUFFOCATION
protected AssetExtraInfo.Data data
protected String id
protected String inherits
protected boolean durabilityLoss
protected boolean staminaLoss
protected boolean bypassResistances
protected String damageTextColor
protected String animationId
protected String deathAnimationId
