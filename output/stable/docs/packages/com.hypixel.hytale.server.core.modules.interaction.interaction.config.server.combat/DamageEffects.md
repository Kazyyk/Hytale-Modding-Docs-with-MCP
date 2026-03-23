---
title: "DamageEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageEffects"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "combat"
---
**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public class DamageEffects implements NetworkSerializable<com.hypixel.hytale.protocol.DamageEffects>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `ModelParticle[]` | `modelParticles` |
| `protected` | `WorldParticle[]` | `worldParticles` |
| `protected` | `String` | `localSoundEventId` |
| `protected transient` | `int` | `localSoundEventIndex` |
| `protected` | `String` | `worldSoundEventId` |
| `protected transient` | `int` | `worldSoundEventIndex` |
| `protected` | `String` | `playerSoundEventId` |
| `protected transient` | `int` | `playerSoundEventIndex` |
| `protected` | `double` | `viewDistance` |
| `protected` | `Knockback` | `knockback` |
| `protected` | `String` | `cameraEffectId` |
| `protected` | `int` | `cameraEffectIndex` |
| `protected` | `float` | `staminaDrainMultiplier` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `DamageEffects( ModelParticle[] modelParticles, WorldParticle[] worldParticles, String localSoundEventId, String worldSoundEventId, double viewDistance, Knockback knockback )` |
| `protected` | `` | `DamageEffects()` |
| `public` | `ModelParticle[]` | `getModelParticles()` |
| `public` | `WorldParticle[]` | `getWorldParticles()` |
| `public` | `String` | `getWorldSoundEventId()` |
| `public` | `int` | `getWorldSoundEventIndex()` |
| `public` | `String` | `getLocalSoundEventId()` |
| `public` | `int` | `getLocalSoundEventIndex()` |
| `public` | `double` | `getViewDistance()` |
| `public` | `Knockback` | `getKnockback()` |
| `public` | `String` | `getCameraEffectId()` |
| `protected` | `void` | `processConfig()` |
| `public` | `void` | `addToDamage(@Nonnull Damage damageEvent)` |
| `public` | `void` | `spawnAtEntity(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref)` |
| `public` | `String` | `toString()` |
| `public` | `com.hypixel.hytale.protocol.DamageEffects` | `toPacket()` |
