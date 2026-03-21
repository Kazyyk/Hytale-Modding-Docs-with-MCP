---
title: "ResourceViewManager"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.resource"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.resource.ResourceViewManager"
api_surface: false
extends: "BlockRegionViewManager"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
  - "resource"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.resource`

```java
public class ResourceViewManager extends BlockRegionViewManager
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `ResourceView` | `createView(long index, Blackboard blackboard)` |
| `protected` | `boolean` | `shouldCleanup(ResourceView view)` |
