---
title: "PairCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.codec"
fqcn: "com.hypixel.hytale.server.core.codec.PairCodec"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.codec`

```java
public class PairCodec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Integer` | `left` |
| `private` | `Integer` | `right` |
| `private` | `Integer` | `left` |
| `private` | `String` | `right` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Pair<Integer, Integer>` | `toPair()` |
| `@Nonnull public static` | `PairCodec.IntegerPair` | `fromPair(@Nonnull Pair<Integer, Integer> pair)` |
| `public` | `Integer` | `getLeft()` |
| `public` | `Integer` | `getRight()` |
| `@Nonnull public` | `Pair<Integer, String>` | `toPair()` |
| `@Nonnull public static` | `PairCodec.IntegerStringPair` | `fromPair(@Nonnull Pair<Integer, String> pair)` |
| `public` | `String` | `getRight()` |

## Inner Types

- `PairCodec.IntegerPair`
- `PairCodec.IntegerStringPair`
