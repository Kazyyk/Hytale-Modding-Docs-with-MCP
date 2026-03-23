---
title: "AbbreviationMap.AbbreviationMapBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.AbbreviationMap.AbbreviationMapBuilder"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "command"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public static class AbbreviationMap.AbbreviationMapBuilder<Value>
```

Builder for `AbbreviationMap` instances. Allows registering string keys mapped to values, then builds an immutable `AbbreviationMap` that supports exact, prefix, and substring matching.

## Methods

```java
@Nonnull
public AbbreviationMap.AbbreviationMapBuilder<Value> put(@Nonnull String key, @Nonnull Value value)
```

Associates a key with a value. Keys are stored in lowercase. Throws `IllegalArgumentException` if the key already exists.

```java
@Nonnull
public AbbreviationMap<Value> build()
```

Builds and returns the immutable `AbbreviationMap`.

## Related Types

- `AbbreviationMap` -- the map type this builds
