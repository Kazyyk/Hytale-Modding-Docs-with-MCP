---
title: "EventMessage"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.EventMessage"
api_surface: false
extends: "NPCMessage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "messaging"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components.messaging`

```java
public class EventMessage extends NPCMessage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Vector3d` | `position` |
| `private final` | `double` | `maxRangeSquared` |
| `private` | `boolean` | `sameFlock` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `EventMessage(double maxRange)` |
| `private` | `EventMessage(@Nonnull Vector3d position, double maxRangeSquared, boolean sameFlock)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Vector3d` | `getPosition()` |
| `public` | `double` | `getMaxRangeSquared()` |
| `public` | `boolean` | `isSameFlock()` |
| `public` | `void` | `setSameFlock(boolean sameFlock)` |
| `public` | `void` | `activate(double x, double y, double z, Ref<EntityStore> target, double age)` |
| `@Nonnull public` | `EventMessage` | `clone()` |
