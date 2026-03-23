---
title: "ActiveEntityEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.effect"
fqcn: "com.hypixel.hytale.server.core.entity.effect.ActiveEntityEffect"
api_surface: false
extends: ~
implements: ["Damage.Source"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "effect"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.effect`

```java
public class ActiveEntityEffect implements Damage.Source
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `float` | `DEFAULT_DURATION` |
| `private static final` | `Message` | `MESSAGE_GENERAL_DAMAGE_CAUSES_UNKNOWN` |
| `protected` | `String` | `entityEffectId` |
| `protected` | `int` | `entityEffectIndex` |
| `protected` | `float` | `initialDuration` |
| `protected` | `float` | `remainingDuration` |
| `protected` | `boolean` | `infinite` |
| `protected` | `boolean` | `debuff` |
| `protected` | `String` | `statusEffectIcon` |
| `private` | `float` | `sinceLastDamage` |
| `private` | `boolean` | `hasBeenDamaged` |
| `protected` | `boolean` | `invulnerable` |
| `private` | `DamageCalculatorSystems.Sequence` | `sequentialHits` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, @Nonnull EntityStatMap entityStatMapComponent, float dt )` |
| `private` | `int` | `calculateCyclesToRun(@Nonnull EntityEffect entityEffect, float dt)` |
| `private static` | `void` | `tickStatChanges( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, @Nonnull EntityStatMap entityStatMapComponent, int cyclesToRun )` |
| `private` | `void` | `tickDamage( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, int cyclesToRun )` |
| `public` | `int` | `getEntityEffectIndex()` |
| `public` | `float` | `getInitialDuration()` |
| `public` | `float` | `getRemainingDuration()` |
| `public` | `boolean` | `isInfinite()` |
| `public` | `boolean` | `isDebuff()` |
| `public` | `boolean` | `isInvulnerable()` |
| `@Override @Nonnull public` | `Message` | `getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override @Nonnull public` | `String` | `toString()` |
