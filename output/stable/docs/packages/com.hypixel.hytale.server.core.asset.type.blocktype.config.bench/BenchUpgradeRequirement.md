---
title: "BenchUpgradeRequirement"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.BenchUpgradeRequirement"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.BenchUpgradeRequirement>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "config"
  - "bench"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.bench`

```java
public class BenchUpgradeRequirement implements NetworkSerializable<com.hypixel.hytale.protocol.BenchUpgradeRequirement>
```

Specifies an item requirement for upgrading a bench to the next tier.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<BenchUpgradeRequirement>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `MaterialQuantity[]` | `getInput()` |
| `public` | `float` | `getTimeSeconds()` |
| `public` | `String` | `toString()` |
| `public` | `com.hypixel.hytale.protocol.BenchUpgradeRequirement` | `toPacket()` |
