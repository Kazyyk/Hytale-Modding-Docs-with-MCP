---
title: "BucketItemPool"
kind: "class"
package: "com.hypixel.hytale.common.collection"
fqcn: "com.hypixel.hytale.common.collection.BucketItemPool"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "common"
  - "collection"
  - "class"
---

**Package:** `com.hypixel.hytale.common.collection`

```java
public class BucketItemPool<E>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `List<BucketItem<E>>` | `pool` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `deallocate(BucketItem<E>[] entityHolders, int count)` |
| `public` | `BucketItem<E>` | `allocate(E reference, double squaredDistance)` |
