---
title: "ApplicationEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.entityeffect.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.entityeffect.config.ApplicationEffects"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.asset.type.entityeffect.config`

```java
public class ApplicationEffects implements NetworkSerializable<com.hypixel.hytale.protocol.ApplicationEffects>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `Color` | `entityBottomTint` |
| `protected` | `Color` | `entityTopTint` |
| `protected` | `String` | `entityAnimationId` |
| `protected` | `ModelParticle[]` | `particles` |
| `protected` | `ModelParticle[]` | `firstPersonParticles` |
| `protected` | `String` | `screenEffect` |
| `protected` | `float` | `horizontalSpeedMultiplier` |
| `protected` | `float` | `knockbackMultiplier` |
| `protected` | `String` | `soundEventIdLocal` |
| `protected transient` | `int` | `soundEventIndexLocal` |
| `protected` | `String` | `soundEventIdWorld` |
| `protected transient` | `int` | `soundEventIndexWorld` |
| `protected` | `String` | `modelVFXId` |
| `protected` | `MovementEffects` | `movementEffects` |
| `protected` | `AbilityEffects` | `abilityEffects` |
| `private` | `float` | `mouseSensitivityAdjustmentTarget` |
| `private` | `float` | `mouseSensitivityAdjustmentDuration` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `ApplicationEffects()` |
| `public` | `com.hypixel.hytale.protocol.ApplicationEffects` | `toPacket()` |
| `public` | `float` | `getHorizontalSpeedMultiplier()` |
| `public` | `float` | `getKnockbackMultiplier()` |
| `protected` | `void` | `processConfig()` |
| `public` | `String` | `toString()` |
