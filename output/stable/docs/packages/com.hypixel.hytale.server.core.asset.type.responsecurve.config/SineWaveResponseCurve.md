---
title: "SineWaveResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.config.SineWaveResponseCurve"
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
public class SineWaveResponseCurve extends ResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SineWaveResponseCurve>` | `CODEC` |
| `protected` | `double` | `amplitude` |
| `protected` | `double` | `frequency` |
| `protected` | `double` | `horizontalShift` |
| `protected` | `double` | `verticalShift` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `SineWaveResponseCurve()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `computeY(double x)` |
| `public` | `double` | `getAmplitude()` |
| `public` | `double` | `getFrequency()` |
| `public` | `double` | `getHorizontalShift()` |
| `public` | `double` | `getVerticalShift()` |
| `@Nonnull @Override public` | `String` | `toString()` |
