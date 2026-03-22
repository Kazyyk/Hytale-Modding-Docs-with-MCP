---
title: "NavState"
kind: "enum"
package: "com.hypixel.hytale.server.npc.movement"
fqcn: "com.hypixel.hytale.server.npc.movement.NavState"
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
public enum NavState implements Supplier<String>
```

## Enum Constants

| Constant |
|---|
| `INIT` |
| `PROGRESSING` |
| `BLOCKED` |
| `DEFER` |
| `AT_GOAL` |
| `ABORTED` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `description` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `NavState(String description)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `get()` |
