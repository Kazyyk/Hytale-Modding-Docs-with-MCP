---
title: "ProcessingBench"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.ProcessingBench"
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
public class ProcessingBench extends Bench
```

Bench subclass for time-based processing operations such as smelting or refining.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<ProcessingBench>` | `CODEC` |
| `BuilderCodec<ProcessingBench.ExtraOutput>` | `CODEC` |
| `BuilderCodec<ProcessingBench.ProcessingSlot>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getIconItem()` |
| `public` | `String` | `getIcon()` |
| `public` | `String` | `getIconName()` |
| `public` | `String` | `getIconId()` |
| `public` | `ProcessingBench.ProcessingSlot[]` | `getInput(int tierLevel)` |
| `public` | `ProcessingBench.ProcessingSlot[]` | `getFuel()` |
| `public` | `int` | `getMaxFuel()` |
| `public` | `String` | `getFuelDropItemId()` |
| `public` | `int` | `getOutputSlotsCount(int tierLevel)` |
| `public` | `ProcessingBench.ExtraOutput` | `getExtraOutput()` |
| `public` | `String` | `getEndSoundEventId()` |
| `public` | `int` | `getEndSoundEventIndex()` |
| `public` | `boolean` | `shouldAllowNoInputProcessing()` |
| `public` | `boolean` | `equals(Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `MaterialQuantity[]` | `getOutputs()` |
| `public` | `int` | `getPerFuelItemsConsumed()` |
| `public` | `boolean` | `isIgnoredFuelSource(Item id)` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `String` | `getResourceTypeId()` |
| `public` | `boolean` | `shouldFilterValidIngredients()` |
