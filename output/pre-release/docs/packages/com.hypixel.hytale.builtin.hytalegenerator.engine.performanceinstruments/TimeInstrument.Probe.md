---
title: "TimeInstrument.Probe"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments.TimeInstrument.Probe"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "performanceinstruments"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments`

```java
public static class TimeInstrument.Probe
```

A named nanosecond timer that supports hierarchical child probes. Measures elapsed time between `start()` and `stop()` calls. Child probes are created via `createProbe`. Compatible probes (same name and child structure) can be added together for aggregation across multiple samples.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [TimeInstrument.Probe.State](TimeInstrument.Probe.State.md) | enum | Probe lifecycle state |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String` | `name` |
| `private` | `long` | `startTime` |
| `private` | `long` | `totalTime_ns` |
| `private` | `TimeInstrument.Probe.State` | `state` |
| `private` | `List<TimeInstrument.Probe>` | `probes` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Probe(@Nonnull String name)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `TimeInstrument.Probe` | `start()` |
| `@Nonnull public` | `TimeInstrument.Probe` | `stop()` |
| `public` | `long` | `getTotalTime_ns()` |
| `@Nonnull public` | `String` | `getName()` |
| `@Nonnull public` | `List<TimeInstrument.Probe>` | `getProbes()` |
| `@Nonnull public` | `TimeInstrument.Probe` | `createProbe(@Nonnull String name)` |
| `public` | `boolean` | `isCompatibleForAddition(@Nonnull TimeInstrument.Probe other)` |
| `public` | `void` | `add(@Nonnull TimeInstrument.Probe probe)` |
