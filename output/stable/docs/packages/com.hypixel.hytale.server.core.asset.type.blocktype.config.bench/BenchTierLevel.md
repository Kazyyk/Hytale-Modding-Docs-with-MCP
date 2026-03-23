---
title: "BenchTierLevel"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.BenchTierLevel"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.BenchTierLevel>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "config"
  - "bench"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.bench`

```java
public class BenchTierLevel implements NetworkSerializable<com.hypixel.hytale.protocol.BenchTierLevel>
```

Defines a single tier level of a crafting bench with an unlock interaction.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<BenchTierLevel>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getCraftingTimeReductionModifier()` |
| `public` | `BenchUpgradeRequirement` | `getUpgradeRequirement()` |
| `public` | `int` | `getExtraInputSlot()` |
| `public` | `int` | `getExtraOutputSlot()` |
| `public` | `com.hypixel.hytale.protocol.BenchTierLevel` | `toPacket()` |
