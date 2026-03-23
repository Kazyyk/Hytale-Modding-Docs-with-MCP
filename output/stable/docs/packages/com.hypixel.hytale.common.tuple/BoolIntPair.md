---
title: "BoolIntPair"
kind: "class"
package: "com.hypixel.hytale.common.tuple"
fqcn: "com.hypixel.hytale.common.tuple.BoolIntPair"
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
public class BoolIntPair implements Comparable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `left` |
| `private final` | `int` | `right` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public final` | `boolean` | `getKey()` |
| `public` | `boolean` | `getLeft()` |
| `public final` | `int` | `getValue()` |
| `public` | `int` | `getRight()` |
| `public` | `int` | `compareTo(BoolIntPair other)` |
| `@Override public` | `int` | `hashCode()` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public` | `String` | `toString(String format)` |
| `@Nonnull public static` | `BoolIntPair` | `of(boolean left, int right)` |
