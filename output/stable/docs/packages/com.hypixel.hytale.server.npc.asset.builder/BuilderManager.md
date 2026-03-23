---
title: "BuilderManager"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderManager"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderManager
```

The central manager for loading, caching, validating, and hot-reloading NPC role JSON assets from asset packs. Maintains a concurrent cache of [BuilderInfo](BuilderInfo.md) entries indexed by integer IDs, a map of [BuilderFactory](BuilderFactory.md) instances by category class, and a case-insensitive name-to-index map.

The manager walks the `Server/NPC/Roles/` directory tree, parses each JSON file, selects the appropriate factory based on the `"Class"` key (defaulting to `"Role"`), creates and reads the builder, validates it, and caches it. It supports file-system monitoring for hot-reload during development.

## Constants

| Constant | Type | Value |
|---|---|---|
| `CONTENT_KEY` | `String` | `"Content"` |

## Key Fields

| Field | Type | Description |
|---|---|---|
| `builderCache` | `Int2ObjectConcurrentHashMap<BuilderInfo>` | Thread-safe builder cache indexed by integer ID. |
| `factoryMap` | `Map<Class<?>, BuilderFactory<?>>` | Builder factories keyed by category class. |
| `categoryNames` | `Map<String, Class<?>>` | Category name to class mapping. |
| `nameToIndexMap` | `Object2IntMap<String>` | Case-insensitive name to index mapping. |
| `SCHEMA_BUILDER_MANAGER` | `BuilderManager` | Static instance used for schema generation. |

## Methods

### registerFactory

```java
public <T> void registerFactory(@Nonnull BuilderFactory<T> factory)
```

Registers a builder factory for a category. Called by `NPCPlugin` during setup.

### addCategory

```java
public void addCategory(String name, Class<?> clazz)
```

Maps a string name (e.g., `"Role"`, `"Action"`) to a category class.

### getIndex / getOrCreateIndex / lookupName

```java
public int getIndex(@Nullable String name)
public int getOrCreateIndex(String name)
@Nullable
public String lookupName(int index)
```

Name-to-index mapping with read/write locking for thread safety.

### loadBuilders

```java
public boolean loadBuilders(@Nonnull AssetPack pack, boolean includeTests)
```

Walks the NPC role asset directory, loads all JSON files, validates builders, resolves dependencies, and fires `AllNPCsLoadedEvent` on completion.

### unloadBuilders

```java
public void unloadBuilders(AssetPack pack)
```

Removes all builders loaded from the given asset pack.

### getFactory

```java
public <T> BuilderFactory<T> getFactory(Class<?> classType)
```

Returns the factory for the given category class.

### tryGetCachedValidBuilder / getCachedBuilder

```java
@Nullable
public <T> Builder<T> tryGetCachedValidBuilder(int index, Class<?> classType)
public <T> Builder<T> getCachedBuilder(int index, Class<?> classType)
```

Retrieves a cached, validated builder by index.

### setAutoReload

```java
public void setAutoReload(boolean autoReload)
```

Enables or disables file-system hot-reload.

## Related Types

- [BuilderInfo](BuilderInfo.md) -- cached builder metadata
- [BuilderFactory](BuilderFactory.md) -- creates builders by type
- [Builder](Builder.md) -- the builder interface
- [BuilderSupport](BuilderSupport.md) -- runtime context carrying a reference to this manager
