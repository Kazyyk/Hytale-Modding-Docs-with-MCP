---
title: "SeedString"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.SeedString"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public class SeedString<T extends SeedResource>
```

Wraps a seed value as a string with a `SeedResource` reference. Seed strings are used throughout the procedural generation system to derive deterministic hash values. The hash is computed as `seed.hashCode() * 114512143`.

## Type Parameters

- `T` -- the seed resource type

## Fields

| Field | Type | Description |
|---|---|---|
| `t` | `T` | The backing seed resource. |
| `original` | `String` | The original seed string before any appending. |
| `seed` | `String` | The current (possibly appended) seed string. |
| `hash` | `int` | Precomputed hash value. |

## Static Fields

```java
public static final SeedResource DEFAULT_RESOURCE = new SeedResource() {}
```

## Constructors

```java
public SeedString(String original, @Nonnull T t)
public SeedString(String original, String seed, @Nonnull T t)
```

## Methods

| Method | Returns | Description |
|---|---|---|
| `append(String suffix)` | `SeedString<T>` | Creates a new seed string by appending to the current seed. |
| `appendToOriginal(String suffix)` | `SeedString<T>` | Creates a new seed string by appending to the original, then re-deriving the seed. |
| `alternateOriginal(String suffix)` | `SeedString<T>` | Creates a new seed with an alternate original prefix. |
| `get()` | `T` | Returns the backing seed resource. |
| `hashCode()` | `int` | Returns the precomputed hash. |
| `toString()` | `String` | Returns the current seed string. |

## Related Types

- [SeedResource](SeedResource.md) -- the resource interface this wraps
- [Loader](Loader.md) -- base loader using seed strings
