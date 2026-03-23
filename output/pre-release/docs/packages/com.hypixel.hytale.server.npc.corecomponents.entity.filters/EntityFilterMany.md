---
title: "EntityFilterMany"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.EntityFilterMany"
api_surface: false
extends: "EntityFilterBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "filter"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.filters`

```java
public class EntityFilterMany extends EntityFilterBase
```

Composite filter that evaluates multiple child filters and returns true based on a configurable threshold (e.g., at least N must match).
