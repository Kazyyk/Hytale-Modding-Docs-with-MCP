---
title: "ISpawnableWithModel"
kind: "interface"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.ISpawnableWithModel"
api_surface: false
extends: "ISpawnable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "interface"
  - "model"
---

**Package:** `com.hypixel.hytale.server.spawning`

```java
public interface ISpawnableWithModel extends ISpawnable
```

Extension of [ISpawnable](ISpawnable.md) that adds model-related spawn requirements. Provides methods for resolving the spawn model name, creating execution and modifier scopes for expression evaluation, and querying memory and translation metadata. Used by `SpawningContext` to resolve bounding boxes for spawn position validation.
