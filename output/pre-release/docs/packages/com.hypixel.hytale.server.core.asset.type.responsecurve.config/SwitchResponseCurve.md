---
title: "SwitchResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.config.SwitchResponseCurve"
api_surface: false
extends: "ResponseCurve"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "responsecurve"
  - "math"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.responsecurve.config`

```java
public class SwitchResponseCurve extends ResponseCurve
```

A response curve that returns one value below a switch point and another value at or above it. Produces a step function: `initialState` when `x < switchPoint`, `finalState` when `x >= switchPoint`. All three parameters are clamped to the range [0.0, 1.0].

## Fields

| Field | Type | Default | Range | Description |
|---|---|---|---|---|
| `initialState` | `double` | `0.0` | [0.0, 1.0] | Output value below the switch point |
| `finalState` | `double` | `1.0` | [0.0, 1.0] | Output value at and above the switch point |
| `switchPoint` | `double` | `0.0` | [0.0, 1.0] | The x value at which the output switches |

## Methods

```java
@Override
public double computeY(double x)
```

Returns `initialState` if `x < switchPoint`, otherwise returns `finalState`.

## Related Types

- `ResponseCurve` -- abstract base class
