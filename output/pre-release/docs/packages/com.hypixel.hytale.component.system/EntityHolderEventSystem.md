---
title: "EntityHolderEventSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.EntityHolderEventSystem"
api_surface: false
extends: "EcsEvent> extends EventSystem"
implements:
  - "QuerySystem<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class EntityHolderEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements QuerySystem<ECS_TYPE>
```

Abstract system that handles events dispatched on entity holders (Holder instances) in the ECS.
