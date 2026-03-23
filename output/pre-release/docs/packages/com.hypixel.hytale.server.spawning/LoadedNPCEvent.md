---
title: "LoadedNPCEvent"
kind: "class"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.LoadedNPCEvent"
api_surface: false
implements: "IEvent<Void>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "event"
---

**Package:** `com.hypixel.hytale.server.spawning`

```java
public class LoadedNPCEvent implements IEvent<Void>
```

Event fired when an NPC builder info is loaded and confirmed to be spawnable. Validates that the associated builder implements [ISpawnableWithModel](ISpawnableWithModel.md). Carries the `BuilderInfo` instance for downstream listeners to process.
