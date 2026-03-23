---
title: "CircularDependencyException"
kind: "class"
package: "com.hypixel.hytale.assetstore.iterator"
fqcn: "com.hypixel.hytale.assetstore.iterator.CircularDependencyException"
api_surface: false
extends: "RuntimeException"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "assetstore"
  - "iterator"
  - "class"
---

**Package:** `com.hypixel.hytale.assetstore.iterator`

```java
public class CircularDependencyException extends RuntimeException
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected static` | `String` | `makeMessage(Collection<AssetStore<?,?,?>> values, AssetStoreIterator iterator)` |
