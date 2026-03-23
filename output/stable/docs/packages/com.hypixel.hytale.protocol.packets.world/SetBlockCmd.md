---
title: "SetBlockCmd"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SetBlockCmd"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol.packets.world`

```java
public class SetBlockCmd
```

Sub-structure used inside `ServerSetBlocks` packets. Represents a single block set command at a chunk-relative index.

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `short` | `index` |
| public | `int` | `blockId` |
| public | `short` | `filler` |
| public | `byte` | `rotation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SetBlockCmd` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
