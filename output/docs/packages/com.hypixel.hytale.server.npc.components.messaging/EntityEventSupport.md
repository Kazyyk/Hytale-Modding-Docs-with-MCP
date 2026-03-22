---
title: "EntityEventSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.EntityEventSupport"
api_surface: false
extends: "EventSupport<EntityEventType, EntityEventNotification>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "messaging"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components.messaging`

```java
public abstract class EntityEventSupport extends EventSupport<EntityEventType, EntityEventNotification>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `postMessage(EntityEventType type, @Nonnull EntityEventNotification notification, @Nonnull Ref<EntityStore> parent, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `hasFlockMatchingMessage(int messageIndex, @Nonnull Vector3d parentPosition, double range, boolean flockOnly)` |
