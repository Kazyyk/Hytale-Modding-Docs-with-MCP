---
title: "TimeInstrument"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments.TimeInstrument"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "newsystem"
  - "performanceinstruments"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments`

```java
public class TimeInstrument
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `sampleCount` |
| `@Nonnull private` | `TimeInstrument.Probe` | `totalProbe` |
| `private` | `String` | `header` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TimeInstrument(@Nonnull String header)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `takeSample(@Nonnull TimeInstrument.Probe probe)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull private` | `String` | `toString(int indentation, @Nonnull TimeInstrument.Probe probe)` |

## Inner Types

- `TimeInstrument.Probe`
