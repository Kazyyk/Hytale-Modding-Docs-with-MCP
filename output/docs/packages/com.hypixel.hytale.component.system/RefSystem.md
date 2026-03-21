---
title: "RefSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.RefSystem"
api_surface: true
extends: "System<ECS_TYPE>"
implements: ["QuerySystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class RefSystem<ECS_TYPE> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `onEntityAdded(@Nonnull Ref<ECS_TYPE> var1, @Nonnull AddReason var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)` |
| `public abstract` | `void` | `onEntityRemove(@Nonnull Ref<ECS_TYPE> var1, @Nonnull RemoveReason var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)` |
