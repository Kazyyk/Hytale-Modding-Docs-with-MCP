---
title: "BlockTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.BlockTarget"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public class BlockTarget
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Vector3d` | `position` |
| `private` | `int` | `chunkChangeRevision` |
| `private` | `int` | `foundBlockType` |
| `@Nullable private` | `ResourceView` | `reservationHolder` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Vector3d` | `getPosition()` |
| `public` | `int` | `getChunkChangeRevision()` |
| `public` | `int` | `getFoundBlockType()` |
| `public` | `void` | `setChunkChangeRevision(int chunkChangeRevision)` |
| `public` | `void` | `setFoundBlockType(int foundBlockType)` |
| `public` | `void` | `setReservationHolder(ResourceView resourceView)` |
| `public` | `void` | `reset(@Nonnull NPCEntity parent)` |
| `public` | `boolean` | `isActive()` |
