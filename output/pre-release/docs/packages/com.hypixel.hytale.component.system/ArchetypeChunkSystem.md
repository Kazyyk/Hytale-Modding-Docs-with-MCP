---
title: "ArchetypeChunkSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.ArchetypeChunkSystem"
api_surface: false
extends: "System<ECS_TYPE>"
implements: ["QuerySystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class ArchetypeChunkSystem<ECS_TYPE> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `onSystemAddedToArchetypeChunk(ArchetypeChunk<ECS_TYPE> var1)` |
| `public abstract` | `void` | `onSystemRemovedFromArchetypeChunk(ArchetypeChunk<ECS_TYPE> var1)` |
