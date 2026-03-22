---
title: "ExponentialResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.config.ExponentialResponseCurve"
api_surface: false
extends: "ResponseCurve"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "responsecurve"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.responsecurve.config`

```java
public class ExponentialResponseCurve extends ResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ExponentialResponseCurve>` | `CODEC` |
| `protected` | `double` | `slope` |
| `protected` | `double` | `exponent` |
| `protected` | `double` | `horizontalShift` |
| `protected` | `double` | `verticalShift` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ExponentialResponseCurve(double slope, double exponent, double horizontalShift, double verticalShift)` |
| `public` | `ExponentialResponseCurve(String id)` |
| `protected` | `ExponentialResponseCurve()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `computeY(double x)` |
| `public` | `double` | `getSlope()` |
| `public` | `double` | `getExponent()` |
| `public` | `double` | `getHorizontalShift()` |
| `public` | `double` | `getVerticalShift()` |
| `@Nonnull @Override public` | `String` | `toString()` |
