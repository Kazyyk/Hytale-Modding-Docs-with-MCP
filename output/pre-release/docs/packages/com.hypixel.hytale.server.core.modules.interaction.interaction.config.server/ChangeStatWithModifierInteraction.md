---
title: "ChangeStatWithModifierInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatWithModifierInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatBaseInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "entity-stats"
  - "combat"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class ChangeStatWithModifierInteraction extends ChangeStatBaseInteraction
```

Changes entity stats with adjustments based on equipped armor modifiers. On first run, iterates the target entity's armor container and collects flat (additive) and multiplier modifiers for the configured `InteractionModifierId`. The base stat values are adjusted by adding the flat modifier and then multiplying by `max(0, 1 - multiplierModifier)`. Uses `EntityStatMap.Predictable.NONE` for prediction.

## Codec Properties

Inherits all codec properties from [ChangeStatBaseInteraction](ChangeStatBaseInteraction.md), plus:

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `InteractionModifierId` | `ItemArmor.InteractionModifierId` enum | Yes | -- | Identifies which armor interaction modifier to apply. |

## Fields

| Type | Name | Description |
|---|---|---|
| `ItemArmor.InteractionModifierId` | `interactionModifierId` | The armor modifier category used when computing adjustments. |

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Retrieves the `EntityStatMap`, clones the base stats, iterates equipped armor pieces to accumulate flat and multiplier modifiers per stat index, adjusts values, and calls `processStatChanges`.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [ChangeStatBaseInteraction](ChangeStatBaseInteraction.md) -- parent class
- [ChangeStatInteraction](ChangeStatInteraction.md) -- simpler variant without armor modifiers
