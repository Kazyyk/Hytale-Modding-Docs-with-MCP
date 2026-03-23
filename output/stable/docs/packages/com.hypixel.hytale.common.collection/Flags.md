---
title: "Flags"
kind: "class"
package: "com.hypixel.hytale.common.collection"
fqcn: "com.hypixel.hytale.common.collection.Flags"
api_surface: false
extends: "Flag>"
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
public class Flags<T extends Flag>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `flags` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getFlags()` |
| `public` | `boolean` | `is(@Nonnull T flag)` |
| `public` | `boolean` | `not(@Nonnull T flag)` |
| `public` | `boolean` | `set(@Nonnull T flag, boolean value)` |
| `public` | `boolean` | `toggle(@Nonnull T flag)` |
| `@Override @Nonnull public` | `String` | `toString()` |
