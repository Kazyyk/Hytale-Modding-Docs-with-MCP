---
title: "EntityFilterOr"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.EntityFilterOr"
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
public class EntityFilterOr extends EntityFilterBase
```

Composite filter returning true when at least one child filter matches (logical OR). Cost is the sum of child costs.
