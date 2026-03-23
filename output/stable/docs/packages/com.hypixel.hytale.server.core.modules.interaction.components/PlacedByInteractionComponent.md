---
title: "PlacedByInteractionComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.components"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.components.PlacedByInteractionComponent"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "modules"
  - "interaction"
  - "components"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.components`

```java
public class PlacedByInteractionComponent implements Component<ChunkStore>
```

ECS component stored in `ChunkStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<ChunkStore, PlacedByInteractionComponent>` | Accessor method. |
| `getWhoPlacedUuid()` | `UUID` | Accessor method. |
