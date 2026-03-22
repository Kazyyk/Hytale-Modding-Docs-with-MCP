---
title: "AmbiencePlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience"
fqcn: "com.hypixel.hytale.builtin.ambience.AmbiencePlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "ambience"
---

**Package:** `com.hypixel.hytale.builtin.ambience`

```java
public class AmbiencePlugin extends JavaPlugin
```

Plugin that registers systems, commands for the builtin subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_AMBIENT_EMITTER_MODEL` | `String` | Static final String field. |
| `instance` | `AmbiencePlugin` | Static AmbiencePlugin field. |
| `ambienceTrackerComponentType` | `ComponentType<EntityStore, AmbienceTracker>` | ComponentType<EntityStore, AmbienceTracker> field. |
| `ambientEmitterComponentType` | `ComponentType<EntityStore, AmbientEmitterComponent>` | ComponentType<EntityStore, AmbientEmitterComponent> field. |
| `ambienceResourceType` | `ResourceType<EntityStore, AmbienceResource>` | ResourceType<EntityStore, AmbienceResource> field. |
| `ambientEmitterModel` | `Model` | Model field. |

## Constructors

| Constructor | Description |
|---|---|
| `AmbiencePlugin(@Nonnull JavaPluginInit init)` | Creates a new AmbiencePlugin instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `AmbiencePlugin` | static public method. |
| `setup()` | `void` | protected method. |
| `start()` | `void` | protected method. |
| `getAmbienceTrackerComponentType()` | `ComponentType<EntityStore, AmbienceTracker>` | public method. |
| `getAmbientEmitterComponentType()` | `ComponentType<EntityStore, AmbientEmitterComponent>` | public method. |
| `getAmbienceResourceType()` | `ResourceType<EntityStore, AmbienceResource>` | public method. |
| `getAmbientEmitterModel()` | `Model` | public method. |
