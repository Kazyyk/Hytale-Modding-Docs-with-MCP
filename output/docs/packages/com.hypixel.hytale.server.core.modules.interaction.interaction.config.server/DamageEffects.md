---
title: "DamageEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageEffects"
api_surface: false
extends: ~
implements:
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "combat"
  - "damage"
  - "effects"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public class DamageEffects implements NetworkSerializable<com.hypixel.hytale.protocol.DamageEffects>
```

Configures visual, audio, and physical effects applied when damage is dealt. Includes model particles, world particles, local/world/player sound events, knockback, camera effects, stamina drain multipliers, and view distance for particle visibility.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `ModelParticles` | `ModelParticle[]` | No (inherited) | -- | Particles attached to the target model. |
| `WorldParticles` | `WorldParticle[]` | No (inherited) | -- | Particles spawned in the world. |
| `LocalSoundEventId` | `String` | No (inherited) | `null` | Sound event played locally. Validated against `SoundEvent`. |
| `WorldSoundEventId` | `String` | No (inherited) | `null` | Sound event played in 3D world space. Must be mono. |
| `PlayerSoundEventId` | `String` | No (inherited) | `null` | Sound event played to the player receiving damage. |
| `ViewDistance` | `double` | No (inherited) | `75.0` | Radius for particle visibility. |
| `Knockback` | [Knockback](Knockback.md) | No (inherited) | -- | Knockback force configuration. |
| `CameraEffect` | `String` (asset ref) | No (inherited) | -- | Camera effect to apply on hit. |
| `StaminaDrainMultiplier` | `float` | No (inherited) | `1.0` | Multiplier applied to stamina drain caused by this damage. |

## Methods

```java
public ModelParticle[] getModelParticles()
```

```java
public WorldParticle[] getWorldParticles()
```

```java
@Nullable
public String getWorldSoundEventId()
```

```java
public int getWorldSoundEventIndex()
```

```java
@Nullable
public String getLocalSoundEventId()
```

```java
public int getLocalSoundEventIndex()
```

```java
public double getViewDistance()
```

```java
public Knockback getKnockback()
```

```java
public String getCameraEffectId()
```

```java
public void addToDamage(@Nonnull Damage damageEvent)
```

Adds configured effects (impact sound, particles, camera effect, stamina drain) as meta objects on the damage event.

```java
public void spawnAtEntity(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref)
```

Spawns world particles and plays sound events at the entity's position.

```java
@Nonnull
public com.hypixel.hytale.protocol.DamageEffects toPacket()
```

Converts to protocol form.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [Knockback](Knockback.md) -- knockback force calculation
- [DamageEntityInteraction](DamageEntityInteraction.md) -- uses damage effects during combat
