---
title: "BoolDoublePair"
kind: "class"
package: "com.hypixel.hytale.common.tuple"
fqcn: "com.hypixel.hytale.common.tuple.BoolDoublePair"
api_surface: false
extends: null
implements: ["Comparable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "common"
  - "tuple"
  - "class"
---

**Package:** `com.hypixel.hytale.common.tuple`

```java
public class BoolDoublePair implements Comparable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `left` |
| `private final` | `double` | `right` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public final` | `boolean` | `getKey()` |
| `public` | `boolean` | `getLeft()` |
| `public final` | `double` | `getValue()` |
| `public` | `double` | `getRight()` |
| `public` | `int` | `compareTo(BoolDoublePair other)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public` | `String` | `toString(String format)` |
| `@Nonnull public static` | `BoolDoublePair` | `of(boolean left, double right)` |
