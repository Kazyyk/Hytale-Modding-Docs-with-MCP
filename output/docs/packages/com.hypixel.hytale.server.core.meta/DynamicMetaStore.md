---
title: "DynamicMetaStore"
kind: "class"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.DynamicMetaStore"
api_surface: true
extends: "AbstractMetaStore<K>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "meta"
---

**Package:** `com.hypixel.hytale.server.core.meta`

```java
public class DynamicMetaStore<K> extends AbstractMetaStore<K>
```

Extends `AbstractMetaStore` to provide DynamicMetaStore functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `Int2ObjectMap<Object>` | `map` | `new Int2ObjectOpenHashMap()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `DynamicMetaStore(K parent, IMetaRegistry<K> registry)` |
| `public` | | `DynamicMetaStore(K parent, IMetaRegistry<K> registry, boolean bypassEncodedCache)` |
| `@Override protected <T>` | `T` | `get0(@Nonnull MetaKey<T> key)` |
| `@Override public <T>` | `T` | `getMetaObject(@Nonnull MetaKey<T> key)` |
| `@Override public <T>` | `T` | `getIfPresentMetaObject(@Nonnull MetaKey<T> key)` |
| `@Override public <T>` | `T` | `putMetaObject(@Nonnull MetaKey<T> key, T obj)` |
| `@Override public <T>` | `T` | `removeMetaObject(@Nonnull MetaKey<T> key)` |
| `@Nullable @Override public <T>` | `T` | `removeSerializedMetaObject(MetaKey<T> key)` |
| `@Override public` | `boolean` | `hasMetaObject(@Nonnull MetaKey<?> key)` |
| `@Override public` | `void` | `forEachMetaObject(@Nonnull IMetaStore.MetaEntryConsumer consumer)` |
| `@Nonnull public` | `DynamicMetaStore<K>` | `clone(K parent)` |
| `public` | `void` | `copyFrom(@Nonnull DynamicMetaStore<K> other)` |
