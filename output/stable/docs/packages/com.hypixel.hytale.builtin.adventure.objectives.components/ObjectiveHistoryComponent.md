---
title: "ObjectiveHistoryComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.components"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.components.ObjectiveHistoryComponent"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "objectives"
  - "components"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.components`

```java
public class ObjectiveHistoryComponent implements Component<EntityStore>
```

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getObjectiveHistoryMap()` | `Map<String, ObjectiveHistoryData>` | Accessor method. |
| `getObjectiveLineHistoryMap()` | `Map<String, ObjectiveLineHistoryData>` | Accessor method. |
