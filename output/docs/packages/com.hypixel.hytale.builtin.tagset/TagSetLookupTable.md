---
title: "TagSetLookupTable"
kind: "class"
package: "com.hypixel.hytale.builtin.tagset"
fqcn: "com.hypixel.hytale.builtin.tagset.TagSetLookupTable"
api_surface: false
extends: "TagSet>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "tags"
---

**Package:** `com.hypixel.hytale.builtin.tagset`

```java
public class TagSetLookupTable<T extends TagSet>
```

Concrete implementation extending `TagSet>`.

## Constructors

| Constructor | Description |
|---|---|
| `TagSetLookupTable(@Nonnull Map<String, T> tagSetMap, @Nonnull Object2IntMap<String> tagSetIndexMap, @Nonnull Object2IntMap<String> tagIndexMap)` | Creates a new TagSetLookupTable instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `createTagMap(@Nonnull Map<String, T> tagSetMap, @Nonnull Object2IntMap<String> tagSetIndexMap, @Nonnull Object2IntMap<String> tagIndexMap)` | `void` | private method. |
| `consumeTag(@Nonnull String tag, @Nonnull T tagSet, @Nonnull Object2IntMap<String> tagIndexMap, @Nonnull IntConsumer predicate)` | `void` | private method. |
| `getFlattenedSet()` | `Int2ObjectMap<IntSet>` | public method. |
