---
title: "KnockbackComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.knockback"
fqcn: "com.hypixel.hytale.server.core.entity.knockback.KnockbackComponent"
api_surface: true
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "knockback"
---

**Package:** `com.hypixel.hytale.server.core.entity.knockback`

```java
public class KnockbackComponent implements Component<EntityStore>
```

An `EntityStore` component storing KnockbackComponent-related data on entities.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private` | `Vector3d` | `velocity` |  |
| `private` | `ChangeVelocityType` | `velocityType` | `ChangeVelocityType.Add` |
| `@Nullable private` | `VelocityConfig` | `velocityConfig` |  |
| `@Nonnull private` | `DoubleList` | `modifiers` | `new DoubleArrayList()` |
| `private` | `float` | `duration` |  |
| `private` | `float` | `timer` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, KnockbackComponent>` | `getComponentType()` |
| `@Nonnull public` | `Vector3d` | `getVelocity()` |
| `public` | `void` | `setVelocity(@Nonnull Vector3d velocity)` |
| `public` | `ChangeVelocityType` | `getVelocityType()` |
| `public` | `void` | `setVelocityType(ChangeVelocityType velocityType)` |
| `@Nullable public` | `VelocityConfig` | `getVelocityConfig()` |
| `public` | `void` | `setVelocityConfig(@Nullable VelocityConfig velocityConfig)` |
| `public` | `void` | `addModifier(double modifier)` |
| `public` | `void` | `applyModifiers()` |
| `public` | `float` | `getDuration()` |
| `public` | `void` | `setDuration(float duration)` |
| `public` | `float` | `getTimer()` |
| `public` | `void` | `incrementTimer(float time)` |
| `public` | `void` | `setTimer(float time)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
