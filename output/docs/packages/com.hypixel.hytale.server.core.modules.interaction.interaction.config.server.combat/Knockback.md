---
title: "Knockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.Knockback"
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
public abstract class Knockback
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `force` |
| `protected` | `float` | `duration` |
| `protected` | `ChangeVelocityType` | `velocityType` |
| `private` | `VelocityConfig` | `velocityConfig` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `Knockback()` |
| `public` | `float` | `getForce()` |
| `public` | `float` | `getDuration()` |
| `public` | `ChangeVelocityType` | `getVelocityType()` |
| `public` | `VelocityConfig` | `getVelocityConfig()` |
| `public abstract` | `Vector3d` | `calculateVector(Vector3d var1, float var2, Vector3d var3)` |
| `public` | `String` | `toString()` |
