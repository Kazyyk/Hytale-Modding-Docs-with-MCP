---
title: "EntityFilterAnd"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.EntityFilterAnd"
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
public class EntityFilterAnd extends EntityFilterBase
```

Composite filter returning true only when all child filters match (logical AND). Cost is the sum of child costs.
