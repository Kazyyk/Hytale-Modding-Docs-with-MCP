---
title: "OpenPageInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenPageInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "ui"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenPageInteraction extends SimpleInstantInteraction
```

Opens a predefined page for the player. Supports optional usage validators registered per-page and a flag controlling whether the page can be closed through another interaction.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Page` | `Page` enum | Yes (inherited) | -- | The predefined page to open. |
| `CanCloseThroughInteraction` | `boolean` | No (inherited) | `false` | Whether this page can be closed by a subsequent interaction. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `Page` | `page` | -- | The target page enum value. |
| `boolean` | `canCloseThroughInteraction` | `false` | Close-through-interaction flag. |

## Static Methods

```java
public static void registerUsageValidator(Page page, OpenPageInteraction.PageUsageValidator validator)
```

Registers a validator that gates whether a specific page can be opened. The validator is checked before opening.

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Gets the player component, checks the usage validator (if registered), and calls `PageManager.setPage`.

## Inner Interfaces

- [PageUsageValidator](OpenPageInteraction.PageUsageValidator.md) -- functional interface for gating page access

## See Also

- `PageManager` -- manages page state for the player
