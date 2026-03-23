---
title: "GroupPermissionChangeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.GroupPermissionChangeEvent"
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
public abstract class GroupPermissionChangeEvent implements IEvent<Void>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String` | `groupName` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `GroupPermissionChangeEvent(@Nonnull String groupName)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `getGroupName()` |

## Inner Types

- `GroupPermissionChangeEvent.Added`
- `GroupPermissionChangeEvent.Removed`
