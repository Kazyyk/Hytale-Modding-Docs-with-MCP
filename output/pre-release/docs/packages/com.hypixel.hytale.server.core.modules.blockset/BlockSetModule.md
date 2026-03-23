---
title: "BlockSetModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockset"
fqcn: "com.hypixel.hytale.server.core.modules.blockset.BlockSetModule"
api_surface: false
extends: "JavaPlugin"
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
@Deprecated(forRemoval = true) public class BlockSetModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static` | `BlockSetModule` | `INSTANCE` |
| `@Nonnull private` | `Int2ObjectMap<IntSet>` | `flattenedBlockSets` |
| `@Nonnull private` | `Int2ObjectMap<IntSet>` | `unmodifiableFlattenedBlockSets` |
| `private` | `BlockSetLookupTable` | `blockSetLookupTable` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockSetModule(@Nonnull JavaPluginInit module)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `setup()` |
| `private` | `void` | `onBlockTypesChanged(@Nonnull LoadedAssetsEvent<String, BlockType, BlockTypeAssetMap<String, BlockType>> event)` |
| `private` | `void` | `onBlockSetsChanged(LoadedAssetsEvent<String, BlockSet, DefaultAssetMap<String, BlockSet>> event)` |
| `@Nonnull private` | `Int2ObjectMap<IntSet>` | `flattenBlockSets(@Nonnull BlockSetLookupTable lookupTable)` |
| `@Nonnull private` | `IntOpenHashSet` | `createSet(@Nonnull BlockSet blockSet, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Int2ObjectMap<IntSet> flattenedSets)` |
| `private` | `void` | `consume(@Nullable String[] values, @Nonnull Map<String, IntSet> map, String typeString, @Nonnull Consumer<IntSet> addAll)` |
| `private` | `void` | `consume(@Nullable String[][] values, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Consumer<IntSet> addAll)` |
| `@Nonnull private` | `IntOpenHashSet` | `createSet(String name, @Nonnull BlockSetLookupTable lookupTable, @Nonnull Int2ObjectMap<IntSet> flattenedSets)` |
| `private` | `void` | `consumeCategory(@Nullable String[] categories, @Nonnull Consumer<IntSet> predicate, @Nonnull BlockSetLookupTable lookupTable)` |
| `private` | `void` | `consumeEntry(@Nonnull String name, @Nonnull Consumer<IntSet> predicate, @Nonnull Map<String, IntSet> nameIdMap, String typeString)` |
| `@Nonnull public` | `Int2ObjectMap<IntSet>` | `getBlockSets()` |
| `public` | `boolean` | `blockInSet(int set, int blockId)` |
| `public` | `boolean` | `blockInSet(int set, @Nullable BlockType blockType)` |
| `public` | `boolean` | `blockInSet(int set, @Nullable String blockTypeKey)` |
| `public static` | `BlockSetModule` | `getInstance()` |
