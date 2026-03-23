---
title: "MetaRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.MetaRegistry"
api_surface: true
extends: null
implements: ["IMetaRegistry<K>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "meta"
---

**Package:** `com.hypixel.hytale.server.core.meta`

```java
public class MetaRegistry<K> implements IMetaRegistry<K>
```

Implements `IMetaRegistry` to provide MetaRegistry functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `Map<String, MetaRegistry.MetaRegistryEntry>` | `parameterMapping` | `new Object2ObjectOpenHashMap()` |
| `private final` | `List<MetaRegistry.MetaRegistryEntry>` | `suppliers` | `new ObjectArrayList()` |
| `private final` | `ReentrantReadWriteLock` | `lock` | `new ReentrantReadWriteLock()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public <T>` | `MetaKey<T>` | `registerMetaObject(Function<K, T> function, boolean persistent, String keyName, @Nonnull Codec<T> codec)` |
| `@Override public <T>` | `T` | `newMetaObject(@Nonnull MetaKey<T> key, K parent)` |
| `@Override public` | `void` | `forEachMetaEntry(@Nonnull IMetaStore<K> store, @Nonnull final IMetaRegistry.MetaEntryConsumer consumer)` |
| `@Nullable @Override public` | `PersistentMetaKey<?>` | `getMetaKeyForCodecKey(String codecKey)` |
