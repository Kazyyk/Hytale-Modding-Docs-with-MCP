---
title: "PlayerPermissionChangeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.PlayerPermissionChangeEvent"
api_surface: true
extends: ~
implements: ["IEvent<Void>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
  - "permissions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.event.events.permissions`

```java
public abstract class PlayerPermissionChangeEvent implements IEvent<Void>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `UUID` | `playerUuid` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `PlayerPermissionChangeEvent(@Nonnull UUID playerUuid)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `UUID` | `getPlayerUuid()` |

## Inner Types

- `PlayerPermissionChangeEvent.GroupAdded`
- `PlayerPermissionChangeEvent.GroupRemoved`
- `PlayerPermissionChangeEvent.PermissionsAdded`
- `PlayerPermissionChangeEvent.PermissionsRemoved`
