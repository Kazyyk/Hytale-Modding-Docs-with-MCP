---
title: "SimpleInstantInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
api_surface: false
extends: "SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public abstract class SimpleInstantInteraction extends SimpleInteraction
```

Abstract interaction that executes its logic on the first tick only, then completes immediately.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<SimpleInstantInteraction>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected final` | `void` | `tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `protected` | `void` | `simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `protected abstract` | `void` | `firstRun(@Nonnull InteractionType var1, @Nonnull InteractionContext var2, @Nonnull CooldownHandler var3)` |
| `protected` | `void` | `simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `public` | `String` | `toString()` |
