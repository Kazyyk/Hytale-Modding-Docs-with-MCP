---
title: "SimpleInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction"
api_surface: false
extends: "Interaction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class SimpleInteraction extends Interaction
```

Basic interaction with optional next/failed branching. Extends Interaction with compile-time operation graph construction.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<SimpleInteraction>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `protected` | `void` | `tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `protected` | `void` | `simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `public` | `void` | `compile(@Nonnull OperationsBuilder builder)` |
| `public` | `boolean` | `walk(@Nonnull Collector collector, @Nonnull InteractionContext context)` |
| `protected` | `com.hypixel.hytale.protocol.Interaction` | `generatePacket()` |
| `protected` | `void` | `configurePacket(com.hypixel.hytale.protocol.Interaction packet)` |
| `public` | `boolean` | `needsRemoteSync()` |
| `public` | `String` | `toString()` |
