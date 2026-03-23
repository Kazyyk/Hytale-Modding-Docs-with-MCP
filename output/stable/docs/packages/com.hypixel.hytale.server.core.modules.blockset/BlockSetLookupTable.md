---
title: "BlockSetLookupTable"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockset"
fqcn: "com.hypixel.hytale.server.core.modules.blockset.BlockSetLookupTable"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "blockset"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockset`

```java
public class BlockSetLookupTable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Object2ObjectMap<String, IntSet>` | `blockNameIdMap` |
| `@Nonnull private final` | `Object2ObjectMap<String, IntSet>` | `groupNameIdMap` |
| `@Nonnull private final` | `Object2ObjectMap<String, IntSet>` | `hitboxNameIdMap` |
| `@Nonnull private final` | `Object2ObjectMap<String, IntSet>` | `categoryIdMap` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockSetLookupTable(@Nonnull Map<String, BlockType> blockTypeMap)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addAll(@Nonnull IntSet result)` |
| `@Nonnull public` | `Object2ObjectMap<String, IntSet>` | `getBlockNameIdMap()` |
| `@Nonnull public` | `Object2ObjectMap<String, IntSet>` | `getGroupNameIdMap()` |
| `@Nonnull public` | `Object2ObjectMap<String, IntSet>` | `getHitboxNameIdMap()` |
| `@Nonnull public` | `Object2ObjectMap<String, IntSet>` | `getCategoryIdMap()` |
| `public` | `boolean` | `isEmpty()` |
