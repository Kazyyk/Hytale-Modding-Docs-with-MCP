---
title: "FlockPlayerMembership"
kind: "enum"
package: "com.hypixel.hytale.server.npc.movement"
fqcn: "com.hypixel.hytale.server.npc.movement.FlockPlayerMembership"
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
public enum FlockPlayerMembership implements Supplier<String>
```

## Enum Constants

| Constant |
|---|
| `Member` |
| `NotMember` |
| `Any` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `description` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `FlockPlayerMembership(String description)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `get()` |
