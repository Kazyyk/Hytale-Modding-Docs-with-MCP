---
title: "InteractionPriority"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionPriority"
api_surface: true
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
public record InteractionPriority(@Nullable Map<PrioritySlot, Integer> values) implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionPriority>
```

Record holding per-slot priority values for interaction type precedence when multiple items are equipped.

## Record Components

```java
@Nullable Map<PrioritySlot, Integer> values
```

## Constants

| Type | Name |
|---|---|
| `Codec<InteractionPriority>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `record` | `InteractionPriority(@Nullable Map<PrioritySlot, Integer> values)` |
| `public` | `int` | `getPriority(PrioritySlot slot)` |
| `public` | `com.hypixel.hytale.protocol.InteractionPriority` | `toPacket()` |
