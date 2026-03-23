---
title: "CheckUniqueItemUsageInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.CheckUniqueItemUsageInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "item"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class CheckUniqueItemUsageInteraction extends SimpleInstantInteraction
```

Checks whether the player has already used a unique item. If the held item's ID has been previously recorded in the player's `UniqueItemUsagesComponent`, the interaction fails and a notification is sent. Otherwise, the usage is recorded and the interaction succeeds. Waits for server data (`WaitForDataFrom.Server`).

## Codec Properties

Inherits all codec properties from `SimpleInstantInteraction`. No additional properties.

## Methods

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.Server`.

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Checks `UniqueItemUsagesComponent.hasUsedUniqueItem()` for the held item ID. If already used, sets state to `Failed` and sends a translated notification. Otherwise records the usage and sets state to `Finished`.

```java
@Override
public String toString()
```

## See Also

- `UniqueItemUsagesComponent` -- tracks per-player unique item usage records
- `NotificationUtil` -- sends the "already used" notification to the player
