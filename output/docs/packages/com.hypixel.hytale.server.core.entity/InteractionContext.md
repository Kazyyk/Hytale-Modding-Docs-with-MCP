---
title: "InteractionContext"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.InteractionContext"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class InteractionContext
```

Holds the full runtime context for an interaction chain execution. Tracks the held item (section ID, container, slot, stack), the owning and running-for entity references, the interaction manager, the current chain and entry, jump labels, a snapshot provider, and a `DynamicMetaStore` for interaction metadata. Provides methods for duplicating context, forking chains, and accessing interaction variables.
