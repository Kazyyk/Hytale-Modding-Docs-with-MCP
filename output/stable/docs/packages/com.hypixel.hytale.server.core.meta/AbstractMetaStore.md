---
title: "AbstractMetaStore"
kind: "class"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.AbstractMetaStore"
api_surface: true
extends: null
implements: ["IMetaStoreImpl<K>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "meta"
---

**Package:** `com.hypixel.hytale.server.core.meta`

```java
public abstract class AbstractMetaStore<K> implements IMetaStoreImpl<K>
```

Abstract base class providing shared logic for MetaStore implementations.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `K` | `parent` |
| `protected final` | `IMetaRegistry<K>` | `registry` |
| `@Nonnull private final` | `BsonDocument` | `unknownValues` |
| `@Nonnull private final` | `IntSet` | `notUnknownKeys` |
| `@Nullable private` | `BsonDocument` | `cachedEncoded` |
| `private` | `boolean` | `dirty` |
| `private` | `boolean` | `bypassEncodedCache` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractMetaStore(K parent, IMetaRegistry<K> registry, boolean bypassEncodedCache)` |
| `protected abstract <T>` | `T` | `get0(MetaKey<T> var1)` |
| `@Nonnull @Override public` | `IMetaStoreImpl<K>` | `getMetaStore()` |
| `@Override public` | `IMetaRegistry<K>` | `getRegistry()` |
| `@Override public` | `void` | `forEachUnknownEntry(BiConsumer<String, BsonValue> consumer)` |
| `@Override public final` | `void` | `markMetaStoreDirty()` |
| `@Override public final` | `boolean` | `consumeMetaStoreDirty()` |
| `protected <T>` | `T` | `decodeOrNewMetaObject(MetaKey<T> key)` |
| `protected <T>` | `boolean` | `tryDecodeUnknownKey(@Nonnull PersistentMetaKey<T> key)` |
| `@Nonnull @Override public` | `BsonDocument` | `encode(final ExtraInfo extraInfo)` |
| `@Override public` | `void` | `decode(@Nonnull BsonDocument document, ExtraInfo extraInfo)` |
