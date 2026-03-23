---
title: "DoorInteraction.DoorState"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DoorInteraction.DoorState"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "door"
  - "enum"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
private static enum DoorInteraction.DoorState
```

Represents the open/closed state of a door block within [DoorInteraction](DoorInteraction.md).

## Enum Constants

| Constant | Description |
|---|---|
| `CLOSED` | The door is closed. |
| `OPENED_IN` | The door is opened inward. |
| `OPENED_OUT` | The door is opened outward. |

## Methods

```java
@Nonnull
public static DoorInteraction.DoorState fromBlockState(@Nullable String state)
```

Converts a block state string to a `DoorState`. Maps `"OpenDoorOut"` to `OPENED_IN`, `"OpenDoorIn"` to `OPENED_OUT`, and all other values (including `null`) to `CLOSED`.

## See Also

- [DoorInteraction](DoorInteraction.md)
