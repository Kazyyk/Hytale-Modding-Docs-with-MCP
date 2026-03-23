---
title: "Frozen"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.Frozen"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class Frozen implements Component<EntityStore>
```

Singleton marker `EntityStore` component indicating that an entity is frozen (immobilized). Uses a private constructor with a static `INSTANCE` and `get()` accessor. The `clone()` method returns the same singleton instance.
