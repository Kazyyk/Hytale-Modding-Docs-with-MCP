---
title: "WorldSlumber"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.resources"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.resources.WorldSlumber"
api_surface: false
extends: null
implements: ["WorldSleep"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "sleep"
  - "resources"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.resources`

```java
public final class WorldSlumber implements WorldSleep
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Instant` | `startInstant` |
| `private final` | `Instant` | `targetInstant` |
| `private final` | `InstantData` | `startInstantData` |
| `private final` | `InstantData` | `targetInstantData` |
| `private final` | `float` | `irlDurationSeconds` |
| `private` | `float` | `progressSeconds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Instant` | `getStartInstant()` |
| `@Nonnull public` | `Instant` | `getTargetInstant()` |
| `@Nonnull public` | `InstantData` | `getStartInstantData()` |
| `@Nonnull public` | `InstantData` | `getTargetInstantData()` |
| `public` | `float` | `getProgressSeconds()` |
| `public` | `void` | `incrementProgressSeconds(float seconds)` |
| `public` | `float` | `getIrlDurationSeconds()` |
| `@Nonnull public` | `SleepClock` | `createSleepClock()` |
