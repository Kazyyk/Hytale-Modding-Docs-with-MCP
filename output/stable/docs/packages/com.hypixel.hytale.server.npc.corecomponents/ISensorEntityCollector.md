---
title: "ISensorEntityCollector"
kind: "interface"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.ISensorEntityCollector"
api_surface: false
extends: "RoleStateChange"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public interface ISensorEntityCollector extends RoleStateChange
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `init(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nonnull ComponentAccessor<EntityStore> var3)` |
| `` | `void` | `collectMatching(@Nonnull Ref<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull ComponentAccessor<EntityStore> var3)` |
| `` | `void` | `collectNonMatching(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)` |
| `` | `boolean` | `terminateOnFirstMatch()` |
| `` | `void` | `cleanup()` |
