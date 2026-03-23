---
title: "SpawnMarkerBlock"
kind: "class"
package: "com.hypixel.hytale.server.spawning.blockstates"
fqcn: "com.hypixel.hytale.server.spawning.blockstates.SpawnMarkerBlock"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.component.Component"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "spawning"
  - "blockstates"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.blockstates`

```java
public class SpawnMarkerBlock implements Component<ChunkStore>
```

Chunk-store component that associates a block with a spawn marker entity. Holds a `PersistentRef` to the spawn marker and a configurable lost-marker timeout (default 30 seconds). Implements `Component<ChunkStore>` and is cloneable.
