---
title: "PlayerGroupEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.PlayerGroupEvent"
api_surface: true
extends: "PlayerPermissionChangeEvent"
implements: []
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
public class PlayerGroupEvent extends PlayerPermissionChangeEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String` | `groupName` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PlayerGroupEvent(@Nonnull UUID playerUuid, @Nonnull String groupName)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `getGroupName()` |

## Inner Types

- `PlayerGroupEvent.Added`
- `PlayerGroupEvent.Removed`
