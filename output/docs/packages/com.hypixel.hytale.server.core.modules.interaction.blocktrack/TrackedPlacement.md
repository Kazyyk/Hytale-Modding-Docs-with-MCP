---
title: "TrackedPlacement"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.blocktrack"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.blocktrack.TrackedPlacement"
api_surface: false
extends: ~
implements: 
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.blocktrack`

```java
public class TrackedPlacement implements Component<ChunkStore>
```

Implementation of `Component<ChunkStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `blockName` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `TrackedPlacement()` | Creates a new TrackedPlacement instance. |
| `TrackedPlacement(String blockName)` | Creates a new TrackedPlacement instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<ChunkStore, TrackedPlacement>` | static public method. |
| `clone()` | `Component<ChunkStore>` | public method. |
