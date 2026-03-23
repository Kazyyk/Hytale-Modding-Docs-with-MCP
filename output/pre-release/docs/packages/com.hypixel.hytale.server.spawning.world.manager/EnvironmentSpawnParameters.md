---
title: "EnvironmentSpawnParameters"
kind: "class"
package: "com.hypixel.hytale.server.spawning.world.manager"
fqcn: "com.hypixel.hytale.server.spawning.world.manager.EnvironmentSpawnParameters"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "spawning"
  - "world"
  - "manager"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.world.manager`

```java
public class EnvironmentSpawnParameters
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `density` |
| `private final` | `Set<WorldSpawnWrapper>` | `spawnWrappers` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `EnvironmentSpawnParameters(double density)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Set<WorldSpawnWrapper>` | `getSpawnWrappers()` |
| `public` | `double` | `getSpawnDensity()` |
| `public` | `void` | `setDensity(double density)` |
