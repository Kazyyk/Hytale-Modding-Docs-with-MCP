---
title: "InteractionTypeUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionTypeUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionTypeUtils
```

Utility constants and methods for interaction type defaults, including standard input sets, default blocked-by mappings, and collision type checks.

## Constants

| Type | Name |
|---|---|
| `Set<InteractionType>` | `STANDARD_INPUT` |
| `float` | `DEFAULT_COOLDOWN` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `float` | `getDefaultCooldown(@Nonnull InteractionType type)` |
| `public static` | `boolean` | `isCollisionType(@Nonnull InteractionType type)` |
