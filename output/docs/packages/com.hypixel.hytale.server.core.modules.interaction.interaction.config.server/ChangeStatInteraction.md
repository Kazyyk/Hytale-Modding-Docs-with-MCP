---
title: "ChangeStatInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatBaseInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "entity-stats"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class ChangeStatInteraction extends ChangeStatBaseInteraction
```

Changes the given entity stats directly. On first run, retrieves the `EntityStatMap` component from the interacting entity and calls `processStatChanges` with the configured stat modifiers, value type, and behaviour. Uses `EntityStatMap.Predictable.SELF` for prediction.

## Codec Properties

Inherits all codec properties from [ChangeStatBaseInteraction](ChangeStatBaseInteraction.md). No additional properties.

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Retrieves the `EntityStatMap` from the entity's `EntityStore` command buffer and applies stat changes.

```java
@Nonnull
@Override
protected Interaction generatePacket()
```

Returns a new `com.hypixel.hytale.protocol.ChangeStatInteraction` packet.

```java
@Override
protected void configurePacket(Interaction packet)
```

Populates the protocol packet with `statModifiers`, `valueType`, `changeStatBehaviour`, and `entityTarget`.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [ChangeStatBaseInteraction](ChangeStatBaseInteraction.md) -- parent class providing shared codec fields
- [ChangeStatWithModifierInteraction](ChangeStatWithModifierInteraction.md) -- variant that applies armor-based modifiers
