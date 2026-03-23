---
title: "SemverRange"
kind: "class"
package: "com.hypixel.hytale.common.semver"
fqcn: "com.hypixel.hytale.common.semver.SemverRange"
api_surface: true
extends: null
implements: ["SemverSatisfies"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "common"
  - "semver"
---

**Package:** `com.hypixel.hytale.common.semver`

```java
public class SemverRange implements SemverSatisfies
```

Implements `SemverSatisfies` to provide SemverRange functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Codec<SemverRange>` | `CODEC` | `new FunctionCodec<>(Codec.STRING, SemverRange::fromString, SemverRange::toString)` |
| `public static final` | `SemverRange` | `WILDCARD` | `new SemverRange(new SemverSatisfies[0], true)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `SemverSatisfies[]` | `comparators` |
| `private final` | `boolean` | `and` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SemverRange(SemverSatisfies[] comparators, boolean and)` |
| `@Override public` | `boolean` | `satisfies(Semver semver)` |
| `@Override public` | `String` | `toString()` |
| `@Nonnull public static` | `SemverRange` | `fromString(String str)` |
| `@Nonnull public static` | `SemverRange` | `fromString(String str, boolean strict)` |
