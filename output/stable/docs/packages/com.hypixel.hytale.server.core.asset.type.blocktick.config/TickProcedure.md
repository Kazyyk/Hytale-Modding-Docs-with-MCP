---
title: "TickProcedure"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.asset.type.blocktick.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktick.config.TickProcedure"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "type"
  - "blocktick"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktick.config`

```java
public abstract class TickProcedure
```

Abstract base type in the TickProcedure hierarchy.

## Constants

| Constant | Type |
|---|---|
| `BASE_RANDOM` | `SplittableRandom` |
| `RANDOM` | `ThreadLocal<SplittableRandom>` |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getRandom()` | `SplittableRandom` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `onTick(World var1, WorldChunk var2, int var3, int var4, int var5, int var6)` | `abstract BlockTickStrategy` | Instance method. |
