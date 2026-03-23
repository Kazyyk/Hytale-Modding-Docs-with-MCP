---
title: "EnvironmentRange"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.environment"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.environment.EnvironmentRange"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "environment"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.environment`

```java
public class EnvironmentRange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `min` |
| `private` | `int` | `max` |
| `private` | `int` | `id` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EnvironmentRange(int id)` |
| `public` | `` | `EnvironmentRange(int min, int max, int id)` |
| `public` | `int` | `getMin()` |
| `public` | `int` | `getMax()` |
| `public` | `int` | `getId()` |
| `public` | `int` | `height()` |
| `public` | `EnvironmentRange` | `copy()` |
| `public` | `String` | `toString()` |
