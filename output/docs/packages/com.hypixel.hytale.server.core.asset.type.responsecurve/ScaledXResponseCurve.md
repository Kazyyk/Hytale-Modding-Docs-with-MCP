---
title: "ScaledXResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.ScaledXResponseCurve"
api_surface: false
extends: "ScaledResponseCurve"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "responsecurve"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.responsecurve`

```java
public class ScaledXResponseCurve extends ScaledResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ScaledXResponseCurve>` | `CODEC` |
| `public static final` | `double[]` | `DEFAULT_RANGE` |
| `protected` | `String` | `responseCurve` |
| `protected` | `ResponseCurve.Reference` | `responseCurveReference` |
| `protected` | `double[]` | `xRange` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getResponseCurve()` |
| `public` | `double[]` | `getXRange()` |
| `@Override public` | `double` | `computeY(double x)` |
| `protected` | `double` | `computeNormalisedY(double x)` |
| `@Nonnull @Override public` | `String` | `toString()` |
