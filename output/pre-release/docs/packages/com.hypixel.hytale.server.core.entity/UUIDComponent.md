---
title: "UUIDComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.UUIDComponent"
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
public final class UUIDComponent implements Component<EntityStore>
```

An `EntityStore` component that stores a `UUID` for an entity. Provides `getUuid()`, static factory methods `generateVersion3UUID()` and `randomUUID()`, and a codec with non-null validation. The UUID is auto-generated during decode if null.
