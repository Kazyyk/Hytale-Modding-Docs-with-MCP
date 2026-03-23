---
title: "DamageCause"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageCause"
api_surface: true
extends: ~
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, DamageCause>>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "asset"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DamageCause implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, DamageCause>>
```

A JSON-driven asset defining a type of damage (physical, projectile, fall, drowning, etc.). Loaded from data files and indexed in an `IndexedLookupTableAssetMap`. Each cause can inherit from a parent cause, and controls properties such as whether it triggers durability loss, stamina loss, and whether it bypasses armor resistances. Also carries animation IDs for hurt and death animations.

## Deprecated Static Constants

These legacy constants reference well-known damage cause instances. They are deprecated in favor of index-based asset lookups.

| Constant | Description |
|---|---|
| `PHYSICAL` | Melee physical damage. |
| `PROJECTILE` | Ranged projectile damage. |
| `COMMAND` | Damage from a server command. |
| `DROWNING` | Damage from being submerged without oxygen. |
| `ENVIRONMENT` | Damage from environmental hazards. |
| `FALL` | Damage from falling. |
| `OUT_OF_WORLD` | Damage from being below the world boundary. |
| `SUFFOCATION` | Damage from being inside a solid block. |

## Static Methods

```java
@Nonnull
public static AssetStore<String, DamageCause, IndexedLookupTableAssetMap<String, DamageCause>> getAssetStore()
```

Returns the asset store containing all registered `DamageCause` instances. Lazily initialized from the `AssetRegistry`.

```java
@Nonnull
public static IndexedLookupTableAssetMap<String, DamageCause> getAssetMap()
```

Returns the indexed lookup table for efficient integer-indexed access to damage causes.

## Constructors

```java
public DamageCause()
```

Default constructor for codec deserialization.

```java
public DamageCause(@Nonnull String id)
```

Creates a damage cause with the given string identifier.

```java
public DamageCause(@Nonnull String id, @Nonnull String inherits, boolean durabilityLoss, boolean staminaLoss, boolean bypassResistances)
```

Creates a fully specified damage cause.

## Methods

```java
public String getId()
```

Returns the string identifier for this damage cause.

```java
public boolean isDurabilityLoss()
```

Returns `true` if this damage cause triggers durability loss on armor and weapons.

```java
public boolean isStaminaLoss()
```

Returns `true` if this damage cause triggers stamina loss.

```java
public boolean doesBypassResistances()
```

Returns `true` if this damage cause bypasses armor damage resistances.

```java
public String getInherits()
```

Returns the parent damage cause identifier, or `null` if this cause has no parent. Used for resistance inheritance chains.

```java
public String getAnimationId()
```

Returns the hurt animation identifier. Defaults to `"Hurt"`.

```java
public String getDeathAnimationId()
```

Returns the death animation identifier. Defaults to `"Death"`.

```java
@Nonnull
public com.hypixel.hytale.protocol.DamageCause toPacket()
```

Converts this damage cause to a protocol packet representation containing the ID and damage text color.

## Codec Fields

| JSON Key | Type | Description |
|---|---|---|
| `Inherits` | `String` | Parent damage cause ID for resistance inheritance. |
| `DurabilityLoss` | `boolean` | Whether this cause triggers item durability loss. |
| `StaminaLoss` | `boolean` | Whether this cause triggers stamina loss. |
| `BypassResistances` | `boolean` | Whether this cause bypasses armor resistances. |
| `DamageTextColor` | `String` | Color for combat text display. |
| `AnimationId` | `String` | Hurt animation ID. |
| `DeathAnimationId` | `String` | Death animation ID. |

## Related Types

- [Damage](Damage.md) -- the damage event that references a cause
- [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md) -- uses cause to look up resistances
- [DamageSystems.FallDamageNPCs](DamageSystems.FallDamageNPCs.md) -- generates FALL damage
- [DamageSystems.CanBreathe](DamageSystems.CanBreathe.md) -- generates DROWNING and SUFFOCATION damage
- [DeathComponent](DeathComponent.md) -- stores the cause of death
