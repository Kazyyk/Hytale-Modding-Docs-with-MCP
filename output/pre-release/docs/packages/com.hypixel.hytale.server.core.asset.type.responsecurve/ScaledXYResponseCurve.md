---
title: "ScaledXYResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.ScaledXYResponseCurve"
api_surface: false
extends: "ScaledXResponseCurve"
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
public class ScaledXYResponseCurve extends ScaledXResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ScaledXYResponseCurve>` | `CODEC` |
| `protected` | `double[]` | `yRange` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double[]` | `getYRange()` |
| `@Override public` | `double` | `computeY(double x)` |
| `@Nonnull @Override public` | `String` | `toString()` |
