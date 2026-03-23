---
title: "ScaledSwitchResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.ScaledSwitchResponseCurve"
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
public class ScaledSwitchResponseCurve extends ScaledResponseCurve
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ScaledSwitchResponseCurve>` | `CODEC` |
| `protected` | `double` | `initialState` |
| `protected` | `double` | `finalState` |
| `protected` | `double` | `switchPoint` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `computeY(double x)` |
| `@Nonnull @Override public` | `String` | `toString()` |
