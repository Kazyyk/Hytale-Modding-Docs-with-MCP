---
title: "IEntityByPriorityFilter"
kind: "interface"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.IEntityByPriorityFilter"
api_surface: false
extends: "TriPredicate"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public interface IEntityByPriorityFilter extends TriPredicate<Ref<EntityStore>, Ref<EntityStore>, ComponentAccessor<EntityStore>>
```

Interface extending `TriPredicate` for filtering entities by priority during NPC target selection. Provides initialization from a `Role`, highest-priority target retrieval, and cleanup.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `init(Role var1)` |
| | `Ref<EntityStore>` | `getHighestPriorityTarget()` |
| | `void` | `cleanup()` |
