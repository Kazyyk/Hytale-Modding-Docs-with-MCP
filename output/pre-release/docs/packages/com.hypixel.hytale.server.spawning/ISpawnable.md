---
title: "ISpawnable"
kind: "interface"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.ISpawnable"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.spawning`

```java
public interface ISpawnable
```

Contract for entities that can be spawned via the spawning system. Requires an identifier and a spawn validation method that tests whether the entity can spawn at a given `SpawningContext`.
