---
title: "LogisticResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.config.LogisticResponseCurve"
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
public class LogisticResponseCurve extends ResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<LogisticResponseCurve>` | `CODEC` |
| `protected` | `double` | `rateOfChange` |
| `protected` | `double` | `ceiling` |
| `protected` | `double` | `horizontalShift` |
| `protected` | `double` | `verticalShift` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `LogisticResponseCurve(double rateOfChange, double ceiling, double horizontalShift, double verticalShift)` |
| `protected` | `LogisticResponseCurve()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `computeY(double x)` |
| `public` | `double` | `getRateOfChange()` |
| `public` | `double` | `getCeiling()` |
| `public` | `double` | `getHorizontalShift()` |
| `public` | `double` | `getVerticalShift()` |
| `@Nonnull @Override public` | `String` | `toString()` |
