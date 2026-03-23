---
title: "NameMatching"
kind: "enum"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.NameMatching"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "utility"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public enum NameMatching
```

Defines name matching strategies for finding entities/players by name. Each strategy combines a `Comparator<String>` (for scoring partial matches) and a `BiPredicate<String, String>` (for exact equality). Used by command completion and player lookup systems.

## Enum Constants

| Constant | Description |
|---|---|
| `EXACT` | Exact string equality (case-sensitive). |
| `EXACT_IGNORE_CASE` | Exact string equality (case-insensitive). |
| `STARTS_WITH` | Prefix match (case-sensitive), scored by length difference. |
| `STARTS_WITH_IGNORE_CASE` | Prefix match (case-insensitive), scored by length difference. |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static` | `NameMatching` | `DEFAULT` (= `STARTS_WITH_IGNORE_CASE`) |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Comparator<String>` | `getComparator()` |
| `@Nullable public` | `<T> T` | `find(@Nonnull Collection<T> players, String value, @Nonnull Function<T, String> getter)` |
| `@Nullable public static` | `<T> T` | `find(@Nonnull Collection<T> players, String value, @Nonnull Function<T, String> getter, @Nonnull Comparator<String> comparator, @Nonnull BiPredicate<String, String> equality)` |
