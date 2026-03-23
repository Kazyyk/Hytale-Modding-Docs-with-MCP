---
title: "BlockSpawnerTable"
kind: "class"
package: "com.hypixel.hytale.builtin.blockspawner"
fqcn: "com.hypixel.hytale.builtin.blockspawner.BlockSpawnerTable"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "blockspawner"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.blockspawner`

```java
public class BlockSpawnerTable implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockSpawnerTable>>
```

Implements `JsonAssetWithMap`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `IWeightedMap<BlockSpawnerEntry>` | `entries` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static DefaultAssetMap<String, BlockSpawnerTable>` | `getAssetMap()` |
| `` | `public String` | `getId()` |
| `` | `public IWeightedMap<BlockSpawnerEntry>` | `getEntries()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Override public` | `String` | `toString()` |
