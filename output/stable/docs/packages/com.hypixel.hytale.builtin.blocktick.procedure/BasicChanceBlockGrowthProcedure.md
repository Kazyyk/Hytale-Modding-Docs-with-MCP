---
title: "BasicChanceBlockGrowthProcedure"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick.procedure"
fqcn: "com.hypixel.hytale.builtin.blocktick.procedure.BasicChanceBlockGrowthProcedure"
api_surface: false
extends: "TickProcedure"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "blocktick"
  - "procedure"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.blocktick.procedure`

```java
public class BasicChanceBlockGrowthProcedure extends TickProcedure
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BasicChanceBlockGrowthProcedure>` | `CODEC` |
| `protected` | `int` | `chanceMin` |
| `protected` | `int` | `chance` |
| `protected` | `String` | `to` |
| `protected` | `boolean` | `nextTicking` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `BlockTickStrategy` | `onTick(World world, WorldChunk wc, int worldX, int worldY, int worldZ, int blockId)` |
| `protected` | `boolean` | `runChance()` |
| `protected` | `boolean` | `executeToBlock(World world, int worldX, int worldY, int worldZ, String to)` |
| `@Nonnull @Override public` | `String` | `toString()` |
