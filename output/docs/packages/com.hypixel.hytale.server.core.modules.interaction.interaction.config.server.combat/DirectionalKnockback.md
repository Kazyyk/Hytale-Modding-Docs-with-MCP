---
title: "DirectionalKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DirectionalKnockback"
api_surface: false
extends: "Knockback"
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
public class DirectionalKnockback extends Knockback
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `relativeX` |
| `protected` | `float` | `velocityY` |
| `protected` | `float` | `relativeZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3d` | `calculateVector(@Nonnull Vector3d source, float yaw, @Nonnull Vector3d target)` |
| `public` | `String` | `toString()` |
