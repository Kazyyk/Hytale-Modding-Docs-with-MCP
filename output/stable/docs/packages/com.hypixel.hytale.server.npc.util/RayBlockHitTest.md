---
title: "RayBlockHitTest"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.RayBlockHitTest"
api_surface: false
extends: ~
implements: ["BlockIterator.BlockIteratorProcedure"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class RayBlockHitTest implements BlockIterator.BlockIteratorProcedure
```

Thread-local utility for casting rays against the block world to find block hits. Iterates through blocks along a ray direction and checks against block sets, tracking the hit position and block revision.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `ThreadLocal<RayBlockHitTest> THREAD_LOCAL =` | `ThreadLocal.withInitial(RayBlockHitTest::new)` |
| `public` | `boolean` | `accept(int x, int y, int z, double px, double py, double pz, double qx, double qy, double qz)` |
| `public` | `Vector3d` | `getHitPosition()` |
| `public` | `short` | `getLastBlockRevision()` |
| `public` | `boolean` | `init(Ref<EntityStore> ref, int blockSet, float pitch, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `boolean` | `run(double range)` |
| `public` | `void` | `clear()` |
