---
title: "PersistentMetaKey"
kind: "class"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.PersistentMetaKey"
api_surface: true
extends: "MetaKey<T>"
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
public class PersistentMetaKey<T> extends MetaKey<T>
```

Extends `MetaKey` to provide PersistentMetaKey functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `key` |
| `private final` | `Codec<T>` | `codec` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getKey()` |
| `public` | `Codec<T>` | `getCodec()` |
| `@Nonnull @Override public` | `String` | `toString()` |
