---
title: "SendMessageInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple.SendMessageInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple`

```java
public class SendMessageInteraction extends SimpleInstantInteraction
```

Interaction handler extending `SimpleInstantInteraction`.

## Fields

| Field | Type | Description |
|---|---|---|
| `key` | `String` | String field. |
| `message` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `SendMessageInteraction(@Nonnull String id, @Nonnull String message)` | Creates a new SendMessageInteraction instance. |
| `SendMessageInteraction()` | Creates a new SendMessageInteraction instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` | `void` | protected method. |
| `toString()` | `String` | public method. |
