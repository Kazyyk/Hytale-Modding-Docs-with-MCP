---
title: "ArrayMetaStore"
kind: "class"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.ArrayMetaStore"
api_surface: false
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
public class ArrayMetaStore<K> extends AbstractMetaStore<K>
```

Extends `AbstractMetaStore` to provide ArrayMetaStore functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `Object` | `NO_ENTRY` | `new Object()` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `Object[]` | `array` | `ArrayUtil.emptyArray()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ArrayMetaStore(K parent, IMetaRegistry<K> registry)` |
| `public` | | `ArrayMetaStore(K parent, IMetaRegistry<K> registry, boolean bypassEncodedCache)` |
| `@Override protected <T>` | `T` | `get0(@Nonnull MetaKey<T> key)` |
| `@Override public <T>` | `T` | `getMetaObject(@Nonnull MetaKey<T> key)` |
| `@Nullable @Override public <T>` | `T` | `getIfPresentMetaObject(@Nonnull MetaKey<T> key)` |
| `@Nullable @Override public <T>` | `T` | `putMetaObject(@Nonnull MetaKey<T> key, T obj)` |
| `@Nullable @Override public <T>` | `T` | `removeMetaObject(@Nonnull MetaKey<T> key)` |
| `@Nullable @Override public <T>` | `T` | `removeSerializedMetaObject(@Nonnull MetaKey<T> key)` |
| `@Override public` | `boolean` | `hasMetaObject(@Nonnull MetaKey<?> key)` |
| `@Override public` | `void` | `forEachMetaObject(@Nonnull IMetaStore.MetaEntryConsumer consumer)` |
| `private <T>` | `void` | `resizeArray(T obj, int id)` |
