---
title: "MovementState"
kind: "enum"
package: "com.hypixel.hytale.server.npc.movement"
fqcn: "com.hypixel.hytale.server.npc.movement.MovementState"
api_surface: false
extends: ~
implements: ["Supplier<String>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "movement"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.npc.movement`

```java
public enum MovementState implements Supplier<String>
```

## Enum Constants

| Constant |
|---|
| `JUMPING` |
| `FLYING` |
| `CROUCHING` |
| `RUNNING` |
| `SPRINTING` |
| `FALLING` |
| `CLIMBING` |
| `WALKING` |
| `IDLE` |
| `ANY` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `name` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `MovementState(String name)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `get()` |
