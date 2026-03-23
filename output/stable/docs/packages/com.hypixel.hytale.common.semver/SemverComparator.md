---
title: "SemverComparator"
kind: "class"
package: "com.hypixel.hytale.common.semver"
fqcn: "com.hypixel.hytale.common.semver.SemverComparator"
api_surface: false
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
public class SemverComparator implements SemverSatisfies
```

Implements `SemverSatisfies` to provide SemverComparator functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `SemverComparator.ComparisonType` | `comparisonType` |
| `private final` | `Semver` | `compareTo` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SemverComparator(SemverComparator.ComparisonType comparisonType, Semver compareTo)` |
| `@Override public` | `boolean` | `satisfies(Semver semver)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `SemverComparator` | `fromString(String str)` |
