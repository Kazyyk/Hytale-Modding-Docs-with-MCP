---
title: "Timer"
kind: "enum"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.Timer"
api_surface: false
extends: ~
implements: ["Tickable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class Timer implements Tickable
```

A general-purpose NPC timer with tick-based decrement. Supports running, paused, and stopped states, random restart values, and repeating behavior.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setRate(double rate)` |
| `public` | `void` | `setMinRestartValue(double minRestartValue)` |
| `public` | `void` | `setMaxValue(double maxValue)` |
| `public` | `void` | `setValue(double v)` |
| `public` | `void` | `setRepeating(boolean repeating)` |
| `public` | `double` | `getValue()` |
| `public` | `boolean` | `isInitialised()` |
| `public` | `void` | `tick(float dt)` |
| `public` | `void` | `start(double minStartValue, double maxStartValue, double minRestartValue, double maxValue, double rate, boolean repeating)` |
| `public` | `void` | `resume()` |
| `public` | `void` | `pause()` |
| `public` | `void` | `addValue(double v)` |
| `public` | `void` | `stop()` |
| `public` | `void` | `restart()` |
| `public` | `boolean` | `isInState(Timer.TimerState s)` |
| `public` | `boolean` | `isPaused()` |
| `public` | `boolean` | `isRunning()` |
| `public` | `boolean` | `isStopped()` |
| `public` | `String` | `asText()` |
| `public` | `String` | `get()` |
