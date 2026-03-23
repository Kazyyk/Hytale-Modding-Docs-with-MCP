---
title: "BlockTagOrItemIdField"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.BlockTagOrItemIdField"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "task"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.task`

```java
public class BlockTagOrItemIdField
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BlockTagOrItemIdField>` | `CODEC` |
| `protected` | `String` | `blockTag` |
| `protected` | `int` | `blockTagIndex` |
| `protected` | `String` | `itemId` |
| `` | `BlockTagOrItemIdField` | `that` |
| `` | `int` | `result` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockTagOrItemIdField(String blockTag, String itemId)` |
| `protected` | `BlockTagOrItemIdField()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public int` | `getBlockTagIndex()` |
| `` | `public String` | `getItemId()` |
| `` | `public boolean` | `isBlockTypeIncluded(String blockTypeToCheck)` |
| `` | `public void` | `consumeItemStacks(@Nonnull ItemContainer container, int quantity)` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
