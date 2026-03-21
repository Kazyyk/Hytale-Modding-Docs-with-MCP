---
title: "IWorldGenBenchmark"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.worldgen"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.IWorldGenBenchmark"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldgen"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen`

```java
public interface IWorldGenBenchmark
```

Interface for worldgen benchmark operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `start()` |
| `` | `void` | `stop()` |
| `` | `CompletableFuture<String>` | `buildReport()` |
