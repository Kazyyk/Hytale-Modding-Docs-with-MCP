---
title: "AssetStoreIterator"
kind: "class"
package: "com.hypixel.hytale.assetstore.iterator"
fqcn: "com.hypixel.hytale.assetstore.iterator.AssetStoreIterator"
api_surface: false
extends: null
implements: ["Iterator", "Closeable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "assetstore"
  - "iterator"
  - "class"
---

**Package:** `com.hypixel.hytale.assetstore.iterator`

```java
public class AssetStoreIterator implements Iterator, Closeable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `List<AssetStore<?,?,?>>` | `list` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `hasNext()` |
| `@Nullable public` | `AssetStore<?,?,?>` | `next()` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `isWaitingForDependencies(AssetStore<?,?,?> assetStore)` |
| `public` | `boolean` | `isBeingWaitedFor(AssetStore<?,?,?> assetStore)` |
| `@Override public` | `void` | `close()` |
