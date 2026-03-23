---
title: "CraftingBench"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.CraftingBench"
api_surface: false
extends: "Bench"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "config"
  - "bench"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.bench`

```java
public class CraftingBench extends Bench
```

Concrete bench implementation for standard recipe-based crafting with grid dimensions and category filtering.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<CraftingBench>` | `CODEC` |
| `BuilderCodec<CraftingBench.BenchCategory>` | `CODEC` |
| `BuilderCodec<CraftingBench.BenchItemCategory>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CraftingBench.BenchCategory[]` | `getCategories()` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getIcon()` |
| `public` | `CraftingBench.BenchItemCategory[]` | `getItemCategories()` |
| `public` | `String` | `toString()` |
| `public` | `String` | `getDiagram()` |
| `public` | `int` | `getSlots()` |
| `public` | `boolean` | `isSpecialSlot()` |
