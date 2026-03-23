---
title: "SplitChanceBlockGrowthProcedure"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick.procedure"
fqcn: "com.hypixel.hytale.builtin.blocktick.procedure.SplitChanceBlockGrowthProcedure"
api_surface: false
extends: "BasicChanceBlockGrowthProcedure"
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
public class SplitChanceBlockGrowthProcedure extends BasicChanceBlockGrowthProcedure
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SplitChanceBlockGrowthProcedure>` | `CODEC` |
| `protected` | `int[]` | `chances` |
| `protected` | `String[]` | `data` |
| `protected` | `int` | `sumChances` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `boolean` | `executeToBlock(World world, int worldX, int worldY, int worldZ, String to)` |
| `@Nonnull @Override public` | `String` | `toString()` |
