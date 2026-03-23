---
title: "Semver"
kind: "class"
package: "com.hypixel.hytale.common.semver"
fqcn: "com.hypixel.hytale.common.semver.Semver"
api_surface: true
extends: null
implements: ["Comparable<Semver>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "common"
  - "semver"
---

**Package:** `com.hypixel.hytale.common.semver`

```java
public class Semver implements Comparable<Semver>
```

Implements `Comparable` to provide Semver functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Codec<Semver>` | `CODEC` | `new FunctionCodec<>(Codec.STRING, Semver::fromString, Semver::toString)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `long` | `major` |
| `private final` | `long` | `minor` |
| `private final` | `long` | `patch` |
| `private final` | `String[]` | `preRelease` |
| `private final` | `String` | `build` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Semver(long major, long minor, long patch)` |
| `public` | | `Semver(long major, long minor, long patch, String[] preRelease, String build)` |
| `public` | `long` | `getMajor()` |
| `public` | `long` | `getMinor()` |
| `public` | `long` | `getPatch()` |
| `public` | `String[]` | `getPreRelease()` |
| `public` | `String` | `getBuild()` |
| `public` | `boolean` | `satisfies(@Nonnull SemverRange range)` |
| `public` | `int` | `compareTo(@Nonnull Semver other)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `Semver` | `fromString(String str)` |
| `@Nonnull public static` | `Semver` | `fromString(String str, boolean strict)` |
| `private static` | `void` | `validateBuild(@Nullable String build)` |
| `private static` | `void` | `validatePreRelease(@Nullable String[] preRelease)` |
